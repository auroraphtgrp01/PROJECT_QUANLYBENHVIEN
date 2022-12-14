package GUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Object.Date;
import Object.DateList;
import Object.Load_Database;
import Object.Medicine;

public class Supplie extends javax.swing.JFrame {
    static ArrayList<Medicine> listMedicint = new ArrayList<>();

    public static void setListMedicint(ArrayList<Medicine> listMedicint) {
        Supplie.listMedicint = listMedicint;
    }

    static ArrayList<DateList> listE = new ArrayList<>();

    DefaultTableModel model;

    private void showComboData() {
        jComboBox1.addItem("THEO NGÀY NHẬP");
        jComboBox1.addItem("THEO NGÀY HẾT HẠN");
        jComboBox1.addItem("THEO MÃ");
    }

    public Supplie() {
        initComponents();
        setLocationRelativeTo(null);
        showComboData();
        model = (DefaultTableModel) tbl.getModel();
        showData();
    }

    private boolean kt;

    public boolean isKt() {
        return kt;
    }

    public void setKt(boolean kt) {
        this.kt = kt;
    }

    public Supplie(boolean edit) {
        listMedicint.removeAll(listMedicint);
        setListMedicint(Load_Database.getListMedicineDontDecrypt());
        initComponents();
        showComboData();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
        showData();
        if (edit == false) {
            btn_save.setEnabled(false);
            btn_dele.setEnabled(false);
            btn_new.setEnabled(false);
        } else {
            btn_save.setEnabled(true);
            btn_dele.setEnabled(true);
            btn_new.setEnabled(true);
        }
        setKt(edit);
    }

    public Supplie(String ma, String name, String ngay, String ngayhethan, String cd) {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbl.getModel();
        listMedicint.add(new Medicine(ma, name, new Date(ngay), cd, new Date(ngayhethan)));
    }

    public Supplie(String ma) {
        for (int i = 0; i < listMedicint.size(); i++) {
            if (listMedicint.get(i).getId().trim().equalsIgnoreCase(ma.trim())) {
                listMedicint.remove(i);
            }
        }
    }

    public Supplie(String ma, String name, String ngay, String ngayhethan, String cd, int index) {
        initComponents();
        model = (DefaultTableModel) tbl.getModel();
        listMedicint.get(index).setId(ma);
        listMedicint.get(index).setName(name);
        listMedicint.get(index).setDate(new Date(ngay));
        listMedicint.get(index).setExpiry(new Date(ngayhethan));
        listMedicint.get(index).setUses(cd);
    }

    // ---------------------METHOD-----------------------------
    public void showData() {
        model.setRowCount(0);
        for (Medicine x : listMedicint) {
            model.addRow(new Object[] {
                    x.getId(), x.getName(), x.getDate(), x.getExpiry(), x.getUses()
            });
        }
    }

    // ---------------------METHOD-----------------------------

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btn_his = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_sort = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        btn_ex = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        edt_find = new javax.swing.JTextField();
        btn_dele = new javax.swing.JButton();
        btn_load = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÍ VẬT TƯ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("QUẢN LÝ VẬT TƯ");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "MÃ VẬT TƯ", "TÊN VẬT TƯ", "NGÀY NHẬP", "NGÀY HẾT HẠN", "CÔNG DỤNG"
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
            tbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbl.getColumnModel().getColumn(3).setPreferredWidth(40);
            tbl.getColumnModel().getColumn(4).setPreferredWidth(180);
        }

        btn_his.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_his.setForeground(new java.awt.Color(153, 0, 204));
        btn_his.setText("XEM LỊCH SỬ");
        btn_his.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hisActionPerformed(evt);
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

        btn_sort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sort.setForeground(new java.awt.Color(153, 0, 204));
        btn_sort.setText("SẮP XẾP");
        btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(153, 0, 204));
        btn_edit.setText("SỬA");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_find.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_find.setForeground(new java.awt.Color(153, 0, 204));
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        btn_ex.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ex.setForeground(new java.awt.Color(153, 0, 204));
        btn_ex.setText("XEM VẬT TƯ  SẮP HẾT HẠN");
        btn_ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("TÌM THEO MÃ: ");

        btn_dele.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dele.setForeground(new java.awt.Color(153, 0, 204));
        btn_dele.setText("XÓA");
        btn_dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleActionPerformed(evt);
            }
        });

        btn_load.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_load.setForeground(new java.awt.Color(153, 0, 204));
        btn_load.setText("LOAD DATA");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });
        edt_find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edt_findKeyPressed(evt);
            }
        });
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(153, 0, 204));
        btn_save.setText("LƯU");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btn_ex)
                                .addGap(11, 11, 11)
                                .addComponent(btn_sort)
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_load, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_his, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_his, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_dele, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_find, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btn_ex, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(edt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
        dispose();
    }// GEN-LAST:event_formWindowClosing

    private void btn_hisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_hisActionPerformed
        int index = tbl.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ XEM ! ");
        } else {
            UserHistoryDetail x = new UserHistoryDetail(listMedicint.get(index).getId(), isKt());
            x.setVisible(true);
        }

    }// GEN-LAST:event_btn_hisActionPerformed

    public static void addNew() {
        SupplieSubActivity x = new SupplieSubActivity();
        x.setVisible(true);
    }

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_newActionPerformed
        addNew();
    }// GEN-LAST:event_btn_newActionPerformed

    class sort implements Comparator<Medicine> {
        @Override
        public int compare(Medicine o1, Medicine o2) {
            if (checkDate(o1.getDate(), o2.getDate()) == -1)
                return 1;
            if (checkDate(o1.getDate(), o2.getDate()) == 0)
                return 0;
            return -1;
        }
    }

    // sortTheoHanSuDung
    class sortExpiry implements Comparator<Medicine> {
        @Override
        public int compare(Medicine o1, Medicine o2) {
            if (compareDay(o1.getExpiry(), o2.getExpiry()) == 1)
                return 1;
            if (compareDay(o1.getExpiry(), o2.getExpiry()) == 0)
                return 0;
            return -1;
        }
    }

    // sortTheoMa
    class sortID implements Comparator<Medicine> {
        @Override
        public int compare(Medicine o1, Medicine o2) {
            if (compareCode(o1.getId(), o2.getId()) == 1)
                return 1;
            if (compareCode(o1.getId(), o2.getId()) == 0)
                return 0;
            return -1;
        }
    }

    public static int compareDay(Date date1, Date date2) {
        if (caculatedDay(date1) > caculatedDay(date2)) {
            return 1;
        } else if (caculatedDay(date1) < caculatedDay(date2)) {
            return -1;
        }
        return 0;
    }

    public void sort() {
        Collections.sort(listMedicint, new sort());
        showData();
    }

    public void sortExpiry() {
        Collections.sort(listMedicint, new sortExpiry());
        showData();
    }

    public void sortID() {
        Collections.sort(listMedicint, new sortID());
        showData();
    }

    private void btn_sortActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_sortActionPerformed
        int index = jComboBox1.getSelectedIndex();
        if (index == 0) {
            sort();
        }
        if (index == 1) {
            sortExpiry();
        }
        if (index == 2) {
            sortID();
        }
    }// GEN-LAST:event_btn_sortActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
        int index = tbl.getSelectedRow();
        SupplieSubActivity x = new SupplieSubActivity(listMedicint.get(index).getId(),
                listMedicint.get(index).getName(), listMedicint.get(index).getDate().toString(),
                listMedicint.get(index).getExpiry().toString(), listMedicint.get(index).getUses(), index, isKt());
        x.setVisible(true);
    }// GEN-LAST:event_btn_editActionPerformed

    int index = -1;

    private void edt_findKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_edt_findKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findMa();
        }

    }

    public void findMa() {
        String s = edt_find.getText();
        for (int i = 0; i < listMedicint.size(); i++) {
            if (listMedicint.get(i).getId().trim().equalsIgnoreCase(s.trim())) {
                index = i;
                SupplieSubActivity x = new SupplieSubActivity(listMedicint.get(index).getId(),
                        listMedicint.get(index).getName(), listMedicint.get(index).getDate().toString(),
                        listMedicint.get(index).getExpiry().toString(), listMedicint.get(index).getUses(), index,
                        isKt());
                x.setVisible(true);
            }
        }
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "KHÔNG TỒN TẠI MÃ NÀY !");
        }
    }

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_findActionPerformed
        findMa();
    }// GEN-LAST:event_btn_findActionPerformed

    public static int compareCode(String x1, String x2) {
        String s1 = x1.substring(3, 6);
        String s2 = x2.substring(3, 6);
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        if (d1 > d2) {
            return 1;
        }
        if (d1 < d2) {
            return -1;
        }
        return 0;
    }

    public static int checkDate(Date date, Date date2) {

        if (date.getNam() == date2.getNam() && date.getThang() == date2.getThang()
                && date.getNgay() == date2.getNgay()) {
            return 0;
        }

        if (date.getNam() > date2.getNam()) {
            return 1;
        } else {
            if (date.getNam() == date2.getNam()) {
                if (date.getThang() > date2.getThang()) {
                    return 1;
                } else {
                    if (date.getThang() == date2.getThang()) {
                        if (date.getNgay() > date2.getNgay()) {
                            return 1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static int caculatedDay(Date date) {
        String dateNow = String.valueOf(java.time.LocalDate.now());
        String s1[] = dateNow.split("-");
        int day1;
        int day = Integer.parseInt(s1[2]);
        int month = Integer.parseInt(s1[1]);
        int year = Integer.parseInt(s1[0]);
        day1 = countDay(day, month, year, date.getNgay(), date.getThang(), date.getNam());
        return day1;
    }

    public static int countDay(int d1, int m1, int y1, int d2, int m2, int y2) {
        int date1 = d1, month1 = m1, year1 = y1;

        int date2 = d2, month2 = m2, year2 = y2;

        int dateOfYear = 0, dateOfMonth = 0, date = 0;

        /* Tinh khoang cach so ngay giua 2 nam */
        for (int i = year1; i < year2; i++)
            if (LeapYear(i))
                dateOfYear += 366; //////
            else
                dateOfYear += 365;

        /* Tinh khoang cach so ngay giua 2 thang */
        int a[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (LeapYear(year2))
            a[1] = 29;
        if (month1 > month2) {
            for (int i = month2; i < month1; i++)
                dateOfMonth -= a[i - 1];
        } else {
            for (int i = month1; i < month2; i++)
                dateOfMonth += a[i - 1];
        }

        /* Tinh khoang cach giua 2 ngay */
        date = date2 - date1 + 1; // Ket qua tinh ca ngay cuoi cung
        return dateOfYear + dateOfMonth + date;

    }

    public static boolean LeapYear(int year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 != 0 && year % 4 == 0)
            return true;
        return false;
    }

    public static ArrayList<DateList> getListE() {
        locDanhSach();
        return listE;
    }

    public static void locDanhSach() {
        for (int i = 0; i < listMedicint.size(); i++) {
            if (caculatedDay(listMedicint.get(i).getExpiry()) < 90) {
                listE.add(new DateList(listMedicint.get(i).getId(), listMedicint.get(i).getName(),
                        listMedicint.get(i).getDate().toString(), listMedicint.get(i).getExpiry().toString(),
                        caculatedDay(listMedicint.get(i).getExpiry())));
            }
        }
    }

    private void btn_exActionPerformed(java.awt.event.ActionEvent evt) {
        ListDate x = new ListDate(isKt());
        x.setVisible(true);

    }// GEN-LAST:event_btn_exActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_deleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_SdeleActionPerformed
        int index = tbl.getSelectedRow();
        if (index != -1) {
            int result = JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ CHẮC CHẮN MUỐN XÓA KHÔNG ? ");
            if (result == JOptionPane.YES_OPTION) {
                listMedicint.remove(index);
                JOptionPane.showMessageDialog(rootPane, "XÓA THÀNH CÔNG !");
            } else {
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG CHỌN DÒNG ĐỂ XÓA !");
            }
        }
    }// GEN-LAST:event_btn_deleActionPerformed

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_loadActionPerformed
        showData();
    }// GEN-LAST:event_btn_loadActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
        Load_Database.writeFileMedicine();
        JOptionPane.showMessageDialog(rootPane, "LƯU THÀNH CÔNG !");
    }// GEN-LAST:event_btn_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dele;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_ex;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_his;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_sort;
    private javax.swing.JTextField edt_find;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
