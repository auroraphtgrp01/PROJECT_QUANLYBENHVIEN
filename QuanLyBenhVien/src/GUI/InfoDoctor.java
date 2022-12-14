package GUI;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Object.*;

public class InfoDoctor extends javax.swing.JFrame {

    private String ma, ht, gt, tuoi, diachi, email, sdt, cv;
    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    static ArrayList<DOCTOR> listdc = new ArrayList<>();

    public InfoDoctor(int index, boolean edit) {
        setIndex(index);
        initComponents();
        setLocationRelativeTo(null);
        listdc.removeAll(listdc);
        listdc = Load_Database.getListDoctorDoNotDecrypt();

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
        group.add(rdnam);
        group.add(rdnu);
        if (edit) {
            this.btn_save.setEnabled(true);
        } else
            this.btn_save.setEnabled(false);
    }

    public InfoDoctor() {
        initComponents();
        setLocationRelativeTo(null);
        group.add(rdnam);
        group.add(rdnu);
    }

    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        group = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        edt_cache1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        edt_ma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edt_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rdnam = new javax.swing.JRadioButton();
        rdnu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        edt_age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edt_dchi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edt_mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edt_sdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("THÔNG TIN CHI TIẾT");

        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 102, 51));
        btn_save.setText("LƯU");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("MÃ BÁC SĨ: ");

        edt_ma.setEditable(true);
        edt_ma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_ma.setForeground(new java.awt.Color(102, 102, 255));
        edt_ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_maActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("HỌ VÀ TÊN: ");

        edt_name.setEditable(true);
        edt_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_name.setForeground(new java.awt.Color(102, 102, 255));
        edt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("GIỚI TÍNH:");

        rdnam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdnam.setForeground(new java.awt.Color(102, 102, 255));
        rdnam.setText("Nam");
        rdnam.setEnabled(true);
        rdnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnamActionPerformed(evt);
            }
        });

        rdnu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdnu.setForeground(new java.awt.Color(102, 102, 255));
        rdnu.setText("Nữ");
        rdnu.setEnabled(true);
        rdnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("TUỔI: ");

        edt_age.setEditable(true);
        edt_age.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_age.setForeground(new java.awt.Color(102, 102, 255));
        edt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_ageActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("ĐỊA CHỈ: ");

        edt_dchi.setEditable(true);
        edt_dchi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_dchi.setForeground(new java.awt.Color(102, 102, 255));
        edt_dchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_dchiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("EMAIL: ");

        edt_mail.setEditable(true);
        edt_mail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_mail.setForeground(new java.awt.Color(102, 102, 255));
        edt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_mailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("SỐ ĐIỆN THOẠI:");

        edt_sdt.setEditable(true);
        edt_sdt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_sdt.setForeground(new java.awt.Color(102, 102, 255));
        edt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_sdtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("CHỨC VỤ: ");

        edt_cvu.setEditable(true);
        edt_cvu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_cvu.setForeground(new java.awt.Color(102, 102, 255));
        edt_cvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_cvuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(edt_cache1)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(edt_cvu))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(edt_name))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(edt_age))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(edt_dchi))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(edt_mail)
                                                        .addComponent(edt_sdt)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rdnam)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rdnu))
                                                        .addComponent(jLabel3,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                layout.createSequentialGroup()
                                                        .addGap(128, 128, 128)
                                                        .addComponent(edt_ma))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 46, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)))
                                .addGap(15, 15, 15))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_ma, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdnam, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdnu, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_dchi, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_cvu, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14,
                                        Short.MAX_VALUE)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edt_cache1)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(ActionEvent evt) {
        if (edt_ma.getText().equals("") || edt_age.getText().equals("") || edt_cvu.getText().equals("")
                || edt_dchi.getText().equals("")
                || edt_mail.getText().equals("") || edt_sdt.getText().equals("") || edt_name.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "NHẬP THÔNG TIN THIẾU, VUI LÒNG NHẬP LẠI !!!");
        } else {
            if (getIndex() != 0) {
                if (rdnam.isSelected()) {
                    gt = "Nam";
                } else
                    gt = "Nữ";
                int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN LƯU !");
                if (JOptionPane.YES_OPTION == result) {
                    JOptionPane.showMessageDialog(rootPane, "BẠN ĐÃ LƯU THÀNH CÔNG !!!");
                    Doctor x = new Doctor(edt_ma.getText(), edt_name.getText(), gt, edt_age.getText(),
                            edt_dchi.getText(),
                            edt_mail.getText(), edt_sdt.getText(), edt_cvu.getText(), getIndex());
                    setVisible(false);
                }
            } else {
                if (rdnam.isSelected()) {
                    gt = "Nam";
                } else
                    gt = "Nữ";
                int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN LƯU !");
                if (JOptionPane.YES_OPTION == result) {
                    JOptionPane.showMessageDialog(rootPane, "BẠN ĐÃ LƯU THÀNH CÔNG !!!");
                    Doctor x = new Doctor(edt_ma.getText(), edt_name.getText(), gt, edt_age.getText(),
                            edt_dchi.getText(),
                            edt_mail.getText(), edt_sdt.getText(), edt_cvu.getText());
                    setVisible(false);
                }
            }
        }
    }

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

        // TODO add your handling code here:
    }// GEN-LAST:event_btn_editActionPerformed

    private void btn_edit1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_edit1ActionPerformed

    }// GEN-LAST:event_btn_edit1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edt_age;
    private javax.swing.JLabel edt_cache1;
    private javax.swing.JTextField edt_cvu;
    private javax.swing.JTextField edt_dchi;
    private javax.swing.JTextField edt_ma;
    private javax.swing.JTextField edt_mail;
    private javax.swing.JTextField edt_name;
    private javax.swing.JTextField edt_sdt;
    private javax.swing.ButtonGroup group;
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
    private javax.swing.JRadioButton rdnam;
    private javax.swing.JRadioButton rdnu;
    // End of variables declaration//GEN-END:variables
}
