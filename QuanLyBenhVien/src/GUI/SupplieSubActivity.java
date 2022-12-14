
package GUI;

import javax.swing.JOptionPane;

public class SupplieSubActivity extends javax.swing.JFrame {

        public SupplieSubActivity() {
                initComponents();
                setLocationRelativeTo(null);
        }

        private int index = -1;

        public int getIndex() {
                return index;
        }

        public void setIndex(int index) {
                this.index = index;
        }

        private boolean kt = false;

        public boolean isKt() {
                return kt;
        }

        public void setKt(boolean kt) {
                this.kt = kt;
        }

        public SupplieSubActivity(String ma, String name, String ngay1, String ngay2, String cd, int index,
                        boolean kt) {
                initComponents();
                setLocationRelativeTo(null);
                edt_ma.setText(ma);
                edt_name.setText(name);
                edt_nhap.setText(ngay1);
                edt_han.setText(ngay2);
                edt_cd.setText(cd);
                setIndex(index);
                setKt(true);
                if (kt == false) {
                        edt_ma.setEditable(false);
                        edt_name.setEditable(false);
                        edt_nhap.setEditable(false);
                        edt_han.setEditable(false);
                        edt_cd.setEditable(false);
                        btn_new.setEnabled(false);
                }

        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                edt_ma = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                edt_han = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                edt_name = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                edt_cd = new javax.swing.JTextField();
                edt_nhap = new javax.swing.JTextField();
                btn_new = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(204, 0, 102));
                jLabel1.setText("QUẢN LÍ VẬT TƯ");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(166, 60, 41));
                jLabel3.setText("MÃ VẬT TƯ:");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(166, 60, 41));
                jLabel4.setText("NGÀY HẾT HẠN:");

                edt_han.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_hanActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(166, 60, 41));
                jLabel5.setText("TÊN VẬT TƯ: ");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(166, 60, 41));
                jLabel6.setText("NGÀY NHẬP:");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(166, 60, 41));
                jLabel7.setText("CÔNG DỤNG:");

                btn_new.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btn_new.setForeground(new java.awt.Color(204, 0, 102));
                btn_new.setText("OK");
                btn_new.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_newActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(94, 94, 94)
                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                211,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(106, 106,
                                                                                                                                                106)
                                                                                                                                .addComponent(btn_new,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                172,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(0, 59, Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                131,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                131,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                131,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                131,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(edt_ma)
                                                                                                                                                .addComponent(edt_name)
                                                                                                                                                .addComponent(edt_nhap)
                                                                                                                                                .addComponent(edt_han)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                131,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(edt_cd)))))
                                                                .addGap(20, 20, 20)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_ma,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_nhap,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel6))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(edt_han,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_cd,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel7))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_new,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                41,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(24, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        public void addNew() {
                if (edt_ma.getText() == "" || edt_name.getText() == "" || edt_nhap.getText() == ""
                                || edt_han.getText() == "" ||
                                edt_cd.getText() == "") {
                        JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN !");
                } else {
                        Supplie x = new Supplie(edt_ma.getText(), edt_name.getText(), edt_nhap.getText(),
                                        edt_han.getText(),
                                        edt_cd.getText());
                        dispose();
                }
        }

        public void edit() {
                if (edt_ma.getText() == "" || edt_name.getText() == "" || edt_nhap.getText() == ""
                                || edt_han.getText() == "" ||
                                edt_cd.getText() == "") {
                        JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN !");
                } else {
                        Supplie x = new Supplie(edt_ma.getText(), edt_name.getText(), edt_nhap.getText(),
                                        edt_han.getText(),
                                        edt_cd.getText(), getIndex());
                        dispose();
                }
        }

        private void edt_hanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_hanActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_hanActionPerformed

        private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_newActionPerformed
                if (kt) {
                        edit();
                } else {
                        addNew();
                }

        }// GEN-LAST:event_btn_newActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btn_new;
        private javax.swing.JTextField edt_cd;
        private javax.swing.JTextField edt_han;
        private javax.swing.JTextField edt_ma;
        private javax.swing.JTextField edt_name;
        private javax.swing.JTextField edt_nhap;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        // End of variables declaration//GEN-END:variables
}
