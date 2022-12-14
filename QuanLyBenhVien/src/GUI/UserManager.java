
package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.*;

public class UserManager extends javax.swing.JFrame {
    static ArrayList<User_Login> user = new ArrayList<>();
    DefaultTableModel model;

    public UserManager() {
        user.removeAll(user);
        user = Load_Database.getUserDontDecryt();
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable1.getModel();
        showData();
        group.add(rdi_edit);
        group.add(rdi_read);
    }

    public void showData() {

        model.setRowCount(0);
        for (User_Login x : user) {
            String per = "";
            if (x.isPermission_Doctor()) {
                per += "DOCTOR ";
            } else if (x.isPermission_Patients()) {
                per += "PATIENT ";
            } else if (x.isPermission_Supplies()) {
                per += "SUPPLIE ";
            } else {
                per += "NO";
            }
            String accs = "";
            if (x.isPermission_Edit()) {
                accs = "EDIT";
            } else
                accs = "READ";
            model.addRow(new Object[] {
                    x.getUserName(), x.getPassWord(), per, accs
            });
        }
    }

    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edt_pass = new javax.swing.JTextField();
        edt_user = new javax.swing.JTextField();
        rdi_read = new javax.swing.JRadioButton();
        rdi_edit = new javax.swing.JRadioButton();
        check_sup = new javax.swing.JCheckBox();
        check_doc = new javax.swing.JCheckBox();
        check_pa = new javax.swing.JCheckBox();
        btn_dele = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setLocation(new java.awt.Point(500, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("QUẢN LÍ NGƯỜI DÙNG");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Username", "Password", "Access", "Permission"
                }) {
            Class[] types = new Class[] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Access: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Username: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("Password: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 255));
        jLabel5.setText("Permission: ");

        edt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_passActionPerformed(evt);
            }
        });

        edt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_userActionPerformed(evt);
            }
        });

        rdi_read.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdi_read.setForeground(new java.awt.Color(153, 0, 255));
        rdi_read.setText("READ");
        rdi_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdi_readActionPerformed(evt);
            }
        });

        rdi_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdi_edit.setForeground(new java.awt.Color(153, 0, 255));
        rdi_edit.setText("READ_EDIT");
        rdi_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdi_editActionPerformed(evt);
            }
        });

        check_sup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        check_sup.setForeground(new java.awt.Color(153, 0, 255));
        check_sup.setText("SUPPLIES");
        check_sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_supActionPerformed(evt);
            }
        });

        check_doc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        check_doc.setForeground(new java.awt.Color(153, 0, 255));
        check_doc.setText("DOCTOR");

        check_pa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        check_pa.setForeground(new java.awt.Color(153, 0, 255));
        check_pa.setText("PATIENT");
        check_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_paActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edt_user))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(check_doc,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(check_pa,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rdi_read)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rdi_edit,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 117,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(check_sup)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edt_pass)))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(edt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rdi_read)
                                        .addComponent(rdi_edit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(check_doc)
                                                .addComponent(check_pa)
                                                .addComponent(check_sup))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        btn_dele.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_dele.setForeground(new java.awt.Color(153, 0, 255));
        btn_dele.setText("DELETE");
        btn_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(153, 0, 255));
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(153, 0, 255));
        btn_edit.setText("EDIT / SAVE");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(76, 76, 76))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn_edit)
                                                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(btn_add)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btn_dele)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btn_edit))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        dispose();
    }// GEN-LAST:event_formWindowClosing

    private void edt_userActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_userActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_edt_userActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
        addUser();

    }// GEN-LAST:event_btn_addActionPerformed

    private void addUser() {
        boolean kt = true;
        String userAdd, passAdd;
        userAdd = edt_user.getText();
        passAdd = edt_pass.getText();
        boolean checkDoc = false, checkPa = false, check_su = false, check_edit = false;

        if (check_doc.isSelected()) {
            checkDoc = true;
        }
        if (check_pa.isSelected()) {
            checkPa = true;
        }
        if (check_sup.isSelected()) {
            check_su = true;
        }
        if (rdi_edit.isSelected()) {
            check_edit = true;
        }

        for (User_Login x : user) {
            if (x.getUserName().trim().equalsIgnoreCase(userAdd)) {
                JOptionPane.showMessageDialog(rootPane, "Username đã tồn tại !!! ");
                kt = false;
                break;
            }
        }

        if (userAdd.trim().equalsIgnoreCase("".trim()) || passAdd.trim().equalsIgnoreCase("".trim())) {
            JOptionPane.showMessageDialog(rootPane, "KHÔNG ĐƯỢC ĐỂ TRỐNG !!!");
        } else if (kt) {
            user.add(new User_Login(userAdd, passAdd, checkDoc, check_su, checkPa, check_edit));
            Load_Database.writeUser();
            showData();
        }
    }

    public void delete() {
        int index = jTable1.getSelectedRow();
        int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN XÓA KHÔNG ? ");
        if (result == JOptionPane.YES_OPTION) {
            user.remove(index);
            Load_Database.writeUser();
        }
    }

    boolean kt = true;

    public void Edit() {
        int index = jTable1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ SỬA !!!");
        } else {
            if (kt == true) {
                rdi_edit.setSelected(false);
                check_doc.setSelected(false);
                check_sup.setSelected(false);
                check_pa.setSelected(false);
                rdi_read.setSelected(false);
                edt_pass.setText(user.get(index).getPassWord());
                edt_user.setText(user.get(index).getUserName());
                if (user.get(index).isPermission_Edit()) {
                    rdi_edit.setSelected(true);
                } else
                    rdi_read.setSelected(true);
                if (user.get(index).isPermission_Doctor()) {
                    check_doc.setSelected(true);
                }
                if (user.get(index).isPermission_Supplies()) {
                    check_sup.setSelected(true);
                }
                if (user.get(index).isPermission_Patients()) {
                    check_pa.setSelected(true);
                }
                kt = false;
            } else {
                boolean check = false;
                if (rdi_edit.isSelected())
                    check = true;
                user.get(index).setUserName(edt_user.getText());
                user.get(index).setPassWord(edt_pass.getText());
                user.get(index).setPermission_Doctor(check_doc.isSelected());
                user.get(index).setPermission_Patients(check_pa.isSelected());
                user.get(index).setPermission_Supplies(check_sup.isSelected());
                user.get(index).setPermission_Edit(check);
                setSpace();
                showData();
                kt = true;
                Load_Database.writeUser();
                JOptionPane.showMessageDialog(rootPane, "ĐÃ LƯU THÀNH CÔNG !");

            }

        }

    }

    private void setSpace() {
        edt_user.setText("");
        edt_pass.setText("");
        rdi_edit.setSelected(false);
        rdi_read.setSelected(false);
        check_doc.setSelected(false);
        check_pa.setSelected(false);
        check_sup.setSelected(false);
    }

    private void rdi_readActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdi_readActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdi_readActionPerformed

    private void rdi_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdi_editActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_rdi_editActionPerformed

    private void edt_passActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_passActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_edt_passActionPerformed

    private void check_supActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_check_supActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_check_supActionPerformed

    private void check_paActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_check_paActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_check_paActionPerformed

    private void btn_deleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleActionPerformed
        delete();
        showData();
        Load_Database.writeUser();

    }// GEN-LAST:event_btn_deleActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
        Edit();
    }// GEN-LAST:event_btn_editActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_dele;
    private javax.swing.JButton btn_edit;
    private javax.swing.JCheckBox check_doc;
    private javax.swing.JCheckBox check_pa;
    private javax.swing.JCheckBox check_sup;
    private javax.swing.JTextField edt_pass;
    private javax.swing.JTextField edt_user;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdi_edit;
    private javax.swing.JRadioButton rdi_read;
    // End of variables declaration//GEN-END:variables
}
