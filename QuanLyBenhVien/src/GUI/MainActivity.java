package GUI;

import java.util.Date;

import Object.*;
import java.awt.Color;
import java.awt.event.WindowEvent;

public class MainActivity extends javax.swing.JFrame {

    private String userName, passWord;
    private boolean permission_Doctor = false,
            permission_Supplies = false,
            permission_Patients = false,
            permission_Edit = false,
            permission_User = false;

    public boolean isPermission_User() {
        return permission_User;
    }

    public void setPermission_User(boolean permission_User) {
        this.permission_User = permission_User;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isPermission_Doctor() {
        return permission_Doctor;
    }

    public void setPermission_Doctor(boolean permission_Doctor) {
        this.permission_Doctor = permission_Doctor;
    }

    public boolean isPermission_Supplies() {
        return permission_Supplies;
    }

    public void setPermission_Supplies(boolean permission_Supplies) {
        this.permission_Supplies = permission_Supplies;
    }

    public boolean isPermission_Patients() {
        return permission_Patients;
    }

    public void setPermission_Patients(boolean permission_Patients) {
        this.permission_Patients = permission_Patients;
    }

    public boolean isPermission_Edit() {
        return permission_Edit;
    }

    public void setPermission_Edit(boolean permission_Edit) {
        this.permission_Edit = permission_Edit;
    }

    public MainActivity(String user, boolean doc, boolean sup, boolean pa, boolean edit) {

        setUserName(user);
        setPermission_Edit(edit);
        Date x = new Date();

        initComponents();
        setLocationRelativeTo(null);
        this.userName = user;
        if (doc == false && sup == false && pa == false && edit == false) {
            btn_doc.setEnabled(true);
            btn_sup.setEnabled(true);
            btn_pa.setEnabled(true);
        } else {
            btn_doc.setEnabled(doc);
            btn_sup.setEnabled(sup);
            btn_pa.setEnabled(pa);
        }
        setUserName(user);
        setPermission_Doctor(doc);
        setPermission_Supplies(sup);
        setPermission_Patients(pa);
        setPermission_Edit(edit);
        if (user.trim().equalsIgnoreCase("admin".trim())) {
            btn_add.setEnabled(true);
            setPermission_User(true);
        } else {
            btn_add.setEnabled(false);
        }
        Decrypt();
        jLabel2.setText("HÔM NAY LÀ: " + String.valueOf(java.time.LocalDate.now()));
        jLabel3.setText("XIN CHÀO " + user + " !!! ");

    }

    public MainActivity() {
        setBackground(new Color(23, 94, 39));
        initComponents();

    }

    public void Decrypt() {
        if (isPermission_Doctor() && isPermission_Patients() && isPermission_Supplies()) {
            Load_Database.Decryption("database/HSBN.dat");
            Load_Database.Decryption("database/DOCTOR.dat");
            Load_Database.Decryption("database/FML.dat");
            Load_Database.Decryption("database/Medicine.dat");
            Load_Database.Decryption("database/UserHistory.dat");
        } else if (isPermission_Doctor()) {
            Load_Database.Decryption("database/DOCTOR.dat");
        } else if (isPermission_Patients()) {
            Load_Database.Decryption("database/HSBN.dat");
            Load_Database.Decryption("database/DOCTOR.dat");
            Load_Database.Decryption("database/FML.dat");
        } else if (isPermission_Supplies()) {
            Load_Database.Decryption("database/Medicine.dat");
            Load_Database.Decryption("database/UserHistory.dat");
        }
        if (isPermission_User()) {
            Load_Database.Decryption("database/user.dat");
        }
    }

    public void Encrypt() {
        if (isPermission_Doctor() && isPermission_Patients() && isPermission_Supplies()) {
            Load_Database.Encryption("database/HSBN.dat");
            Load_Database.Encryption("database/DOCTOR.dat");
            Load_Database.Encryption("database/FML.dat");
            Load_Database.Encryption("database/Medicine.dat");
            Load_Database.Encryption("database/UserHistory.dat");
        } else if (isPermission_Doctor()) {
            Load_Database.Encryption("database/DOCTOR.dat");
        } else if (isPermission_Patients()) {
            Load_Database.Encryption("database/HSBN.dat");
            Load_Database.Encryption("database/DOCTOR.dat");
            Load_Database.Encryption("database/FML.dat");
            Load_Database.Encryption("database/Medicine.dat");
            Load_Database.Encryption("database/UserHistory.dat");
        } else if (isPermission_Supplies()) {
            Load_Database.Encryption("database/Medicine.dat");
            Load_Database.Encryption("database/UserHistory.dat");
        }
        if (isPermission_User()) {
            Load_Database.Encryption("database/user.dat");
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_doc = new javax.swing.JButton();
        btn_sup = new javax.swing.JButton();
        btn_pa = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
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
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("CHÀO MỪNG ĐẾN VỚI HỆ THỐNG QUẢN LÍ BỆNH VIỆN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("HÔM NAY LÀ :2017-01-23");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Xin chào admin !");

        btn_doc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_doc.setForeground(new java.awt.Color(35, 171, 114));
        btn_doc.setText("QUẢN LÍ BÁC SĨ");
        btn_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docActionPerformed(evt);
            }
        });

        btn_sup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sup.setForeground(new java.awt.Color(35, 171, 114));
        btn_sup.setText("QUẢN LÍ VẬT TƯ");
        btn_sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supActionPerformed(evt);
            }
        });

        btn_pa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_pa.setForeground(new java.awt.Color(35, 171, 114));
        btn_pa.setText("QUẢN LÍ BỆNH NHÂN");
        btn_pa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(35, 171, 114));
        btn_add.setText("QUẢN LÍ NGƯỜI DÙNG");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/dv.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(btn_pa, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btn_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 237,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 650,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(btn_pa, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btn_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(btn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

    }// GEN-LAST:event_formWindowClosed

    private void formWindowClosing(WindowEvent evt) {
        Encrypt();
        dispose();
    }

    private void btn_paActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_paActionPerformed

        Patient x = new Patient(isPermission_Edit());
        x.setVisible(true);
        // setVisible(false);
    }// GEN-LAST:event_btn_paActionPerformed

    private void btn_supActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_supActionPerformed
        Supplie x = new Supplie(isPermission_Edit());
        x.setVisible(true);
    }// GEN-LAST:event_btn_supActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
        UserManager x = new UserManager();
        x.setVisible(true);
    }// GEN-LAST:event_btn_addActionPerformed

    private void btn_docActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_docActionPerformed
        boolean edit = isPermission_Edit();
        Doctor x = new Doctor(edit);
        x.setVisible(true);
        // setVisible(false);
    }// GEN-LAST:event_btn_docActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_doc;
    private javax.swing.JButton btn_pa;
    private javax.swing.JButton btn_sup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
