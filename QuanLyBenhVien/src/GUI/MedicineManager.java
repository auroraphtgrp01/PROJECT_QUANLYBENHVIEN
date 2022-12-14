
package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.Load_Database;
import Object.Medicine;
import Object.UserHistory;

public class MedicineManager extends javax.swing.JFrame {
    static ArrayList<UserHistory> listUser = new ArrayList<>();
    static ArrayList<Medicine> listMedicind = new ArrayList<>();
    static ArrayList<String> list_Name = new ArrayList<>();
    DefaultTableModel model;

    public MedicineManager() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
    }

    private String idBN;

    public String getIdBN() {
        return idBN;
    }

    public void setIdBN(String idBN) {
        this.idBN = idBN;
    }

    private boolean edit = false;

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    public MedicineManager(String ma, boolean edit) {
        listUser.removeAll(listUser);
        listMedicind.removeAll(listMedicind);
        listUser = Load_Database.getListUserHSDontDecrypt();
        listMedicind = Load_Database.getListMedicineDontDecrypt();
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        showData(ma);
        setLocationRelativeTo(null);
        showComboData();
        setIdBN(ma);
        setEdit(edit);
        if (edit) {
            btn_add.setEnabled(true);
            edt_dc.setEditable(true);
            jComboBox1.setEnabled(true);
        } else {
            btn_add.setEnabled(false);
            edt_dc.setEditable(false);
            jComboBox1.setEnabled(false);
        }
    }

    public String tenThuoc(String ma) {
        for (Medicine x : listMedicind) {
            if (x.getId().trim().equalsIgnoreCase(ma.trim())) {
                return x.getName();
            }
        }
        return "";
    }

    public String congDung(String ma) {
        for (Medicine x : listMedicind) {
            if (x.getId().trim().equalsIgnoreCase(ma.trim())) {
                return x.getUses();
            }
        }
        return "";
    }

    public void showData(String ma) {
        model.setRowCount(0);
        for (UserHistory x : listUser) {
            if (x.getIdBN().trim().equalsIgnoreCase(ma.trim())) {
                model.addRow(new Object[] {
                        tenThuoc(x.getMathuoc()), x.getLieu(), congDung(x.getMathuoc())
                });
            }
        }
    }

    private void showComboData() {
        addNameMedicine();
        for (String s : list_Name) {
            jComboBox1.addItem(s);

        }
    }

    public void addNameMedicine() {

        for (int i = 0; i < listMedicind.size(); i++) {
            String s = listMedicind.get(i).getName();
            list_Name.add(s);
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edt_dc = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("CẤP PHÁT THUỐC");

        edt_dc.setEditable(true);
        edt_dc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edt_dc.setForeground(new java.awt.Color(102, 102, 255));
        edt_dc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_dcActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 153));
        jLabel30.setText("TÊN THUỐC:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 153));
        jLabel31.setText("HÀM LƯỢNG");

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 102, 102));
        btn_add.setText("THÊM");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "TÊN THUỐC", "HÀM LƯỢNG", "CÔNG DỤNG"
                }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 94,
                                                        Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(107, 107, 107))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(edt_dc,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBox1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING, 0, 226,
                                                                Short.MAX_VALUE))))
                                .addGap(20, 20, 20)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(edt_dc, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel31))
                                .addGap(18, 18, 18)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        dispose();
    }// GEN-LAST:event_formWindowClosing

    private void edt_dcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_dcActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_edt_dcActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
        addNew();
        showData(getIdBN());
    }// GEN-LAST:event_btn_addActionPerformed

    public void addNew() {
        String s = edt_dc.getText();
        int index = jComboBox1.getSelectedIndex();
        if (s == "") {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP HÀM LƯỢNG !");
        } else {
            listUser.add(new UserHistory(getIdBN(), s, listMedicind.get(index).getId()));
            Load_Database.writeFileUserHistory();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JTextField edt_dc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
