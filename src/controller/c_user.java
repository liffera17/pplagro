/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.m_kontrak;
import model.m_pendaftaran;
import model.m_user;
import view.homeAdmin;
import view.homePetani;
import view.login;
import view.pendaftaran;

/**
 *
 * @author Vin
 */
public class c_user {

    login theView;
    pendaftaran view;
    m_user theModel;
    m_pendaftaran model;
    public static String nama;
    public static String luas;
    public static String pupuk;

    public c_user(pendaftaran view, m_pendaftaran model) {
        this.model = model;
        this.view = view;
        view.setVisible(true);
        view.addSaveListener(new saveListener());
        view.addEditListener(new editListener());
        view.addUpdateListener(new updateListener());
        view.addDeleteListener(new hapusListener());
        view.addBackListener(new backListener());

        try {
            view.setTable(model.getTableModel());
        } catch (SQLException ex) {
            Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    c_user(login theView, m_user theModel) {
        this.theView = theView;
        this.theModel = theModel;
        theView.setVisible(true);
        theView.addLoginListener(new LoginListener());
    }

    private class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                theModel.Login(theView.getUsername(), theView.getPassword());
                System.out.println(theModel.getStatusUser());
                System.out.println(theView.getUsername() + " " + theView.getPassword());
                if (theView.getUsername().equalsIgnoreCase("") || theView.getPassword().equalsIgnoreCase("")) {
                    theView.message("Pastikan Username dan Password Anda Terisi");
                    theView.Reset();
                } else if (theModel.getStatusUser().equalsIgnoreCase("")) {
                    theView.message("Pastikan Username dan Password Anda Benar");
                    theView.Reset();

                } else if (theModel.getStatusUser().equalsIgnoreCase("admin")) {
                    theView.dispose();
                    homeAdmin a = new homeAdmin();
                    c_menuAdmin theController = new c_menuAdmin(a, new m_user());
                    nama = m_user.nama;
                    System.out.println(nama);
                    System.out.println("Berhasil");
                } else if (theModel.getStatusUser().equalsIgnoreCase("Petani")) {
                    nama = m_user.nama;
                    luas = m_user.luas;
//                    pupuk = m_user.pupuk;
                    theModel.pupuk(nama);
                    pupuk = m_user.pupuk;
                    System.out.println(nama);
                    System.out.println(luas);
                    System.out.println(pupuk);
                    theView.dispose();
                    c_menuPetani theController = new c_menuPetani(new homePetani(), new m_user());
                    System.out.println("Berhasil");
                }
            } catch (Exception ex) {

            }

        }
    }

    private class saveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (view.getJK() == "PILIH SALAH SATU" || view.getStatus() == "Silahkan Isi" || view.getNamaDepan().isEmpty() || view.getNamaBelakang().isEmpty()
                        || view.getUsername().isEmpty() || view.getAlamat().isEmpty() || view.getKode().isEmpty() || view.getNoTelp().isEmpty() || view.getPassword().isEmpty()) {
                    view.setJK(0);
                    view.setStatus(0);
                    JOptionPane.showMessageDialog(view, "Isi dengan benar!!");
                } else {
//                model.save(view.getNamauser(), view.getUsername(), view.getPass(), view.getStatus());
                    model.save("NULL,'" + view.getNamaDepan() + "','" + view.getNamaBelakang() + "','" + view.getJK() + "','"
                            + view.getStatus() + "','"
                            + view.getUsername() + "','"
                            + view.getAlamat() + "','"
                            + view.getKode() + "','" + view.getNoTelp() + "','" + view.getPassword() + "'" + "");
                    view.setTable(model.getTableModel());
                    view.setNamaDepan("");
                    view.setNamaBelakang("");
//                view.setJK("");
//                view.setStatus("");
                    view.setUsername("");
                    view.setAlamat("");
                    view.setKode("");
                    view.setNoTelp("");
                    view.setPassword("");
                    view.text(true);
                    view.buttonsave(true);
                    view.button(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class editListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int baris = view.getSelectedRow();
            if (baris != -1) {

                String iduser = view.getValueAt(baris, 0);
                String NamaDepan = view.getValueAt(baris, 1);
                String NamaBelakang = view.getValueAt(baris, 2);
                String JK = view.getValueAt(baris, 3);
                String Status = view.getValueAt(baris, 4);
                String Username = view.getValueAt(baris, 5);
                String Alamat = view.getValueAt(baris, 6);
                String Kode = view.getValueAt(baris, 7);
                String NoTelp = view.getValueAt(baris, 8);
                String Password = view.getValueAt(baris, 9);

                view.setId(iduser);
                view.setNamaDepan(NamaDepan);
                view.setNamaBelakang(NamaBelakang);
//                view.setJK(JK);
//                view.setStatus(Status);
                view.setUsername(Username);
                view.setAlamat(Alamat);
                view.setKode(Kode);
                view.setNoTelp(NoTelp);
                view.setPassword(Password);
                view.text(true);
            }
//        view.button(true);
        }
    }

    private class updateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (view.getJK() == "PILIH SALAH SATU" || view.getStatus() == "Silahkan Isi" || view.getNamaDepan().isEmpty() || view.getNamaBelakang().isEmpty()
                        || view.getUsername().isEmpty() || view.getAlamat().isEmpty() || view.getKode().isEmpty() || view.getNoTelp().isEmpty() || view.getPassword().isEmpty()) {
                    view.setJK(0);
                    view.setStatus(0);
                    JOptionPane.showMessageDialog(view, "Isi dengan benar!!");
                } else {
                    int baris = view.getSelectedRow();
                    String id = view.getId();
//                int id = Integer.parseInt(iduser);
                    String namaDepan = view.getNamaDepan();
                    String namaBelakang = view.getNamaBelakang();
                    String jenis = view.getJK();
                    String status = view.getStatus();
                    String username = view.getUsername();
                    String alamat = view.getAlamat();
                    String kode = view.getKode();
                    String notelp = view.getNoTelp();
                    String pass = view.getPassword();
                    model.update("nama_depan ='" + namaDepan + "', nama_belakang='" + namaBelakang + "', jenis_kelamin='" + jenis + "', status_user= '"
                            + status + "', email ='" + username + "', alamat= '" + alamat + "', kode_pos= '" + kode + "', no_telp= '" + notelp
                            + "', password= '" + pass + "' WHERE id_user =" + id);
//                model.update(id, nama, user, pass, status);
                    clear();
                    view.text(true);
                    view.buttonupdate(true);
                    view.button(true);
                    view.setTable(model.getTableModel());
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class hapusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int baris = view.getSelectedRow();
                String iduser = view.getValueAt(baris, 0);
                System.out.println(iduser);
                model.delete(iduser);
                view.setTable(model.getTableModel());
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            homeAdmin a = new homeAdmin();
            a.setVisible(true);

            try {
                c_menuAdmin theController = new c_menuAdmin(a, new m_user());
            } catch (SQLException ex) {
                Logger.getLogger(c_user.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("oke");
            view.dispose();
        }
    }

    public void clear() {
        view.setId("");
        view.setNamaDepan("");
        view.setNamaBelakang("");
//        view.setJK("");
//        view.setStatus("");
        view.setUsername("");
        view.setAlamat("");
        view.setKode("");
        view.setNoTelp("");
        view.setPassword("");
    }
}
