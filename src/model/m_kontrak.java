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
public class m_kontrak extends modelInheritence {

    private final koneksi kon;
    

    public m_kontrak() throws SQLException {
        super();
        kon = new koneksi("root", "", "db_ppl");
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"Id_Kontrak", "Petani", "Luas", "Jumlah Bibit", "Jumlah Pupuk"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from tb_kontrak";
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public String[] Petani() throws SQLException {
        String query = "SELECT * FROM tb_user WHERE status_user='Petani'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String Petani[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            Petani[a] = rs.getString("nama_depan");
            a++;
        }
        a = 0;
        return Petani;
    }

    @Override
    public boolean delete(String query) throws SQLException {
        String queries = "DELETE FROM tb_kontrak WHERE id_user='" + query + "'";
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(String query, String id) throws SQLException {
        String queries = "UPDATE tb_kontrak SET " + query + "WHERE id_user=" + id;
        return super.update(queries); //To change body of ge nerated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO tb_kontrak VALUES(NULL," + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet check(String Username, String Password) throws SQLException {
        String query = "SELECT * FROM tb_user WHERE username='" + Username + "' AND password='" + Password + "'";
        ResultSet Result = kon.getResult(query);
        return Result;
    }
}
