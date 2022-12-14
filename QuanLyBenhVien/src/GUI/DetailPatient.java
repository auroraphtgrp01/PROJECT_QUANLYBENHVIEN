
package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Object.*;

public class DetailPatient extends javax.swing.JFrame {
        static ArrayList<DOCTOR> list_Doctors = Patient.get_list_Doctors();
        static ArrayList<String> list_Name = new ArrayList<>();
        static ArrayList<PATIENT> list_Patients = Patient.getListPatient();
        static ArrayList<FAMILY_OF_PATIENT> list_fmls = Patient.getListFML();

        private void showComboData() {
                addNameDoctor();
                for (String s : list_Name) {
                        box_bs.addItem(s);
                }
        }

        public DetailPatient() {
                initComponents();
                setLocationRelativeTo(null);
        }

        private boolean kt1 = false;

        public boolean isKt1() {
                return kt1;
        }

        public void setKt1(boolean kt1) {
                this.kt1 = kt1;
        }

        private int index_detail = 0;

        public int getIndex_detail() {
                return index_detail;
        }

        public void setIndex_detail(int index_detail) {

                this.index_detail = index_detail;
        }

        public void addNameDoctor() {
                for (int i = 0; i < list_Doctors.size(); i++) {
                        String s = list_Doctors.get(i).getID() + " - " + list_Doctors.get(i).getName();
                        list_Name.add(s);
                }
        }

        public DetailPatient(int index, boolean kt1) {
                initComponents();
                setLocationRelativeTo(null);
                showComboData();
                this.index_detail = index;
                setIndex_detail(index);
                setKt1(kt1);
                this.edt_ma.setText(list_Patients.get(index).getID());
                this.edt_ten.setText(list_Patients.get(index).getName());
                this.edt_mail.setText(list_Patients.get(index).getEmail());
                this.edt_phone.setText(list_Patients.get(index).getPhone());
                this.edt_dc.setText(list_Patients.get(index).getAddress());
                this.edt_mau.setText(list_Patients.get(index).getBlood_Group());
                this.edt_bhyt.setText(list_Patients.get(index).getId_BHYT());
                this.edt_tc.setText(list_Patients.get(index).getSymptom());
                this.edt_cdoan.setText(list_Patients.get(index).getDiagnose());
                this.edt_ts.setText(list_Patients.get(index).getMedical_history());
                this.edt_cao.setText(String.valueOf(list_Patients.get(index).getHeight()));
                this.edt_cannang.setText(String.valueOf(list_Patients.get(index).getWeight()));
                this.edt_tuoi.setText(String.valueOf(list_Patients.get(index).getAge()));
                this.edt_day.setText(list_Patients.get(index).getHospitalized_Day().toString());
                this.id_nn.setText(list_Patients.get(index).getId_FML());
                buttonGroup1.add(rdnam);
                buttonGroup1.add(rdnu);
                if (this.list_Patients.get(index).isSex()) {
                        this.rdnam.setSelected(true);
                } else
                        this.rdnu.setSelected(true);
                int indexbs = 0;
                for (int i = 0; i < list_Doctors.size(); i++) {
                        if (list_Doctors.get(i).getID().equals(list_Patients.get(index).getId_DOCTOR())) {
                                indexbs = i;
                        }
                }
                this.box_bs.setSelectedIndex(indexbs);
                this.namenn.setText(list_fmls.get(index).getName());
                this.id_nn.setText(list_fmls.get(index).getID());
                this.edt_idbn.setText(list_Patients.get(index).getID());
                this.sdtnn.setText(list_fmls.get(index).getPhone());
                this.edt_rlnn.setText(list_fmls.get(index).getRelationship_With_Patient());
                this.edt_tuoinn.setText(String.valueOf(list_fmls.get(index).getAge()));
                if (kt1) {
                        btn_edit.setEnabled(true);
                        btn_add.setEnabled(true);
                } else {
                        btn_edit.setEnabled(false);
                        btn_add.setEnabled(false);
                }
                setDisable();
        }

        public void setDisable() {
                edt_ma.setEditable(false);
                edt_ten.setEditable(false);
                edt_tuoi.setEditable(false);
                edt_phone.setEditable(false);
                edt_mail.setEditable(false);
                edt_bhyt.setEditable(false);
                edt_dc.setEditable(false);
                edt_ts.setEditable(false);
                edt_day.setEditable(false);
                edt_tc.setEditable(false);
                edt_cdoan.setEditable(false);
                id_nn.setEditable(false);
                namenn.setEditable(false);
                sdtnn.setEditable(false);
                edt_idbn.setEditable(false);
                edt_rlnn.setEditable(false);
                edt_tuoinn.setEditable(false);
                edt_cao.setEditable(false);
                edt_cannang.setEditable(false);
                edt_mau.setEditable(false);
                box_bs.setEnabled(false);
                kt = true;
        }

        private void initComponents() {
                buttonGroup1 = new javax.swing.ButtonGroup();
                jPanel29 = new javax.swing.JPanel();
                jLabel30 = new javax.swing.JLabel();
                edt_ma = new javax.swing.JTextField();
                jLabel34 = new javax.swing.JLabel();
                edt_ten = new javax.swing.JTextField();
                jLabel35 = new javax.swing.JLabel();
                edt_tuoi = new javax.swing.JTextField();
                jLabel32 = new javax.swing.JLabel();
                edt_phone = new javax.swing.JTextField();
                jLabel33 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                edt_mail = new javax.swing.JTextField();
                jLabel23 = new javax.swing.JLabel();
                edt_bhyt = new javax.swing.JTextField();
                edt_dc = new javax.swing.JTextField();
                jLabel36 = new javax.swing.JLabel();
                rdnam = new javax.swing.JRadioButton();
                rdnu = new javax.swing.JRadioButton();
                jPanel1 = new javax.swing.JPanel();
                jLabel37 = new javax.swing.JLabel();
                edt_ts = new javax.swing.JTextField();
                jLabel29 = new javax.swing.JLabel();
                jLabel38 = new javax.swing.JLabel();
                jLabel39 = new javax.swing.JLabel();
                jLabel40 = new javax.swing.JLabel();
                jLabel41 = new javax.swing.JLabel();
                edt_day = new javax.swing.JTextField();
                edt_tc = new javax.swing.JTextField();
                edt_cdoan = new javax.swing.JTextField();
                box_bs = new javax.swing.JComboBox<>();
                jLabel42 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jLabel43 = new javax.swing.JLabel();
                jLabel44 = new javax.swing.JLabel();
                id_nn = new javax.swing.JTextField();
                jLabel45 = new javax.swing.JLabel();
                namenn = new javax.swing.JTextField();
                jLabel46 = new javax.swing.JLabel();
                sdtnn = new javax.swing.JTextField();
                jLabel47 = new javax.swing.JLabel();
                edt_idbn = new javax.swing.JTextField();
                jLabel48 = new javax.swing.JLabel();
                jLabel49 = new javax.swing.JLabel();
                edt_rlnn = new javax.swing.JTextField();
                edt_tuoinn = new javax.swing.JTextField();
                jLabel50 = new javax.swing.JLabel();
                jLabel28 = new javax.swing.JLabel();
                jPanel25 = new javax.swing.JPanel();
                jLabel25 = new javax.swing.JLabel();
                edt_cao = new javax.swing.JTextField();
                edt_cannang = new javax.swing.JTextField();
                edt_mau = new javax.swing.JTextField();
                jLabel26 = new javax.swing.JLabel();
                jLabel27 = new javax.swing.JLabel();
                jLabel31 = new javax.swing.JLabel();
                btn_ref = new javax.swing.JButton();
                btn_show = new javax.swing.JButton();
                btn_add = new javax.swing.JButton();
                btn_edit = new javax.swing.JButton();

                setResizable(false);
                setSize(new java.awt.Dimension(1100, 600));

                jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel30.setForeground(new java.awt.Color(0, 153, 153));
                jLabel30.setText("MÃ BỆNH NHÂN: ");

                edt_ma.setEditable(true);
                edt_ma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_ma.setForeground(new java.awt.Color(102, 102, 255));
                edt_ma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_maActionPerformed(evt);
                        }
                });

                jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel34.setForeground(new java.awt.Color(0, 153, 153));
                jLabel34.setText("TUỔI");

                edt_ten.setEditable(true);
                edt_ten.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_ten.setForeground(new java.awt.Color(102, 102, 255));
                edt_ten.setEnabled(true);
                edt_ten.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_tenActionPerformed(evt);
                        }
                });

                jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel35.setForeground(new java.awt.Color(0, 153, 153));
                jLabel35.setText("SỐ ĐIỆN THOẠI:");

                edt_tuoi.setEditable(true);
                edt_tuoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_tuoi.setForeground(new java.awt.Color(102, 102, 255));
                edt_tuoi.setEnabled(true);
                edt_tuoi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_tuoiActionPerformed(evt);
                        }
                });

                jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel32.setForeground(new java.awt.Color(0, 153, 153));
                jLabel32.setText("HỌ VÀ TÊN");

                edt_phone.setEditable(true);
                edt_phone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_phone.setForeground(new java.awt.Color(102, 102, 255));
                edt_phone.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_phoneActionPerformed(evt);
                        }
                });

                jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel33.setForeground(new java.awt.Color(0, 153, 153));
                jLabel33.setText("ĐỊA CHỈ");

                jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(0, 153, 153));
                jLabel22.setText("EMAIL:");

                edt_mail.setEditable(true);
                edt_mail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_mail.setForeground(new java.awt.Color(102, 102, 255));
                edt_mail.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_mailActionPerformed(evt);
                        }
                });

                jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(0, 153, 153));
                jLabel23.setText("ID_BHYT:");

                edt_bhyt.setEditable(true);
                edt_bhyt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_bhyt.setForeground(new java.awt.Color(102, 102, 255));
                edt_bhyt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_bhytActionPerformed(evt);
                        }
                });

                edt_dc.setEditable(true);
                edt_dc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_dc.setForeground(new java.awt.Color(102, 102, 255));
                edt_dc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_dcActionPerformed(evt);
                        }
                });

                jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel36.setForeground(new java.awt.Color(0, 153, 153));
                jLabel36.setText("GIỚI TÍNH:");

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

                javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
                jPanel29.setLayout(jPanel29Layout);
                jPanel29Layout.setHorizontalGroup(
                                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel29Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel29Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel29Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel30,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                125,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(edt_ma))
                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jLabel35,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(jLabel32,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                108,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(jLabel34,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                80,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(jLabel22,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                92,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(jLabel23,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                79,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addGap(0, 17, Short.MAX_VALUE)))
                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                                                .addComponent(rdnam,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                71,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addComponent(rdnu,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                51,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGap(5, 5, 5)
                                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(edt_phone,
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                .addGroup(jPanel29Layout
                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                .addComponent(edt_mail,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                221,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                .addGap(0, 0,
                                                                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                                                                .addComponent(edt_dc,
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                222,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(edt_tuoi)
                                                                                                                                                                                                .addComponent(edt_ten)
                                                                                                                                                                                                .addComponent(edt_bhyt))))))
                                                                                                                .addGap(16, 16, 16))
                                                                                .addGroup(jPanel29Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel29Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel36,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                80,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel33,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                95,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))));
                jPanel29Layout.setVerticalGroup(
                                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel29Layout.createSequentialGroup()
                                                                .addGap(0, 0, 0)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel30)
                                                                                .addComponent(edt_ma,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_ten,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel32))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_tuoi,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel34,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(rdnam,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(rdnu,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                27,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_dc,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_mail,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel22))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_phone,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel29Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_bhyt,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel23))
                                                                .addGap(80, 80, 80)));

                jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel37.setForeground(new java.awt.Color(0, 153, 153));
                jLabel37.setText("TRIỆU CHỨNG");

                edt_ts.setEditable(true);
                edt_ts.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_ts.setForeground(new java.awt.Color(102, 102, 255));
                edt_ts.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_tsActionPerformed(evt);
                        }
                });

                jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel29.setForeground(new java.awt.Color(255, 102, 51));
                jLabel29.setText("THÔNG TIN BỆNH ÁN");

                jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel38.setForeground(new java.awt.Color(0, 153, 153));
                jLabel38.setText("NGÀY VÀO VIỆN: ");

                jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel39.setForeground(new java.awt.Color(0, 153, 153));
                jLabel39.setText("CHẨN ĐOÁN CỦA BS:");

                jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel40.setForeground(new java.awt.Color(0, 153, 153));
                jLabel40.setText("TIỀN SỬ BỆNH ÁN: ");

                jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel41.setForeground(new java.awt.Color(0, 153, 153));
                jLabel41.setText("BÁC SĨ PHỤ TRÁCH:");

                edt_day.setEditable(true);
                edt_day.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_day.setForeground(new java.awt.Color(102, 102, 255));
                edt_day.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_dayActionPerformed(evt);
                        }
                });

                edt_tc.setEditable(true);
                edt_tc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_tc.setForeground(new java.awt.Color(102, 102, 255));
                edt_tc.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_tcActionPerformed(evt);
                        }
                });

                edt_cdoan.setEditable(true);
                edt_cdoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_cdoan.setForeground(new java.awt.Color(102, 102, 255));
                edt_cdoan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_cdoanActionPerformed(evt);
                        }
                });

                box_bs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
                box_bs.setToolTipText("");
                box_bs.setEnabled(false);
                box_bs.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                box_bsActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel40,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                125,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel39,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel41,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                125,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel37,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                103,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(edt_cdoan)
                                                                                                                .addComponent(edt_ts)
                                                                                                                .addComponent(box_bs,
                                                                                                                                0,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(edt_tc)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel38,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                125,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(45, 45, 45)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jLabel29,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                258,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(edt_day))))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(15, Short.MAX_VALUE)
                                                                .addComponent(jLabel29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel38,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_day,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_tc,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel37,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_cdoan,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel39,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_ts,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(box_bs,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                41,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

                jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel42.setForeground(new java.awt.Color(153, 0, 204));
                jLabel42.setText("HỒ SƠ BỆNH ÁN");

                jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel43.setForeground(new java.awt.Color(255, 102, 51));
                jLabel43.setText("          THÔNG TIN NGƯỜI NHÀ");

                jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel44.setForeground(new java.awt.Color(0, 153, 153));
                jLabel44.setText("MÃ NGƯỜI NHÀ");

                id_nn.setEditable(true);
                id_nn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                id_nn.setForeground(new java.awt.Color(102, 102, 255));
                id_nn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                id_nnActionPerformed(evt);
                        }
                });

                jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel45.setForeground(new java.awt.Color(0, 153, 153));
                jLabel45.setText("HỌ VÀ TÊN:");

                namenn.setEditable(true);
                namenn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                namenn.setForeground(new java.awt.Color(102, 102, 255));
                namenn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                namennActionPerformed(evt);
                        }
                });

                jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel46.setForeground(new java.awt.Color(0, 153, 153));

                sdtnn.setEditable(true);
                sdtnn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                sdtnn.setForeground(new java.awt.Color(102, 102, 255));
                sdtnn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sdtnnActionPerformed(evt);
                        }
                });

                jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel47.setForeground(new java.awt.Color(0, 153, 153));
                jLabel47.setText("SỐ ĐIỆN THOẠI:");

                edt_idbn.setEditable(true);
                edt_idbn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_idbn.setForeground(new java.awt.Color(102, 102, 255));
                edt_idbn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_idbnActionPerformed(evt);
                        }
                });

                jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel48.setForeground(new java.awt.Color(0, 153, 153));
                jLabel48.setText("MÃ BỆNH NHÂN:");

                jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel49.setForeground(new java.awt.Color(0, 153, 153));
                jLabel49.setText("QUAN HỆ VỚI BN: ");

                edt_rlnn.setEditable(true);
                edt_rlnn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_rlnn.setForeground(new java.awt.Color(102, 102, 255));
                edt_rlnn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_rlnnActionPerformed(evt);
                        }
                });

                edt_tuoinn.setEditable(true);
                edt_tuoinn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_tuoinn.setForeground(new java.awt.Color(102, 102, 255));
                edt_tuoinn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_tuoinnActionPerformed(evt);
                        }
                });

                jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel50.setForeground(new java.awt.Color(0, 153, 153));
                jLabel50.setText("TUỔI:");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(205, 205, 205)
                                                                .addComponent(jLabel43,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(96, 96, 96))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel45,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                91,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(28, 28, 28))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel2Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jLabel44,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel47,
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(id_nn,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                201, Short.MAX_VALUE)
                                                                                .addComponent(namenn)
                                                                                .addComponent(sdtnn,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                117,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel49,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                126,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(edt_rlnn,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                201,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(edt_tuoinn))
                                                                                                .addGap(3, 3, 3)
                                                                                                .addComponent(jLabel46,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                117,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel48,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                126,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(edt_idbn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                201,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                33,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(id_nn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel2Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel48,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                36,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(edt_idbn,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                44,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(namenn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                44,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel45,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                24,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel46,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                36,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                36,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(edt_tuoinn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(sdtnn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(edt_rlnn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel49,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel28.setForeground(new java.awt.Color(255, 102, 51));
                jLabel28.setText("THÔNG TIN CƠ THỂ");

                jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(0, 153, 153));
                jLabel25.setText("CHIỀU CAO:");

                edt_cao.setEditable(true);
                edt_cao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_cao.setForeground(new java.awt.Color(102, 102, 255));
                edt_cao.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_caoActionPerformed(evt);
                        }
                });

                edt_cannang.setEditable(true);
                edt_cannang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_cannang.setForeground(new java.awt.Color(102, 102, 255));
                edt_cannang.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_cannangActionPerformed(evt);
                        }
                });

                edt_mau.setEditable(true);
                edt_mau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                edt_mau.setForeground(new java.awt.Color(102, 102, 255));
                edt_mau.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                edt_mauActionPerformed(evt);
                        }
                });

                jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel26.setForeground(new java.awt.Color(0, 153, 153));
                jLabel26.setText("CÂN NẶNG");

                jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
                jLabel27.setForeground(new java.awt.Color(0, 153, 153));
                jLabel27.setText("NHÓM MÁU:");

                javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
                jPanel25.setLayout(jPanel25Layout);
                jPanel25Layout.setHorizontalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel25Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel25Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel25,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                98,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel25Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel25Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel26,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                84,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel27,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                91,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel25Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(edt_mau,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                85,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel25Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addComponent(edt_cannang,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                84,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(edt_cao,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)))
                                                                .addGap(16, 16, 16)));
                jPanel25Layout.setVerticalGroup(
                                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel25Layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addGroup(jPanel25Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel25)
                                                                                .addComponent(edt_cao,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel25Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_cannang,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel26))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel25Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(edt_mau,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                44,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel27))
                                                                .addContainerGap()));

                jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel31.setForeground(new java.awt.Color(255, 102, 51));
                jLabel31.setText("THÔNG TIN CÁ NHÂN ");

                btn_ref.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btn_ref.setForeground(new java.awt.Color(255, 102, 102));
                btn_ref.setText("QUẢN LÍ THUỐC");
                btn_ref.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_refActionPerformed(evt);
                        }
                });

                btn_show.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btn_show.setForeground(new java.awt.Color(255, 102, 102));
                btn_show.setText("XEM THÔNG TIN BS");
                btn_show.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_showActionPerformed(evt);
                        }
                });

                btn_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btn_add.setForeground(new java.awt.Color(255, 102, 102));
                btn_add.setText("LƯU");
                btn_add.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_addActionPerformed(evt);
                        }
                });

                btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                btn_edit.setForeground(new java.awt.Color(255, 102, 102));
                btn_edit.setText("SỦA");
                btn_edit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_editActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jPanel29,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel31,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                208,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(69, 69, 69)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btn_edit,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                177,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(btn_add,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                165,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(32, 32, 32)
                                                                                                .addComponent(jPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel28,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jPanel25,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(53, 53, 53)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                                .addComponent(btn_show,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(btn_ref,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel42)
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                703,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel42)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(jPanel1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addComponent(jLabel28)
                                                                                                                                                .addGap(31, 31, 31)
                                                                                                                                                .addComponent(jPanel25,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(btn_ref,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                36,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addComponent(btn_show,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                34,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jPanel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel31)
                                                                                                                .addGap(28, 28, 28)
                                                                                                                .addComponent(jPanel29,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                399,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(btn_edit,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                48,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(btn_add,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                48,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(20, 20, 20)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        Boolean kt = false;

        private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
                if (kt) {
                        edt_ma.setEditable(true);
                        edt_ten.setEditable(true);
                        edt_tuoi.setEditable(true);
                        edt_phone.setEditable(true);
                        edt_mail.setEditable(true);
                        edt_bhyt.setEditable(true);
                        edt_dc.setEditable(true);
                        edt_ts.setEditable(true);
                        edt_day.setEditable(true);
                        edt_tc.setEditable(true);
                        edt_cdoan.setEditable(true);
                        id_nn.setEditable(true);
                        namenn.setEditable(true);
                        sdtnn.setEditable(true);
                        edt_idbn.setEditable(true);
                        edt_rlnn.setEditable(true);
                        edt_tuoinn.setEditable(true);
                        edt_cao.setEditable(true);
                        edt_cannang.setEditable(true);
                        edt_mau.setEditable(true);
                        box_bs.setEnabled(true);
                        kt = false;
                } else {
                        edt_ma.setEditable(false);
                        edt_ten.setEditable(false);
                        edt_tuoi.setEditable(false);
                        edt_phone.setEditable(false);
                        edt_mail.setEditable(false);
                        edt_bhyt.setEditable(false);
                        edt_dc.setEditable(false);
                        edt_ts.setEditable(false);
                        edt_day.setEditable(false);
                        edt_tc.setEditable(false);
                        edt_cdoan.setEditable(false);
                        id_nn.setEditable(false);
                        namenn.setEditable(false);
                        sdtnn.setEditable(false);
                        edt_idbn.setEditable(false);
                        edt_rlnn.setEditable(false);
                        edt_tuoinn.setEditable(false);
                        edt_cao.setEditable(false);
                        edt_cannang.setEditable(false);
                        edt_mau.setEditable(false);
                        box_bs.setEnabled(false);
                        kt = true;
                }

        }// GEN-LAST:event_btn_editActionPerformed

        private void box_bsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_box_bsActionPerformed

        }// GEN-LAST:event_box_bsActionPerformed

        private static int index_bs = 0;

        public static int getIndex() {
                index_bs = box_bs.getSelectedIndex();
                return index_bs;
        }

        private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_showActionPerformed
                index_bs = box_bs.getSelectedIndex();
                // INFO_DOCTOR x = new INFO_DOCTOR(index_bs);
                ReadInfoDoctor x1 = new ReadInfoDoctor(index_bs);
                x1.setVisible(true);

        }// GEN-LAST:event_btn_showActionPerformed

        private void edt_caoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_caoActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_caoActionPerformed

        private void edt_cannangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_cannangActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_cannangActionPerformed

        private void edt_mauActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_mauActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_mauActionPerformed

        private void edt_phoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_phoneActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_phoneActionPerformed

        private void edt_mailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_mailActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_mailActionPerformed

        private void edt_dcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_dcActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_dcActionPerformed

        private void edt_bhytActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_bhytActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_bhytActionPerformed

        private void edt_tuoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_tuoiActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_tuoiActionPerformed

        private void edt_tenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_tenActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_tenActionPerformed

        private void edt_maActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_maActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_maActionPerformed

        private void rdnamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdnamActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_rdnamActionPerformed

        private void rdnuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rdnuActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_rdnuActionPerformed

        private void edt_tsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_tsActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_tsActionPerformed

        private void edt_dayActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_dayActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_dayActionPerformed

        private void edt_tcActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_tcActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_tcActionPerformed

        private void edt_cdoanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_cdoanActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_cdoanActionPerformed

        private void id_nnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_id_nnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_id_nnActionPerformed

        private void namennActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_namennActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_namennActionPerformed

        private void sdtnnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sdtnnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_sdtnnActionPerformed

        private void edt_idbnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_idbnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_idbnActionPerformed

        private void edt_rlnnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_rlnnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_rlnnActionPerformed

        private void edt_tuoinnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_edt_tuoinnActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_edt_tuoinnActionPerformed

        private void btn_refActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_refActionPerformed
                MedicineManager x = new MedicineManager(list_Patients.get(getIndex_detail()).getID(), isKt1());
                x.setVisible(true);
        }// GEN-LAST:event_btn_refActionPerformed

        private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
                boolean gt = false;
                index_bs = box_bs.getSelectedIndex();

                if (rdnam.isSelected()) {
                        gt = true;
                } else
                        gt = false;
                int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN LƯU !");
                if (JOptionPane.YES_OPTION == result) {
                        JOptionPane.showMessageDialog(rootPane, "BẠN ĐÃ LƯU THÀNH CÔNG !!!");
                        Patient x1 = new Patient(edt_ma.getText(), edt_ten.getText(),
                                        edt_mail.getText(),
                                        edt_phone.getText(), edt_dc.getText(), gt,
                                        Double.parseDouble(edt_tuoi.getText()),
                                        edt_mau.getText(), edt_bhyt.getText(), edt_tc.getText(), edt_cdoan.getText(),
                                        edt_ts.getText(),
                                        Double.parseDouble(edt_cannang.getText()),
                                        Double.parseDouble(edt_cao.getText()),
                                        new Date(edt_day.getText()), id_nn.getText(),
                                        list_Doctors.get(index_bs).getID(),
                                        edt_rlnn.getText(),
                                        Double.parseDouble(edt_tuoinn.getText()), sdtnn.getText(),
                                        namenn.getText(), index_detail, id_nn.getText());
                        setVisible(false);

                }
        }// GEN-LAST:event_btn_addActionPerformed
         // Variables declaration - do not modify//GEN-BEGIN:variables

        private static javax.swing.JComboBox<String> box_bs;
        private javax.swing.JButton btn_add;
        private javax.swing.JButton btn_edit;
        private javax.swing.JButton btn_ref;
        private javax.swing.JButton btn_show;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JTextField edt_bhyt;
        private javax.swing.JTextField edt_cannang;
        private javax.swing.JTextField edt_cao;
        private javax.swing.JTextField edt_cdoan;
        private javax.swing.JTextField edt_day;
        private javax.swing.JTextField edt_dc;
        private javax.swing.JTextField edt_idbn;
        private javax.swing.JTextField edt_ma;
        private javax.swing.JTextField edt_mail;
        private javax.swing.JTextField edt_mau;
        private javax.swing.JTextField edt_phone;
        private javax.swing.JTextField edt_rlnn;
        private javax.swing.JTextField edt_tc;
        private javax.swing.JTextField edt_ten;
        private javax.swing.JTextField edt_ts;
        private javax.swing.JTextField edt_tuoi;
        private javax.swing.JTextField edt_tuoinn;
        private javax.swing.JTextField id_nn;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel38;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel40;
        private javax.swing.JLabel jLabel41;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel45;
        private javax.swing.JLabel jLabel46;
        private javax.swing.JLabel jLabel47;
        private javax.swing.JLabel jLabel48;
        private javax.swing.JLabel jLabel49;
        private javax.swing.JLabel jLabel50;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel25;
        private javax.swing.JPanel jPanel29;
        private javax.swing.JTextField namenn;
        private javax.swing.JRadioButton rdnam;
        private javax.swing.JRadioButton rdnu;
        private javax.swing.JTextField sdtnn;
        // End of variables declaration//GEN-END:variables
}
