/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vin
 */
public class m_kualitas {

    public koneksi kon;
    public static String luas;
    public static String id;
    public String[] getMutu = new String[3];

    public m_kualitas() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
    }

    public String[] getPetani() throws SQLException {
        String query = "SELECT k.id_user, u.nama_depan FROM tb_kontrak k join tb_user u on k.id_user=u.id_user";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("u.nama_depan");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getVarietas() throws SQLException {
        String query = "SELECT nilai_varietas FROM tb_varietas";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai_varietas");
            a++;
        }
        a = 0;
        return id;

    }

    public String[] getMatang() throws SQLException {
        String query = "SELECT nilai_matang FROM tb_matang";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai_matang");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getBobot() throws SQLException {
        String query = "SELECT nilai_bobot FROM tb_bobot";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai_bobot");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getCacat() throws SQLException {
        String query = "SELECT nilai_cacat FROM tb_cacat";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai_cacat");
            a++;
        }
        a = 0;
        return id;
    }

//    public void status(String id) throws SQLException {
//        String sql = "select luas from tb_kontrak where id_user=" + id + "";
//        Statement st = kon.getConnection().createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        luas = rs.getString("luas");
//        
//    }

    public String idpetani(String nama) throws SQLException {
        String query = "SELECT k.id_user, k.luas, u.nama_depan FROM tb_kontrak k join tb_user u on k.id_user=u.id_user WHERE u.nama_depan='" + nama + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            id = rs.getString("id_user");
            luas = rs.getString("luas");
        }
        return id;
    }

    public void Pakar(int id) throws SQLException {
        String query = "Select * from tb_mutu where id_mutu= " + id;
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            for (int i = 1; i < getMutu.length + 1; i++) {
                getMutu[i - 1] = rs.getString(i);
            }
        }
    }

    public String getStatus() {
        return getMutu[1];
    }

    public String getTindakan() {
        return getMutu[2];
    }

}
