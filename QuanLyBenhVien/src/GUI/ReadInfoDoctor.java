package GUI;

import java.util.ArrayList;

import Object.*;

public class ReadInfoDoctor extends javax.swing.JFrame {

        private String ma, ht, gt, tuoi, diachi, email, sdt, cv;
        private int index = 0;
        static ArrayList<DOCTOR> listdc = Load_Database.getListDoctorDoNotDecrypt();

        public void getIndex_cr() {
                int index01 = CreatePatient.getIndex();
        }

        public ReadInfoDoctor(int index) {

                initComponents();
                setLocationRelativeTo(null);
                this.index = index;

                this.edt_ma.setText(listdc.get(index).getID());
                this.edt_name.setText(listdc.get(index).getName());
                this.edt_age.setText(String.valueOf(listdc.get(index).getAge()));
                this.edt_dchi.setText(listdc.get(index).getAddress());
                this.edt_mail.setText(listdc.get(index).getEmail());
                this.edt_sdt.setText(listdc.get(index).getPhone());
                this.edt_cvu.setText(listdc.get(index).getPosition_Job());
                if (listdc.get(index).isSex()) {
                        rdnam.setSelected(true);
                } else
                        rdnu.setSelected(true);
        }

        public ReadInfoDoctor(String ma, String ht, String gt, String tuoi, String diachi, String email, String sdt,
                        String cv, int index) {
                initComponents();
                this.ma = ma;
                this.ht = ht;
                this.gt = gt;
                this.tuoi = tuoi;
                this.diachi = diachi;
                this.email = email;
                this.sdt = sdt;
                this.cv = cv;
                this.index = index;
                this.edt_ma.setText(ma);
                this.edt_name.setText(ht);
                this.edt_age.setText(tuoi);
                this.edt_dchi.setText(diachi);
                this.edt_mail.setText(email);
                this.edt_sdt.setText(sdt);
                this.edt_cvu.setText(cv);
                if (gt.trim().equalsIgnoreCase("Nam")) {
                        rdnam.setSelected(true);
                } else
                        rdnu.setSelected(true);
        }

        public ReadInfoDoctor() {
        }

        private void initComponents() {

                jDialog1 = new javax.swing.JDialog();
                jLabel9 = new javax.swing.JLabel();
                jFileChooser1 = new javax.swing.JFileChooser();
                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                edt_cache1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                edt_ma = new javax.swing.JTextField();
                edt_name = new javax.swing.JTextField();
                rdnam = new javax.swing.JRadioButton();
                rdnu = new javax.swing.JRadioButton();
                edt_age = new javax.swing.JTextField();
                edt_dchi = new javax.swing.JTextField();
                edt_mail = new javax.swing.JTextField();
                edt_sdt = new javax.swing.JTextField();
                edt_cvu = new javax.swing.JTextField();

                javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
                jDialog1.getContentPane().setLayout(jDialog1Layout);
                jDialog1Layout.setHorizontalGroup(
                                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 400, Short.MAX_VALUE));
                jDialog1Layout.setVerticalGroup(
                                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 300, Short.MAX_VALUE));

                jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(102, 102, 255));
                jLabel9.setText("GIỚI TÍNH:");

                setResizable(false);

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 102, 51));
                jLabel1.setText("THÔNG TIN CHI TIẾT");

                jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 153, 153));
                jLabel3.setText("MÃ BÁC SĨ: ");

                jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 153));
                jLabel2.setText("HỌ VÀ TÊN: ");

                jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(0, 153, 153));
                jLabel8.setText("GIỚI TÍNH:");

                jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(0, 153, 153));
                jLabel7.setText("TUỔI: ");

                jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 153, 153));
                jLabel10.setText("ĐỊA CHỈ: ");

                jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 153, 153));
                jLabel5.setText("EMAIL: ");

                jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 153, 153));
                jLabel6.setText("SỐ ĐIỆN THOẠI:");

                jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(0, 153, 153));
                jLabel11.setText("CHỨC VỤ: ");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                114,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addContainerGap()))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(38, Short.MAX_VALUE)));

                edt_ma.setEditable(false);
                edt_ma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_ma.setForeground(new java.awt.Color(102, 102, 255));
                edt_ma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_maActionPerformed(evt);
                        }
                });

                edt_name.setEditable(false);
                edt_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_name.setForeground(new java.awt.Color(102, 102, 255));
                edt_name.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_nameActionPerformed(evt);
                        }
                });

                rdnam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                rdnam.setForeground(new java.awt.Color(102, 102, 255));
                rdnam.setText("Nam");
                rdnam.setEnabled(false);
                rdnam.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdnamActionPerformed(evt);
                        }
                });

                rdnu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                rdnu.setForeground(new java.awt.Color(102, 102, 255));
                rdnu.setText("Nữ");
                rdnu.setEnabled(false);
                rdnu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdnuActionPerformed(evt);
                        }
                });

                edt_age.setEditable(false);
                edt_age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_age.setForeground(new java.awt.Color(102, 102, 255));
                edt_age.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_ageActionPerformed(evt);
                        }
                });

                edt_dchi.setEditable(false);
                edt_dchi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_dchi.setForeground(new java.awt.Color(102, 102, 255));
                edt_dchi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_dchiActionPerformed(evt);
                        }
                });

                edt_mail.setEditable(false);
                edt_mail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_mail.setForeground(new java.awt.Color(102, 102, 255));
                edt_mail.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_mailActionPerformed(evt);
                        }
                });

                edt_sdt.setEditable(false);
                edt_sdt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_sdt.setForeground(new java.awt.Color(102, 102, 255));
                edt_sdt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_sdtActionPerformed(evt);
                        }
                });

                edt_cvu.setEditable(false);
                edt_cvu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_cvu.setForeground(new java.awt.Color(102, 102, 255));
                edt_cvu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_cvuActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(edt_ma,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(rdnam)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(rdnu))
                                                                                .addComponent(edt_age,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_dchi,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_mail,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_sdt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_cvu,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                260,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(22, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(edt_ma,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(edt_name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(rdnam,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(rdnu,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(edt_age,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(edt_dchi,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(edt_mail,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(edt_sdt,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(edt_cvu,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(27, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(128, 128, 128)
                                                                                                .addComponent(edt_cache1))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(12, 12, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                278,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(73, 73, 73)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(edt_cache1)));
                setLocation(450, 200);
                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void edt_maActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_maActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_maActionPerformed

        private void edt_nameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_nameActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_nameActionPerformed

        private void edt_ageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_ageActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_ageActionPerformed

        private void edt_dchiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_dchiActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_dchiActionPerformed

        private void edt_mailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_mailActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_mailActionPerformed

        private void edt_sdtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_sdtActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_sdtActionPerformed

        private void edt_cvuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_cvuActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_cvuActionPerformed

        private void rdnamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdnamActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_rdnamActionPerformed

        private void rdnuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdnuActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_rdnuActionPerformed

        private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
                edt_sdt.setEditable(true);
                edt_age.setEditable(true);
                edt_cvu.setEditable(true);
                edt_dchi.setEditable(true);
                edt_ma.setEditable(true);
                edt_name.setEditable(true);
                edt_mail.setEditable(true);
                rdnam.setEnabled(true);
                rdnu.setEnabled(true);
                // TODO add your handling code here:
        }// GEN-LAST:event_btn_editActionPerformed

        private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_edit1ActionPerformed

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JTextField edt_age;
        private javax.swing.JLabel edt_cache1;
        private javax.swing.JTextField edt_cvu;
        private javax.swing.JTextField edt_dchi;
        private javax.swing.JTextField edt_ma;
        private javax.swing.JTextField edt_mail;
        private javax.swing.JTextField edt_name;
        private javax.swing.JTextField edt_sdt;
        private javax.swing.JDialog jDialog1;
        private javax.swing.JFileChooser jFileChooser1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JRadioButton rdnam;
        private javax.swing.JRadioButton rdnu;
        // End of variables declaration//GEN-END:variables
}
