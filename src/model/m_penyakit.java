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
public class m_penyakit{

    public koneksi kon;
    public static String nama;
    public static String luas;
    public String[] getPenyakit = new String[3];

    public m_penyakit() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
    }

    public String[] Penyakit() throws SQLException {
        String query = "SELECT nama_penyakit FROM tb_penyakit where status_penyakit='Disetujui'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String id[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            id[a] = rs.getString("nama_penyakit");
            a++;
        }
        a = 0;
        return id;
    }

    public String[] Petani() throws SQLException {
        String query = "SELECT nama_depan FROM tb_user";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("nama_depan");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] Luas() throws SQLException {
        String query = "SELECT luas FROM tb_user";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("luas");
            a++;
        }
        a = 0;
        return tahun;
    }

    public void Penyakit(int id) throws SQLException {
        String query = "Select * from tb_penyakit where id_penyakit= " + id;
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            for (int i = 1; i < getPenyakit.length + 1; i++) {
                getPenyakit[i - 1] = rs.getString(i);
            }
        }
    }

    public String getStatus() {
        return getPenyakit[2];
    }
}
