/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vin
 */
public class m_user {

    public static String nama;
    public static String luas;
    public static String pupuk;
    public static String status;
    public static String username;
    public String status_user = "";
    private koneksi kon;

    public m_user() throws SQLException {
        kon = new koneksi("root", "", "db_ppl");
    }

    public void Login(String user, String pass) throws SQLException {
        String query = "select * from tb_user where email = '" + user + "' and password = '" + pass + "'";
        String cari = "select * from tb_kontrak";
        ResultSet rs = kon.getResult(query);
        if (rs.next()) {
            username = user;
            nama = rs.getString("nama_depan");
//            id_user = rs.getString("id_member");
            status_user = rs.getString("status_user");
//            status = "valid";
            ResultSet sa = kon.getResult(cari);
            if (sa.next()) {
                luas = sa.getString("luas");
            }
        } else {
//            status = "tidak valid";
        }
    }
    
    public String pupuk(String user) throws SQLException{
        String query = "SELECT * FROM tb_kontrak";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            pupuk = rs.getString("jumlah_pupuk");
        }
        return pupuk;
    } 

    public String getStatus() {
        return status;
    }

    public String getStatusUser() {
        return status_user;
    }

    public String getNama() {
        return nama;
    }


}
