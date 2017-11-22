/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_laporan;
import model.m_user;
import view.homePetani;
import view.lapPanenPetani;

/**
 *
 * @author Vin
 */
public class c_laporan {

    private m_laporan theModel;
    private lapPanenPetani theView;

    public c_laporan(lapPanenPetani theView, m_laporan theModel) throws SQLException {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        this.theView.addSimpanListener(new simpanListener());
        this.theView.addHapusListener(new hapusListener());
        this.theView.backListener(new backListener());
        theView.getTable().setModel(theModel.getTable());
        theView.getPetani().setText(c_user.nama);
        theView.getLuas().setText(c_user.luas);
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_menuPetani a = new c_menuPetani(new homePetani(), new m_user());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalBibit.class.getName()).log(Level.SEVERE, null, ex);
            }
            theView.dispose();
        }

    }

    private class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theModel.save("NULL,'" + theView.getPetani().getText() + "','" + theView.getJumlah().getText() + "'," + theView.getLuas().getText() + "");
                 theView.getTable().setModel(theModel.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class hapusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theModel.delete((String) theView.getTable().getValueAt(theView.getTable().getSelectedRow(), 0));
                theView.getTable().setModel(theModel.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalBibit.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }
}
