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
import model.m_jadwalBibit;
import model.m_user;
import view.homePetani;
import view.penjadwalanBibit;

/**
 *
 * @author Vin
 */
public class c_jadwalBibit {

    private m_jadwalBibit theModel;
    private penjadwalanBibit theView;

    public c_jadwalBibit(penjadwalanBibit theView, m_jadwalBibit theModel) throws SQLException {
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

    private class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = String.valueOf(fm.format(theView.getTanggal().getDate()));
            try {
                theModel.save("NULL,'" + theView.getPetani().getText() + "','" + tanggal + "'," + theView.getLuas().getText() + "");
                System.out.println("NULL,'" + theView.getPetani().getText() + "','" + tanggal + "','" + theView.getLuas().getText() + "'");
                theView.setAnalisa("Masa tanam dilakukan setidaknya 4 bulan dengan\ntambahan 2 minggu masa transisi, Lakukan\npembajakan lahan untuk membuat lahan tetap subur.\n"
                        + "Jangan lupa untuk selalu mengecek tanaman apabila\nterkena penyakit jika tanaman terkena penyakit anda\ndapat mengecek di menu Penyakit");
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
                Logger.getLogger(c_jadwalBibit.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

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

}
