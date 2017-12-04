/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vin
 */
public class m_feedback extends modelInheritence {

    private final koneksi kon;

    public m_feedback() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Nama Penyakit", "Vaksin"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select nama_penyakit, vaksin from tb_penyakit where status_penyakit='Tidak Disetujui'";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[2];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public DefaultTableModel getTablePenyakit() throws SQLException {
        Object[] header = {"Id Penyakit", "Nama Penyakit", "Vaksin", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from tb_penyakit";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[4];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO tb_penyakit VALUES(NULL," + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(String query) throws SQLException {
        String queries = "UPDATE tb_penyakit SET " + query;
        return super.update(queries); //To change body of ge nerated methods, choose Tools | Templates.
    }

}
