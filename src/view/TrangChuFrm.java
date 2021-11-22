package view;

import model.NguoiDung;

/**
 *
 * @author DatIT
 */
public class TrangChuFrm extends javax.swing.JFrame {

    private NguoiDung nd;
    
    public TrangChuFrm(NguoiDung nd) {
        initComponents();
        this.nd = nd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnQLMonAn = new javax.swing.JButton();
        btnQLCombo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Trang Chủ");

        btnQLMonAn.setText("Quản Lý Món Ăn");
        btnQLMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMonAnActionPerformed(evt);
            }
        });

        btnQLCombo.setText("Quản Lý Menu Combo");
        btnQLCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLComboActionPerformed(evt);
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
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQLMonAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(btnQLMonAn)
                .addGap(46, 46, 46)
                .addComponent(btnQLCombo)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMonAnActionPerformed
        
    }//GEN-LAST:event_btnQLMonAnActionPerformed

    private void btnQLComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQLComboActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLCombo;
    private javax.swing.JButton btnQLMonAn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
