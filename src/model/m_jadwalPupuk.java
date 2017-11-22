/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vin
 */
public class m_jadwalPupuk extends modelInheritence {

    private koneksi kon;
    public static String nama;

    public m_jadwalPupuk() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
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

  

    public DefaultTableModel getTable() throws SQLException {
        String header[] = {"Id Jadwal", "Nama Petani", "Tanggal"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT * from tb_jadwalpupuk");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[3];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }

    @Override
    public boolean delete(String query) throws SQLException {
        String queries = "DELETE FROM tb_jadwalpupuk WHERE id_jadwal =" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO tb_jadwalpupuk VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }
}
