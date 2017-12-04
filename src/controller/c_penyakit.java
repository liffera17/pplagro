/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_penyakit;
import model.m_user;
import view.homePetani;
import view.penyakit;

/**
 *
 * @author Vin
 */
public class c_penyakit {

    public penyakit theView;
    public m_penyakit theModel;

    c_penyakit(penyakit theView, m_penyakit theModel) throws SQLException {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        theView.setComboPenyakit(theModel.Penyakit());
        theView.addCekListener(new cekListener());
        theView.backListener(new backListener());
        theView.getPetani().setText(c_user.nama);
        theView.getLuas().setText(c_user.luas);
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            homePetani a = new homePetani();
            a.setVisible(true);

            try {
                c_menuPetani theController = new c_menuPetani(a, new m_user());
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            theView.dispose();
        }
 
    }

    private class cekListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (theView.getPenyakit().getSelectedIndex() == 0) {
                    theView.Message("Pastikan semua data terisi !");
                } else if (theView.getPenyakit().getSelectedIndex() == 1) {
                    theModel.Penyakit(1);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : " + theView.getPenyakit().getSelectedItem().toString()
                            + ", gunakan pestisida : " + theModel.getStatus().toString() + " untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 2) {
                    theModel.Penyakit(2);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : " + theView.getPenyakit().getSelectedItem().toString()
                            + ", gunakan pestisida : " + theModel.getStatus().toString() + " untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 3) {
                    theModel.Penyakit(3);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 4) {
                    theModel.Penyakit(4);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 5) {
                    theModel.Penyakit(5);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 6) {
                    theModel.Penyakit(6);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 7) {
                    theModel.Penyakit(7);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 8) {
                    theModel.Penyakit(8);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 9) {
                    theModel.Penyakit(9);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                } else if (theView.getPenyakit().getSelectedIndex() == 10) {
                    theModel.Penyakit(10);//1
                    theView.setAnalisa("Tanaman Anda diserang penyakit : "+ theView.getPenyakit().getSelectedItem().toString()+
                            ", gunakan pestisida : "+theModel.getStatus().toString()+" untuk mengatasi masalah tersebut.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_penyakit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
