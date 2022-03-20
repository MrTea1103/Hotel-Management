/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.UI;



import java.awt.Font;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class ManagerRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManagerRoom
     */
    public ManagerRoom() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_idKindOfRoom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Room = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_RoomName = new javax.swing.JTextField();
        txt_Price = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_Add2 = new com.k33ptoo.components.KButton();
        btn_Delete2 = new com.k33ptoo.components.KButton();
        btn_Update2 = new com.k33ptoo.components.KButton();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_SearchIdRoom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_KindOfRoom = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idRoom = new javax.swing.JTextField();
        cbo_KindOfRoom = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_Add1 = new com.k33ptoo.components.KButton();
        btn_Delete1 = new com.k33ptoo.components.KButton();
        btn_Update1 = new com.k33ptoo.components.KButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 0));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã loại:");

        txt_idKindOfRoom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tbl_Room.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_Room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã loại", "Tên loại", "Giá"
            }
        ));
        jScrollPane1.setViewportView(tbl_Room);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên loại:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giá:");

        txt_RoomName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_Price.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_Add2.setBackground(new java.awt.Color(255, 255, 255));
        btn_Add2.setText("Thêm");
        btn_Add2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Add2.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Add2.setkSelectedColor(new java.awt.Color(153, 0, 153));
        btn_Add2.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add2ActionPerformed(evt);
            }
        });

        btn_Delete2.setBackground(new java.awt.Color(102, 204, 255));
        btn_Delete2.setForeground(new java.awt.Color(0, 51, 255));
        btn_Delete2.setText("Xóa");
        btn_Delete2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Delete2.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Delete2.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete2ActionPerformed(evt);
            }
        });

        btn_Update2.setBackground(new java.awt.Color(102, 204, 255));
        btn_Update2.setForeground(new java.awt.Color(0, 51, 255));
        btn_Update2.setText("Cập nhật");
        btn_Update2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Update2.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Update2.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_Update2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_RoomName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txt_Price, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txt_idKindOfRoom))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_idKindOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_RoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jTabbedPane1.addTab("Phòng", kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 102, 0));
        kGradientPanel2.setkGradientFocus(1000);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 255, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tìm kiếm:");

        txt_SearchIdRoom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tbl_KindOfRoom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_KindOfRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Số phòng", "Loại phòng", "Giá", "Tình trạng"
            }
        ));
        tbl_KindOfRoom.setRowHeight(30);
        jScrollPane2.setViewportView(tbl_KindOfRoom);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số phòng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Loại phòng:");

        txt_idRoom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbo_KindOfRoom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbo_KindOfRoom.setForeground(new java.awt.Color(255, 0, 102));
        cbo_KindOfRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng đơn", "Phòng đôi", "Phòng V.I.P", " " }));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_Add1.setBackground(new java.awt.Color(255, 255, 255));
        btn_Add1.setText("Thêm");
        btn_Add1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Add1.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Add1.setkSelectedColor(new java.awt.Color(153, 0, 153));
        btn_Add1.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add1ActionPerformed(evt);
            }
        });

        btn_Delete1.setBackground(new java.awt.Color(102, 204, 255));
        btn_Delete1.setForeground(new java.awt.Color(0, 51, 255));
        btn_Delete1.setText("Xóa");
        btn_Delete1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Delete1.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Delete1.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete1ActionPerformed(evt);
            }
        });

        btn_Update1.setBackground(new java.awt.Color(102, 204, 255));
        btn_Update1.setForeground(new java.awt.Color(0, 51, 255));
        btn_Update1.setText("Cập nhật");
        btn_Update1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_Update1.setkIndicatorColor(new java.awt.Color(0, 204, 204));
        btn_Update1.setkStartColor(new java.awt.Color(0, 153, 255));
        btn_Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Update1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_idRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbo_KindOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_SearchIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SearchIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_idRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbo_KindOfRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6});

        jTabbedPane1.addTab("Loại phòng", kGradientPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Add1ActionPerformed

    private void btn_Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Delete1ActionPerformed

    private void btn_Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Update1ActionPerformed

    private void btn_Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Delete2ActionPerformed

    private void btn_Update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Update2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Update2ActionPerformed

    private void btn_Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Add2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_Add1;
    private com.k33ptoo.components.KButton btn_Add2;
    private com.k33ptoo.components.KButton btn_Delete1;
    private com.k33ptoo.components.KButton btn_Delete2;
    private com.k33ptoo.components.KButton btn_Update1;
    private com.k33ptoo.components.KButton btn_Update2;
    private javax.swing.JComboBox<String> cbo_KindOfRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tbl_KindOfRoom;
    private javax.swing.JTable tbl_Room;
    private javax.swing.JTextField txt_Price;
    private javax.swing.JTextField txt_RoomName;
    private javax.swing.JTextField txt_SearchIdRoom;
    private javax.swing.JTextField txt_idKindOfRoom;
    private javax.swing.JTextField txt_idRoom;
    // End of variables declaration//GEN-END:variables

    void init(){
        setLocationRelativeTo(null);
        tbl_Room.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tbl_Room.setShowHorizontalLines(true);
        tbl_Room.setShowVerticalLines(true);
        tbl_KindOfRoom.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tbl_KindOfRoom.setShowHorizontalLines(true);
        tbl_KindOfRoom.setShowVerticalLines(true);
    }

}