/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasippdb;

import controller.Data_Peserta;
import javax.swing.JInternalFrame;
import java.io.File;
import javax.swing.JOptionPane;
import controller.koneksi;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Resb
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPeserta = new javax.swing.JButton();
        btnPanitia = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnLaporanPeserta = new javax.swing.JButton();
        btnLaporanPembayaran = new javax.swing.JButton();
        btnLaporanPanitia1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 63, 159));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPeserta.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnPeserta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/graduated.png"))); // NOI18N
        btnPeserta.setText("Data Peserta");
        btnPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesertaActionPerformed(evt);
            }
        });

        btnPanitia.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnPanitia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coding.png"))); // NOI18N
        btnPanitia.setText("Data Panitia");
        btnPanitia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanitiaActionPerformed(evt);
            }
        });

        btnPembayaran.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png"))); // NOI18N
        btnPembayaran.setText("Pembayaran");
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });

        btnLaporanPeserta.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btnLaporanPeserta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document.png"))); // NOI18N
        btnLaporanPeserta.setText("Laporan Peserta");
        btnLaporanPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanPesertaActionPerformed(evt);
            }
        });

        btnLaporanPembayaran.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnLaporanPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document.png"))); // NOI18N
        btnLaporanPembayaran.setText("Laporan  Pembayaran");
        btnLaporanPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanPembayaranActionPerformed(evt);
            }
        });

        btnLaporanPanitia1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btnLaporanPanitia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document.png"))); // NOI18N
        btnLaporanPanitia1.setText("Laporan  Panitia");
        btnLaporanPanitia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanPanitia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPeserta, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(btnPanitia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLaporanPeserta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaporanPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaporanPanitia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeserta)
                    .addComponent(btnLaporanPeserta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPanitia)
                    .addComponent(btnLaporanPembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLaporanPanitia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporanPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanPesertaActionPerformed
        // TODO add your handling code here:
        try {
            JasperPrint jp = JasperFillManager.fillReport(
            getClass().getResourceAsStream("laporanpeserta.jasper"), null, koneksi.getkoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLaporanPesertaActionPerformed

    private void btnPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesertaActionPerformed
        // TODO add your handling code here:
        DataPeserta datapeserta = new DataPeserta();
        datapeserta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesertaActionPerformed

    private void btnPanitiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanitiaActionPerformed
        // TODO add your handling code here:
        DataPanitia datapanitia = new DataPanitia();
        datapanitia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPanitiaActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
        // TODO add your handling code here:
        DataPembayaran DataPembayaran = new DataPembayaran();
        DataPembayaran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnLaporanPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanPembayaranActionPerformed
        // TODO add your handling code here:
        try {
            JasperPrint jp = JasperFillManager.fillReport(
            getClass().getResourceAsStream("laporanpembayaran.jasper"), null, koneksi.getkoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLaporanPembayaranActionPerformed

    private void btnLaporanPanitia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanPanitia1ActionPerformed
        // TODO add your handling code here:
        try {
            JasperPrint jp = JasperFillManager.fillReport(
            getClass().getResourceAsStream("laporanpanitia.jasper"), null, koneksi.getkoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLaporanPanitia1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaporanPanitia1;
    private javax.swing.JButton btnLaporanPembayaran;
    private javax.swing.JButton btnLaporanPeserta;
    private javax.swing.JButton btnPanitia;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPeserta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
