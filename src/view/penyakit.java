/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author InSearchOfIncredible
 */
public class penyakit extends javax.swing.JFrame {

    /**
     * Creates new form penyakit
     */
    public penyakit() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public JComboBox<String> getPenyakit() {
        return penyakit;
    }

    public void setComboPenyakit(String[] comboPenyakit) {
        for (String a : comboPenyakit) {
            this.penyakit.addItem(a);
        }
    }

    public void addCekListener(ActionListener listener) {
        btn_cek.addActionListener(listener);
    }

    public void backListener(ActionListener listener) {
        btn_kembali.addActionListener(listener);
    }

    public JTextArea getAnalisa(String string) {
        return analisa;
    }

    public void setAnalisa(String text) {
        analisa.setText(text);
    }

    public void Message(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public JTextField getPetani() {
        return petani;
    }

    public JTextField getLuas() {
        return luas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        analisa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        penyakit = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        petani = new javax.swing.JTextField();
        btn_kembali = new javax.swing.JButton();
        luas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar3/cek2.png"))); // NOI18N
        btn_cek.setBorder(null);
        btn_cek.setBorderPainted(false);
        btn_cek.setContentAreaFilled(false);
        getContentPane().add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 90, 40));

        analisa.setColumns(20);
        analisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        analisa.setRows(5);
        jScrollPane1.setViewportView(analisa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 670, 160));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 40, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hama Penyakit");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 370, 70));

        penyakit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        penyakit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        getContentPane().add(penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 220, 30));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 40, 40));

        petani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        petani.setForeground(new java.awt.Color(255, 255, 255));
        petani.setBorder(null);
        petani.setOpaque(false);
        petani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petaniActionPerformed(evt);
            }
        });
        getContentPane().add(petani, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 240, 30));

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar3/keluar.png"))); // NOI18N
        btn_kembali.setBorder(null);
        btn_kembali.setBorderPainted(false);
        btn_kembali.setContentAreaFilled(false);
        getContentPane().add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 170, 50));

        luas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luas.setForeground(new java.awt.Color(255, 255, 255));
        luas.setBorder(null);
        luas.setOpaque(false);
        getContentPane().add(luas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/penyakit.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void petaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petaniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(penyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penyakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea analisa;
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField luas;
    private javax.swing.JComboBox<String> penyakit;
    private javax.swing.JTextField petani;
    // End of variables declaration//GEN-END:variables
}
