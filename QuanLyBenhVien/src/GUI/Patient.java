
package GUI;

import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.*;

public class Patient extends javax.swing.JFrame {
    DefaultTableModel model;
    static ArrayList<PATIENT> list_Patients = new ArrayList();
    static ArrayList<DOCTOR> list_Doctors = new ArrayList();
    static ArrayList<FAMILY_OF_PATIENT> list_fmls = new ArrayList();
    static ArrayList<String> list_Name = new ArrayList<>();

    public void addNameDoctor() {
        for (int i = 0; i < list_Doctors.size(); i++) {
            String s = list_Doctors.get(i).getID() + " - " + list_Doctors.get(i).getName();
            list_Name.add(s);
        }
    }

    private boolean kt = false;

    public boolean isKt() {
        return kt;
    }

    public void setKt(boolean kt) {
        this.kt = kt;
    }

    // Open from MainActivity
    public Patient(boolean kt) {
        list_Doctors.removeAll(list_Doctors);
        list_fmls.removeAll(list_fmls);
        list_Patients.removeAll(list_Patients);
        this.kt = kt;
        setKt(kt);
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl_info.getModel();
        showData();
        if (kt) {
            btn_add.setEnabled(true);
            btn_dele.setEnabled(true);
            btn_save.setEnabled(true);

        } else {
            btn_add.setEnabled(false);
            btn_dele.setEnabled(false);
            btn_save.setEnabled(false);

        }
    }

    public void showData() {
        model.setRowCount(0);
        for (PATIENT x : list_Patients) {
            String sex;
            if (x.isSex()) {
                sex = "Nam";
            } else
                sex = "Nữ";
            model.addRow(new Object[] {
                    x.getID(), x.getName(), sex, x.getAge(), x.getAddress(), x.getSymptom(), x.getDiagnose(),
                    x.getHospitalized_Day(), x.getId_DOCTOR()

            });
        }
    }

    /**
     * Creates new form MainActivity_PATIENTS
     */
    public static ArrayList<DOCTOR> get_list_Doctors() {
        return list_Doctors;
    }

    public static ArrayList<PATIENT> getListPatient() {
        return list_Patients;
    }

    public static ArrayList<FAMILY_OF_PATIENT> getListFML() {
        return list_fmls;
    }

    public Patient() {
        initComponents();
        model = (DefaultTableModel) tbl_info.getModel();
    }

    private Boolean gt = false;

    // Add Patient
    public Patient(String iD, String name, String email, String phone, String address, boolean sex,
            double age,
            String blood_Group, String id_BHYT, String symptom, String diagnose, String medical_history, double weight,
            double height, Date hospitalized_Day, String id_FML, String id_DOCTOR, String qhnn,
            double agenn, String sdtnn, String namenn) {
        list_fmls.add(new FAMILY_OF_PATIENT(id_FML, namenn, sdtnn, agenn, qhnn, iD));
        list_Patients.add(new PATIENT(iD, name, email, phone, address, sex, age, blood_Group, id_BHYT, symptom,
                diagnose, medical_history, weight, height, hospitalized_Day, id_FML, id_DOCTOR));

    }

    int idx_a = 0;

    // Edit Patient
    public Patient(String iD, String name, String email, String phone, String address, boolean sex,
            double age,
            String blood_Group, String id_BHYT, String symptom, String diagnose, String medical_history, double weight,
            double height, Date hospitalized_Day, String id_FML, String id_DOCTOR, String qhnn,
            double agenn, String sdtnn, String namenn, int idx_a, String idnn) {

        list_Patients.get(idx_a).setID(iD);
        list_Patients.get(idx_a).setBlood_Group(blood_Group);
        list_Patients.get(idx_a).setId_BHYT(id_BHYT);
        list_Patients.get(idx_a).setSex(sex);
        list_Patients.get(idx_a).setSymptom(symptom);
        list_Patients.get(idx_a).setDiagnose(diagnose);
        list_Patients.get(idx_a).setMedical_history(medical_history);
        list_Patients.get(idx_a).setWeight(weight);
        list_Patients.get(idx_a).setHeight(height);
        list_Patients.get(idx_a).setHospitalized_Day(hospitalized_Day);
        list_Patients.get(idx_a).setId_FML(id_FML);
        list_Patients.get(idx_a).setId_DOCTOR(id_DOCTOR);
        list_Patients.get(idx_a).setName(name);
        list_Patients.get(idx_a).setEmail(email);
        list_Patients.get(idx_a).setPhone(phone);
        list_Patients.get(idx_a).setAddress(address);
        list_Patients.get(idx_a).setAge(age);
        list_fmls.get(idx_a).setRelationship_With_Patient(qhnn);
        list_fmls.get(idx_a).setAge(agenn);
        list_fmls.get(idx_a).setPhone(sdtnn);
        list_fmls.get(idx_a).setName(namenn);
        list_fmls.get(idx_a).setId_OfPatient(iD);
        list_fmls.get(idx_a).setID(idnn);

    }

    public void data() {
        list_Doctors = Load_Database.getListDoctorDoNotDecrypt();
        list_Patients = Load_Database.getListPatientDoNotDecrypt();
        list_fmls = Load_Database.getListFmlDoNotDecrypt();
    }

    private void initComponents() {
        data();
        jPanel2 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        btn_dele = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_info = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_load = new javax.swing.JButton();
        btn_ref = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        edt_find = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("QUẢN LÍ THÔNG TIN BỆNH NHÂN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 102, 255));
        btn_add.setText("THÊM MỚI");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_detail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_detail.setForeground(new java.awt.Color(0, 102, 255));
        btn_detail.setText("XEM THÔNG TIN");
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        btn_dele.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_dele.setForeground(new java.awt.Color(0, 102, 255));
        btn_dele.setText("XÓA ĐỐI TƯỢNG");
        btn_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_dele, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_detail))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(41, Short.MAX_VALUE)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("QUẢN LÍ THÔNG TIN BỆNH NHÂN");

        tbl_info.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "MÃ BN", "HỌ VÀ TÊN", "GIỚI TÍNH", "TUỔI", "ĐỊA CHỈ", "TRIỆU CHỨNG", "CHẨN ĐOÁN",
                        "NGÀY VÀO VIỆN", "BS PHỤ TRÁCH"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_info);
        if (tbl_info.getColumnModel().getColumnCount() > 0) {
            tbl_info.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbl_info.getColumnModel().getColumn(1).setPreferredWidth(90);
            tbl_info.getColumnModel().getColumn(2).setPreferredWidth(45);
            tbl_info.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbl_info.getColumnModel().getColumn(4).setPreferredWidth(90);
            tbl_info.getColumnModel().getColumn(5).setPreferredWidth(150);
            tbl_info.getColumnModel().getColumn(6).setPreferredWidth(150);
            tbl_info.getColumnModel().getColumn(7).setPreferredWidth(100);
            tbl_info.getColumnModel().getColumn(8).setPreferredWidth(70);
        }

        btn_load.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_load.setForeground(new java.awt.Color(0, 102, 255));
        btn_load.setText("LOAD DATA");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        btn_ref.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ref.setForeground(new java.awt.Color(0, 102, 255));
        btn_ref.setText("LÀM MỚI");
        btn_ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 102, 255));
        btn_save.setText("LƯU");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        edt_find.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        edt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_findActionPerformed(evt);
            }
        });
        edt_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edt_findKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("TÌM KIẾM THEO MÃ: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(66, Short.MAX_VALUE)
                                .addComponent(btn_load)
                                .addGap(44, 44, 44)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_ref, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(352, 352, 352)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 709,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 998,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 13, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1005, 1005, 1005))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)));

        pack();

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
    }// GEN-LAST:event_formWindowClosing

    // GEN-LAST:event_edt_findActionPerformed

    private void edt_findKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_edt_findKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findMa();
        }

    }// GEN-LAST:event_edt_findKeyPressed

    private void edt_findActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btn_deleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_deleActionPerformed
        int index = tbl_info.getSelectedRow();
        int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN XÓA ? ");
        if (result == JOptionPane.YES_OPTION) {
            list_Patients.remove(index);
            showData();
        }
    }// GEN-LAST:event_btn_deleActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_save1ActionPerformed
        findMa();

    }// GEN-LAST:event_btn_save1ActionPerformed

    private void btn_doctor01ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_doctor01ActionPerformed
        // // TODO add your handling code here:
        // passwordFrame x = new passwordFrame();
        // x.setVisible(true);

    }// GEN-LAST:event_btn_doctor01ActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮC MUỐN LƯU KHÔNG ? ");
        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "BẠN ĐÃ LƯU THÀNH CÔNG DỮ LIỆU ! ");
            Load_Database.writeFile_Patient();
            Load_Database.writeFile_Fml();
        }
    }// GEN-LAST:event_btn_saveActionPerformed

    int count = 0;

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_loadActionPerformed
        addNameDoctor();
        CreatePatient x = new CreatePatient();
        x.setVisible(true);
        count++;
    }// GEN-LAST:event_btn_loadActionPerformed

    private void btn_refActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_refActionPerformed
        showData();
    }// GEN-LAST:event_btn_refActionPerformed

    public void detail(int index1) {
        count++;

        int index = index1;
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "HÃY CHỌN 1 DÒNG ĐỂ XEM!");
        } else {
            if (list_Doctors.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "KHÔNG CÓ GÌ ĐỂ XEM !");
            } else {
                DetailPatient x = new DetailPatient(index, isKt());
                x.setVisible(true);

            }
        }
    }

    public void findMa() {
        String ma = edt_find.getText().trim();
        boolean kt = false;
        for (int i = 0; i < list_Patients.size(); i++) {

            if (list_Patients.get(i).getID().trim().equalsIgnoreCase(ma)) {
                detail(i);
                kt = true;
                break;
            }
        }
        if (kt == false) {
            JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI MÃ NÀY !!!");
        }
    }

    public static ArrayList<String> getData_listName() {

        return list_Name;
    }

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_detailActionPerformed
        int index = tbl_info.getSelectedRow();
        detail(index);
    }// GEN-LAST:event_btn_detailActionPerformed

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {
        if (count != 0) {
            int result = JOptionPane.showConfirmDialog(rootPane,
                    "BẠN ĐÃ CÓ SỰ THAY ĐỔI THÔNG TIN, NẾU LOAD LẠI DỮ LIỆU ĐÃ THAY ĐỔI SẼ BIẾN MẤT, VẪN TIẾP TỤC ?");
            if (JOptionPane.YES_OPTION == result) {
                list_Patients.removeAll(list_Patients);
                list_fmls.removeAll(list_fmls);
                Load_Database.readFile_Patient();
                Load_Database.readFile_Fml();
                showData();
            }
        }
        list_Patients.removeAll(list_Patients);
        list_fmls.removeAll(list_fmls);
        Load_Database.readFile_Patient();
        Load_Database.readFile_Fml();
        showData();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed

    }// GEN-LAST:event_jComboBox1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_dele;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_ref;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField edt_find;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_info;
    // End of variables declaration//GEN-END:variables
}
