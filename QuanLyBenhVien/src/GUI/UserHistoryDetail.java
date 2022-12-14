package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.Load_Database;
import Object.UserHistory;

public class UserHistoryDetail extends javax.swing.JFrame {
    static ArrayList<UserHistory> listUserHistory = new ArrayList<>();
    DefaultTableModel model;

    public UserHistoryDetail() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
    }

    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public UserHistoryDetail(String ID, boolean edit) {
        listUserHistory.removeAll(listUserHistory);
        listUserHistory = Load_Database.getListUserHSDontDecrypt();
        setID(ID);
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
        showData(ID);
        if (edit == false) {
            btn_dele.setEnabled(false);
            btn_new.setEnabled(false);
            btn_edit.setEnabled(false);
        } else {
            btn_dele.setEnabled(true);
            btn_new.setEnabled(true);
            btn_edit.setEnabled(true);
        }
    }

    // -----METHOD-----------------------------------------------------
    public void showData(String ID) {
        model.setRowCount(0);
        for (UserHistory x : listUserHistory) {
            if (ID.trim().equalsIgnoreCase(x.getMathuoc().trim())) {
                model.addRow(new Object[] {
                        x.getIdBN(), x.getLieu()
                });
            }
        }
    }

    // -----METHOD-----------------------------------------------------
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edt_lieu = new javax.swing.JTextField();
        edt_ma = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_dele = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LỊCH SỬ CẤP PHÁT VẬT TƯ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }

            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("QUẢN LÝ LỊCH SỬ XUẤT VẬT TƯ");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "MÃ BỆNH NHÂN", "LIỀU XUẤT SỬ DỤNG"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(166, 60, 41));
        jLabel2.setText("LIỀU XUẤT SỬ DỤNG: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(166, 60, 41));
        jLabel3.setText("MÃ BỆNH NHÂN: ");

        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(153, 0, 204));
        btn_edit.setText("SỬA / LƯU");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_new.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_new.setForeground(new java.awt.Color(153, 0, 204));
        btn_new.setText("TẠO MỚI");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_dele.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dele.setForeground(new java.awt.Color(153, 0, 204));
        btn_dele.setText("XÓA");
        btn_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 275,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                                .createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btn_dele,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(btn_edit,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(edt_ma,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                122,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(edt_lieu,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                122,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addComponent(btn_new,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(116, 116, 116)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(edt_ma, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(edt_lieu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(85, 85, 85))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 18, Short.MAX_VALUE)))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

    }// GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

        dispose();
    }// GEN-LAST:event_formWindowClosing

    int d = 0;

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
        int index = tbl.getSelectedRow();
        if (index != -1) {
            if (d == 0) {
                edt_ma.setText(listUserHistory.get(index).getIdBN());
                edt_lieu.setText(listUserHistory.get(index).getLieu());
                d++;
            } else {
                listUserHistory.get(index).setIdBN(edt_ma.getText());
                listUserHistory.get(index).setLieu(edt_lieu.getText());
                JOptionPane.showMessageDialog(rootPane, "LƯU THÀNH CÔNG !");
                Load_Database.writeFileUserHistory();
                showData(getID());
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ SỬA !");
        }
    }// GEN-LAST:event_btn_editActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_newActionPerformed
        if (edt_ma.getText().equals("") || edt_lieu.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP ĐẦY ĐỦ !");
        } else {
            listUserHistory.add(new UserHistory(edt_ma.getText(), edt_lieu.getText(), getID()));
            edt_lieu.setText("");
            edt_ma.setText("");
            Load_Database.writeFileUserHistory();
            showData(getID());
        }

    }// GEN-LAST:event_btn_newActionPerformed

    private void btn_deleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleActionPerformed
        int index = tbl.getSelectedRow();
        if (index != -1) {
            int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN XÓA ?");
            if (result == JOptionPane.YES_OPTION) {
                listUserHistory.remove(index);
                Load_Database.writeFileUserHistory();
                showData(getID());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ SỬA !");
        }
    }// GEN-LAST:event_btn_deleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dele;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_new;
    private javax.swing.JTextField edt_lieu;
    private javax.swing.JTextField edt_ma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
