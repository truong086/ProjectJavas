/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.controller.NhaTaiTroController;
import com.btljava.dao.impl.nhataitroDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.nhataitro;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class nhataitross extends javax.swing.JDialog {
    private fromMain mains;
    private DefaultTableModel model;
    int ids = 0;
    
    private NhaTaiTroController dao = new NhaTaiTroController();
    /**
     * Creates new form nhataitross
     */
    public nhataitross(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
    }
    
    private void phanquyen(){
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("2")){
            deletes.hide();
        }
        if(phanquyen.equals("3")){
            add.hide();
            edits.hide();
            deletes.hide();
            
        }
    }
    
    private void initTable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {
            "ID", "Mã nhà tài trợ", "Họ tên", "Ngày sinh", "Địa chỉ", "Email", "Giới tính", "Số điện thoại", "Tình trạng bệnh", "Tài trợ", "Ngày tạo"
        });
        
        tbltable.setModel(model);
    }
    
    private void loadDataTable(){
        try{
//            nhataitroDao dao = new nhataitroDao();
            List<nhataitro> list = dao.findAll();
            model.setRowCount(0);
            for(nhataitro ntt : list){
                model.addRow(new Object[] {
                    ntt.getId(), ntt.getManhataitro(), ntt.getHoten(), ntt.getNgaysinh(), ntt.getDiachi(), ntt.getEmail(), ntt.getGioitinh() == 1? "Nam" : "Nữ",
                    ntt.getSodienthoai(), ntt.getTinhtrangbenh(), ntt.getTaitro(), ntt.getNgaytao()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }
    
    private void timkiem(){
        try{
//            nhataitroDao dao = new nhataitroDao();
            List<nhataitro> list = dao.timkiem(timkiems.getText());
            model.setRowCount(0);
            for(nhataitro ntt : list){
                model.addRow(new Object[] {
                    ntt.getId(), ntt.getManhataitro(), ntt.getHoten(), ntt.getNgaysinh(), ntt.getDiachi(), ntt.getEmail(), ntt.getGioitinh() == 1? "Nam" : "Nữ",
                    ntt.getSodienthoai(), ntt.getTinhtrangbenh(), ntt.getTaitro(), ntt.getNgaytao()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hotens = new javax.swing.JTextField();
        ngaysinhs = new javax.swing.JTextField();
        diachis = new javax.swing.JTextField();
        emails = new javax.swing.JTextField();
        sodienthoais = new javax.swing.JTextField();
        tinhtrangbenhs = new javax.swing.JTextField();
        taitros = new javax.swing.JTextField();
        ngaytaos = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        edits = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deletes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timkiems = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nams = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        nus = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        manhataitros = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        quyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edits.setText("Edit");
        edits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã nhà tài trợ");

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        tbltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltable);

        jLabel2.setText("Họ tên");

        jLabel3.setText("Ngày sinh");

        timkiems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemsKeyReleased(evt);
            }
        });

        jLabel4.setText("Địa chỉ");

        jLabel11.setText("Tìm kiếm");

        jLabel5.setText("Email");

        nams.setText("Nam");

        jLabel6.setText("Giới tính");

        nus.setText("Nữ");

        jLabel7.setText("Số điện thoại");

        jLabel8.setText("Tình trạng bệnh");

        jLabel9.setText("Tài trợ");

        jLabel10.setText("Ngày tạo");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setText("Nhà tài trợ");

        quyen.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)
                                .addComponent(emails, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(59, 59, 59)
                                .addComponent(diachis, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43)
                                .addComponent(ngaysinhs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(61, 61, 61)
                                .addComponent(hotens, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(manhataitros, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taitros, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tinhtrangbenhs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sodienthoais, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nams)
                                .addGap(29, 29, 29)
                                .addComponent(nus)))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quyen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(9, 9, 9)
                .addComponent(quyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(manhataitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nams)
                    .addComponent(nus))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(sodienthoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(tinhtrangbenhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaysinhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(taitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diachis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int nhataitro = 0;

        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(manhataitros, sb, "Mã nhà tài trợ không được để trống");
        DataValidor.kiemtra(hotens, sb, "Họ tên không được để trống");
        DataValidor.kiemtra(ngaysinhs, sb, "Ngày sinh không được để trống");
        DataValidor.kiemtra(diachis, sb, "Địa chỉ không được để trống");
        DataValidor.kiemtra(emails, sb, "Email không được để trống");
        DataValidor.kiemtra(sodienthoais, sb, "Số điện thoại không được để trống");
        DataValidor.kiemtra(tinhtrangbenhs, sb, "Tình trạng không được để trống");
        DataValidor.kiemtra(taitros, sb, "Tài trợ không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        if(taitros.getText().contains("tim")){ // Tìm kiếm từ ngữ trong chuỗi vừa nhập vào và sửa đổi lại chuỗi đó cho đúng với dữ liệu trong database, sử dụng hàm "contains()" để xử lý tìm kiếm từ ngữ trong chuỗi
            if(MessageDialog.showConfirmDialog(mains, "Có phải ý bạn là muốn tài trợ tim mạch không?", "Thông báo") == JOptionPane.YES_OPTION){
                taitros.setText("nhóm máu osd");
            }else{
                return;
            }
        }

        if(manhataitros.getText().chars().allMatch(Character :: isDigit)){
            nhataitro = Integer.parseInt(manhataitros.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã nhà tài trợ phải là số", "Lỗi");
            return;
        }

        try{
            nhataitro ntt = new nhataitro();
            ntt.setManhataitro(nhataitro);
            ntt.setHoten(hotens.getText());
            ntt.setNgaysinh(ngaysinhs.getText());
            ntt.setDiachi(diachis.getText());
            ntt.setEmail(emails.getText());
            ntt.setGioitinh(nams.isSelected()?1:0);
            ntt.setSodienthoai(sodienthoais.getText());
            ntt.setTinhtrangbenh(tinhtrangbenhs.getText());
            ntt.setTaitro(taitros.getText());
            ntt.setNgaytao(ngaytaos.getText());
//            nhataitroDao dao = new nhataitroDao();
            if(dao.insert(ntt)){
                MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }

    }//GEN-LAST:event_addActionPerformed

    private void editsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsActionPerformed
        // TODO add your handling code here:

        int nhataitro = 0;

        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(manhataitros, sb, "Mã nhà tài trợ không được để trống");
        DataValidor.kiemtra(hotens, sb, "Họ tên không được để trống");
        DataValidor.kiemtra(ngaysinhs, sb, "Ngày sinh không được để trống");
        DataValidor.kiemtra(diachis, sb, "Địa chỉ không được để trống");
        DataValidor.kiemtra(emails, sb, "Email không được để trống");
        DataValidor.kiemtra(sodienthoais, sb, "Số điện thoại không được để trống");
        DataValidor.kiemtra(tinhtrangbenhs, sb, "Tình trạng không được để trống");
        DataValidor.kiemtra(taitros, sb, "Tài trợ không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        if(taitros.getText().contains("tim")){ // Tìm kiếm từ ngữ trong chuỗi vừa nhập vào và sửa đổi lại chuỗi đó cho đúng với dữ liệu trong database, sử dụng hàm "contains()" để xử lý tìm kiếm từ ngữ trong chuỗi
            if(MessageDialog.showConfirmDialog(mains, "Có phải ý bạn là muốn tài trợ tim mạch không?", "Thông báo") == JOptionPane.YES_OPTION){
                taitros.setText("nhóm máu osd");
            }else{
                return;
            }
        }

        if(manhataitros.getText().chars().allMatch(Character :: isDigit)){
            nhataitro = Integer.parseInt(manhataitros.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã nhà tài trợ phải là số", "Lỗi");
            return;
        }
        try{
            nhataitro ntt = new nhataitro();
            ntt.setId(ids);
            ntt.setManhataitro(nhataitro);
            ntt.setHoten(hotens.getText());
            ntt.setNgaysinh(ngaysinhs.getText());
            ntt.setDiachi(diachis.getText());
            ntt.setEmail(emails.getText());
            ntt.setGioitinh(nams.isSelected()?1:0);
            ntt.setSodienthoai(sodienthoais.getText());
            ntt.setTinhtrangbenh(tinhtrangbenhs.getText());
            ntt.setTaitro(taitros.getText());
            ntt.setNgaytao(ngaytaos.getText());
//            nhataitroDao dao = new nhataitroDao();
            if(dao.update(ntt)){
                MessageDialog.showMessageDialog(mains, "Update thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_editsActionPerformed

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        // TODO add your handling code here:

        if(MessageDialog.showConfirmDialog(mains, "Bạn chắc chắn muốn xóa bản ghi này không", "Lỗi") == JOptionPane.NO_OPTION){
            return;
        }

        try{
//            nhataitroDao dao = new nhataitroDao();
            String id = String.valueOf(ids);
            if(dao.delet(id)){
                MessageDialog.showMessageDialog(mains, "Xóa thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

    private void tbltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltableMouseClicked
        // TODO add your handling code here:
        try{
            int row = tbltable.getSelectedRow();
            if(row >= 0){
                ids = (int) tbltable.getValueAt(row, 0);
//                nhataitroDao dao = new nhataitroDao();
                nhataitro ntt = dao.findbyid(ids);
                String nhataitro = String.valueOf(ntt.getManhataitro());
                if(ntt != null){
                    manhataitros.setText(nhataitro);
                    hotens.setText(ntt.getHoten());
                    ngaysinhs.setText(ntt.getNgaysinh());
                    diachis.setText(ntt.getDiachi());
                    emails.setText(ntt.getEmail());
                    nams.setSelected(ntt.getGioitinh()==1?true:false);
                    nus.setSelected(ntt.getGioitinh() == 0?true: false);
                    sodienthoais.setText(ntt.getSodienthoai());
                    tinhtrangbenhs.setText(ntt.getTinhtrangbenh());
                    taitros.setText(ntt.getTaitro());
                    ngaytaos.setText(ntt.getNgaytao());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbltableMouseClicked

    private void timkiemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemsKeyReleased
        // TODO add your handling code here:

        String value = timkiems.getText();
        if(value.equals("")){
            loadDataTable();
        }else{
            timkiem();
        }
    }//GEN-LAST:event_timkiemsKeyReleased

    private void checkLogin(){
        int phanquyen = ShereData.dangnhapss.getPhanquyen();
        if(phanquyen == 1){
            quyen.setForeground(Color.red);
            quyen.setText("Admin");
        }
        if(phanquyen == 2){
            quyen.setForeground(Color.red);
            quyen.setText("Quản lý");
        }
        if(phanquyen == 3){
            quyen.setForeground(Color.red);
            quyen.setText("Bệnh nhân");
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        initTable();
        
        loadDataTable();
        
        phanquyen();
        checkLogin();
    }//GEN-LAST:event_formWindowOpened

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nhataitross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhataitross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhataitross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhataitross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nhataitross dialog = new nhataitross(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton deletes;
    private javax.swing.JTextField diachis;
    private javax.swing.JButton edits;
    private javax.swing.JTextField emails;
    private javax.swing.JTextField hotens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manhataitros;
    private javax.swing.JRadioButton nams;
    private javax.swing.JTextField ngaysinhs;
    private javax.swing.JTextField ngaytaos;
    private javax.swing.JRadioButton nus;
    private javax.swing.JButton quyen;
    private javax.swing.JTextField sodienthoais;
    private javax.swing.JTextField taitros;
    private javax.swing.JTable tbltable;
    private javax.swing.JTextField timkiems;
    private javax.swing.JTextField tinhtrangbenhs;
    // End of variables declaration//GEN-END:variables
}
