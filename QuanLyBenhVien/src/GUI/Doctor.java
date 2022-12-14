
package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import Object.DOCTOR;
import Object.Load_Database;

public class Doctor extends javax.swing.JFrame {
    static ArrayList<DOCTOR> list_Doctors = new ArrayList<>();
    DefaultTableModel model;

    public static ArrayList<DOCTOR> get_listDoctor() {
        return list_Doctors;
    }

    private boolean edit = false;

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public void showData() {
        model.setRowCount(0);
        for (DOCTOR x : list_Doctors) {
            String sex;
            if (x.isSex()) {
                sex = "Nam";
            } else
                sex = "Nữ";
            model.addRow(new Object[] {
                    x.getID(), x.getName(), sex, x.getAddress(), x.getAge(), x.getEmail(),
                    x.getPhone(), x.getPosition_Job()
            });
        }
    }

    public Doctor() {
        list_Doctors.removeAll(list_Doctors);
        list_Doctors = Load_Database.getListDoctorDoNotDecrypt();
        initComponents();
        model = (DefaultTableModel) table_bs.getModel();
        showData();

    }

    public Doctor(boolean edit) {
        list_Doctors.removeAll(list_Doctors);
        list_Doctors = Load_Database.getListDoctorDoNotDecrypt();
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) table_bs.getModel();
        if (edit) {
            btn_add.setEnabled(true);
            btn_delete.setEnabled(true);
            btn_save.setEnabled(true);
            setEdit(true);
        } else {
            btn_add.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_save.setEnabled(false);
        }
        edt_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edt_findKeyPressed(evt);
            }
        });
        showData();
    }

    private int check_frame = 0, index1 = 0;

    public Doctor(String ma, String ht, String gt, String tuoi, String diachi, String email, String sdt,
            String cv) {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) table_bs.getModel();
        boolean kt = false;
        if (gt.trim().equalsIgnoreCase("Nam")) {
            kt = true;
        } else
            kt = false;
        list_Doctors.add(new DOCTOR(ma, ht, email, sdt, diachi, kt, Double.parseDouble(tuoi), cv));
        showData();
    }

    public Doctor(String ma, String ht, String gt, String tuoi, String diachi, String email, String sdt,
            String cv, int index1) {
        list_Doctors.removeAll(list_Doctors);
        list_Doctors = Load_Database.getListDoctorDoNotDecrypt();
        list_Doctors.get(index1).setID(ma);
        list_Doctors.get(index1).setName(ht);
        list_Doctors.get(index1).setAge(Double.parseDouble(tuoi));
        list_Doctors.get(index1).setAddress(diachi);
        list_Doctors.get(index1).setEmail(email);
        list_Doctors.get(index1).setPhone(sdt);
        list_Doctors.get(index1).setPosition_Job(cv);
        if (gt.trim().equalsIgnoreCase("Nam")) {
            list_Doctors.get(index1).setSex(true);
        } else
            list_Doctors.get(index1).setSex(false);
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_bs = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        btn_load = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        edt_find = new javax.swing.JTextField();
        btn_reload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table_bs.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "MÃ BÁC SĨ", "HỌ VÀ TÊN", "GIỚI TÍNH", "ĐỊA CHỈ", "TUỔI", "EMAIL", "SỐ ĐIỆN THOẠI", "CHỨC VỤ"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_bs);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("BẢNG QUẢN LÍ BÁC SĨ");

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 153, 204));
        btn_add.setText("THÊM MỚI");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 153, 204));
        btn_delete.setText("XÓA");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_detail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_detail.setForeground(new java.awt.Color(0, 153, 204));
        btn_detail.setText("XEM CHI TIẾT");
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        btn_load.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_load.setForeground(new java.awt.Color(0, 153, 204));
        btn_load.setText("LOAD DATA");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 153, 204));
        btn_save.setText("LƯU DỮ LIỆU");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("TÌM KIẾM THEO MÃ: ");

        edt_find.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        edt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_findActionPerformed(evt);
            }
        });

        btn_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, 148,
                                                Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_reload))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edt_findActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_findActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_edt_findActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_reloadActionPerformed
        findMA();
    }// GEN-LAST:event_btn_reloadActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
        InfoDoctor x = new InfoDoctor();
        x.setVisible(true);
    }// GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleteActionPerformed
        int index = 0;
        index = table_bs.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "HÃY CHỌN 1 DÒNG ĐỂ XÓA !");
        } else {
            if (list_Doctors.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "KHÔNG CÓ GÌ ĐỂ XÓA !");
            } else {
                list_Doctors.remove(index);
                showData();
            }
        }
    }// GEN-LAST:event_btn_deleteActionPerformed

    private void edt_findKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_edt_findKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findMA();
        }

    }// GEN-LAST:event_edt_findKeyPressed

    public void detail(int index) {
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "HÃY CHỌN 1 DÒNG ĐỂ XEM!");
        } else {
            if (list_Doctors.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "KHÔNG CÓ GÌ ĐỂ XEM !");
            } else {
                InfoDoctor x1 = new InfoDoctor(index, isEdit());
                x1.setVisible(true);
            }

        }
    }

    public void findMA() {
        String ma = edt_find.getText();
        boolean kt = false;
        for (int i = 0; i < list_Doctors.size(); i++) {
            if (list_Doctors.get(i).getID().trim().equalsIgnoreCase(ma.trim())) {
                detail(i);
                kt = true;
                break;
            }
        }
        if (kt == false) {
            JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI MÃ NÀY !");
        }
    }

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_detailActionPerformed
        int index = table_bs.getSelectedRow();
        boolean kt = isEdit();
        detail(index);
    }// GEN-LAST:event_btn_detailActionPerformed

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_loadActionPerformed
        showData();
    }// GEN-LAST:event_btn_loadActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮC MUỐN LƯU KHÔNG ? ");
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "BẠN ĐÃ LƯU THÀNH CÔNG DỮ LIỆU ! ");
            Load_Database.writeFile_Doctors();
        }
    }// GEN-LAST:event_btn_saveActionPerformed
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField edt_find;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_bs;
    // End of variables declaration//GEN-END:variables
}
