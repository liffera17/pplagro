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
    public String[] getMutu = new String[3];

    public m_kualitas() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
    }

    public String[] getPetani() throws SQLException {
        String query = "SELECT petani FROM tb_kontrak";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("petani");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getVarietas() throws SQLException {
        String query = "SELECT nilai FROM tb_varietas";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai");
            a++;
        }
        a = 0;
        return id;

    }

    public String[] getMatang() throws SQLException {
        String query = "SELECT nilai FROM tb_matang";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getBobot() throws SQLException {
        String query = "SELECT nilai FROM tb_bobot";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] getCacat() throws SQLException {
        String query = "SELECT nilai FROM tb_cacat";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nilai");
            a++;
        }
        a = 0;
        return id;
    }

    public void status(String id) throws SQLException {
        String sql = "select luas from tb_kontrak where petani='" + id+"'";
        Statement st = kon.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        luas = rs.getString("luas");

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
