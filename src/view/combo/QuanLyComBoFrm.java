package view.combo;

import model.Combo;
import model.NguoiDung;

/**
 *
 * @author DatIT
 */
public class QuanLyComBoFrm extends javax.swing.JFrame {

    private NguoiDung nd;
    public QuanLyComBoFrm(NguoiDung nd) {
        initComponents();
        this.nd = nd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThemCombo = new javax.swing.JButton();
        btnSuaCombo = new javax.swing.JButton();
        btnXoaCombo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Combo");

        btnThemCombo.setText("Thêm Combo");
        btnThemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemComboActionPerformed(evt);
            }
        });

        btnSuaCombo.setText("Sửa Combo");
        btnSuaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaComboActionPerformed(evt);
            }
        });

        btnXoaCombo.setText("Xóa Combo");
        btnXoaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(btnThemCombo)
                .addGap(37, 37, 37)
                .addComponent(btnSuaCombo)
                .addGap(35, 35, 35)
                .addComponent(btnXoaCombo)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemComboActionPerformed

    private void btnSuaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaComboActionPerformed

    private void btnXoaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaCombo;
    private javax.swing.JButton btnThemCombo;
    private javax.swing.JButton btnXoaCombo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
