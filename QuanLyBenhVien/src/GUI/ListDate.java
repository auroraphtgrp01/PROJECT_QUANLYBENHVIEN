package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.DateList;

public class ListDate extends javax.swing.JFrame {
    public static ArrayList<DateList> a = new ArrayList<>();
    DefaultTableModel model;

    public ListDate(boolean edit) {
        a.removeAll(a);
        a = Supplie.getListE();
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
        showData();
        if (edit == false) {
            btn_dele.setEnabled(false);
        } else
            btn_dele.setEnabled(true);
    }

    public ListDate() {
        a.removeAll(a);
        a = Supplie.getListE();
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
        showData();

    }

    public void showData() {
        model.setRowCount(0);
        for (DateList x : a) {
            String s = String.valueOf(x.getSoNgayConLai());
            if (x.getSoNgayConLai() - 1 == 0) {
                s = "ĐÃ QUÁ HẠN";
            }
            if (x.getSoNgayConLai() - 1 < 0) {
                s = "ĐÃ QUÁ HẠN " + Math.abs(x.getSoNgayConLai()) + " NGÀY ";
            }
            model.addRow(new Object[] {
                    x.getMa(), x.getTen(), x.getNgayNhap(), x.getNgayXuat(), s
            });
        }
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_dele = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DANH SÁCH VẬT TƯ SẮP HẾT HẠN");
        setResizable(false);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "MÃ", "TÊN", "NGÀY NHẬP", "NGÀY HẾT HẠN", "SỐ NGÀY CÒN LẠI"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_dele.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dele.setForeground(new java.awt.Color(153, 0, 204));
        btn_dele.setText("XÓA");
        btn_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleActionPerformed(evt);
            }
        });

        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_close.setForeground(new java.awt.Color(153, 0, 204));
        btn_close.setText("ĐÓNG");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleActionPerformed
        int index = tbl.getSelectedRow();
        if (index != -1) {
            int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN XÓA KHÔNG ? ");
            if (result == JOptionPane.YES_OPTION) {
                Supplie x = new Supplie(a.get(index).getMa());
                JOptionPane.showMessageDialog(rootPane, "XÓA THÀNH CÔNG !");
            } else {
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ XÓA !");
            }
        }
    }// GEN-LAST:event_btn_deleActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_closeActionPerformed
        dispose();
    }// GEN-LAST:event_btn_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_dele;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
