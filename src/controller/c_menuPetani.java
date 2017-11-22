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
import model.m_jadwalBibit;
import model.m_jadwalPupuk;
import model.m_user;
import view.Pemupukan;
import view.homePetani;
import view.login;
import view.penjadwalanBibit;
import view.penjadwalanPupuk;

/**
 *
 * @author Vin
 */
public class c_menuPetani {

    private m_user theModel;
    private homePetani theView;

    public c_menuPetani(homePetani theView, m_user theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        this.theView.addJadwalPupukListener(new jadwalListener());
        this.theView.addPupukListener(new pupukListener());
        this.theView.addBibitListener(new bibitListener());
        this.theView.addPenyakitListener(new penyakitListener());
        this.theView.addLaporanListener(new laporanListener());
        this.theView.logoutListener(new logoutListener());
    }

    private class logoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            login a = new login();
            a.setVisible(true);

            try {
                c_user theController = new c_user(a, new m_user());
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }

    }

    private class jadwalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            penjadwalanPupuk a = new penjadwalanPupuk();
            a.setVisible(true);

            try {
                c_jadwalPupuk theController = new c_jadwalPupuk(a, new m_jadwalPupuk());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalPupuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class pupukListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Pemupukan a = new Pemupukan();
            a.setVisible(true);

            try {
                c_pupuk theController = new c_pupuk(a);
            } catch (SQLException ex) {
                Logger.getLogger(c_menuPetani.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class bibitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            penjadwalanBibit a = new penjadwalanBibit();
            a.setVisible(true);

            try {
                c_jadwalBibit theController = new c_jadwalBibit(a, new m_jadwalBibit());
            } catch (SQLException ex) {
                Logger.getLogger(c_jadwalBibit.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class penyakitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    private class laporanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

}
