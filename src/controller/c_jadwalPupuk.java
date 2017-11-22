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
import model.m_jadwalPupuk;
import model.m_user;
import view.homePetani;
import view.penjadwalanPupuk;

/**
 *
 * @author Vin
 */
public class c_jadwalPupuk {

    private m_jadwalPupuk theModel;
    private penjadwalanPupuk theView;

    public c_jadwalPupuk(penjadwalanPupuk theView, m_jadwalPupuk theModel) throws SQLException {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        theView.addSimpanListener(new simpanListener());
        theView.addHapusListener(new hapusListener());
        theView.backListener(new backListener());
        theView.getTable().setModel(theModel.getTable());
        theView.getPetani().setText(c_user.nama);
    }

    private class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = String.valueOf(fm.format(theView.getTanggal().getDate()));
            try {
                theModel.save("NULL,'" + theView.getPetani().getText() + "','" + tanggal + "' ");
                theView.getTable().setModel(theModel.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalPupuk.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(c_jadwalPupuk.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_menuPetani a = new c_menuPetani(new homePetani(), new m_user());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalPupuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            theView.dispose();
        }

    }
}
