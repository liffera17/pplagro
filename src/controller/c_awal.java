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
import javax.swing.JOptionPane;
import model.m_user;
import view.homeAwal;
import view.login;

/**
 *
 * @author Vin
 */
public class c_awal {

    homeAwal theView;

    public c_awal(homeAwal theView) {
        this.theView = theView;
        theView.setVisible(true);
        this.theView.klikLogin(new v_login());
        this.theView.klikAbout(new v_about());
    }

    private class v_login implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
            try {
                c_user con = new c_user(new login(), new m_user());
                theView.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_awal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

 private class jumlahVaksin implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVaksin().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVaksin().getText()) > 150) {
                    JOptionPane.showMessageDialog(view, "Vaksin Maksimal 150 ML / Vitaminnya Silahkan Masukkan Kembali Vitaminnya");
                    view.getJumlahVaksin().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVaksin().setText("");
            }
        }

    }

    private class jumlahVitamin3 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVitamin2().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVitamin2().getText()) > 3) {
                    JOptionPane.showMessageDialog(view, "Vitamin Maksimal 3 kg / Vitaminnya Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahVitamin2().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVitamin2().setText("");
            }
        }

    }

    private class btnKeluar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

        
    }

    private class btnLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_user a = new c_user(new v_LOGIN(), new m_user());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private class v_about implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(theView, "Project dari mata kuliah PPL Agro yang mengharuskan mahasiswa untuk membuat suatu program\n"
                    + "yang di dalamnya mencakup materi agroindustri yang mana sistem ini membantu agroindustri,\nsehingga membantu untuk memperoleh hasil agroindustri yang terbaik.\n"
                    + "Kelompok Kami antara lain : \n" + "1. Ayu Sisca Irianti      152410101053\n" + "2. Siti Vika NF      152410101072\n"
                    + "3. Gavin Liffera Kusuma P      152410101096\n" + "4. Aisyah Nur F      152410101097");
        }

    }

}
