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
import model.m_feedback;
import model.m_feedback;
import model.m_penyakit;
import model.m_user;
import view.Pemupukan;
import view.homePetani;
import view.feedbackPenyakit;
import view.login;
import view.penyakit;

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
        this.theView.addPupukListener(new pupukListener());
        this.theView.addPenyakitListener(new penyakitListener());
        this.theView.addLaporanListener(new feedbackListener());
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

    private class penyakitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            penyakit a = new penyakit();
            a.setVisible(true);
            try {
                c_penyakit theController = new c_penyakit(a, new m_penyakit());
            } catch (SQLException ex) {
                Logger.getLogger(c_penyakit.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class feedbackListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            feedbackPenyakit a = new feedbackPenyakit();
            a.setVisible(true);
            try {
                c_feedback theController = new c_feedback(a, new m_feedback());
            } catch (SQLException ex) {
                Logger.getLogger(c_feedback.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

}
