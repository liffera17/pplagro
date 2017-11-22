/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_user;
import view.Pemupukan;
import view.homePetani;

/**
 *
 * @author Vin
 */
public class c_pupuk {

    private Pemupukan theView;

    public c_pupuk(Pemupukan theView) throws SQLException {
        this.theView = theView;
        theView.setVisible(true);
        this.theView.addCekListener(new cekListener());
        this.theView.backListener(new backListener());
        theView.getPetani().setText(c_user.nama);
        theView.getPupuk().setText(c_user.pupuk);
    }

    private class cekListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double hasil = Double.valueOf(theView.getPupuk().getText()) / 4;
            theView.setAnalisa("Pemupukan Dilakukan 4 Kali Dengan Dosis sebesar = " + hasil + " kg.");
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
