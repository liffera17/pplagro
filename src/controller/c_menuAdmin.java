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
import model.m_kontrak;
import model.m_kualitas;
import model.m_pendaftaran;
import model.m_user;
import view.PakarKualitas;
import view.datakontrak;
import view.pendaftaran;
import view.homeAdmin;

/**
 *
 * @author Vin
 */
public class c_menuAdmin {

    private m_user theModel;
    private homeAdmin theView;

    public c_menuAdmin(homeAdmin theView, m_user theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        this.theView.addDaftarListener(new daftarListener());
        this.theView.addLaporanListener(new laporanListener());
        this.theView.addKontrakListener(new kontrakListener());
    }

    private class daftarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            pendaftaran a = new pendaftaran();
            a.setVisible(true);

            try {
                c_user theController = new c_user(a, new m_pendaftaran());
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class kontrakListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            datakontrak a = new datakontrak();
            a.setVisible(true);

            try {
                c_kontrak theController = new c_kontrak(a, new m_kontrak());
            } catch (SQLException ex) {
                Logger.getLogger(c_menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

    private class laporanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            PakarKualitas a = new PakarKualitas();
            a.setVisible(true);

            try {
                c_kualitas theController = new c_kualitas(a, new m_kualitas());
            } catch (SQLException ex) {
                Logger.getLogger(c_menuAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
    }

}
