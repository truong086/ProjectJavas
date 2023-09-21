/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.controller.HoaDonNhapController;
import com.btljava.dao.impl.hoadonnhapDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.hoadonnhap;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class hoadonnhapss extends javax.swing.JDialog {
    private fromMain mains;
    private DefaultTableModel model;
    int ids = 0;
    
    private HoaDonNhapController dao = new HoaDonNhapController();
    /**
     * Creates new form hoadonnhapss
     */
    public hoadonnhapss(java.awt.Frame parent, boolean modal) {
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
            "ID", "Tên sản phầm", "Mã loại", "Giá nhập", "Số lượng", "Mã kho", "mã nhân viên", "Ngày tạo"
        });
        
        tblTable.setModel(model);
    }
    
    private void loadDatatable(){
        try{
//            hoadonnhapDao dao = new hoadonnhapDao();
            List<hoadonnhap> list = dao.findAll();
            model.setRowCount(0);
            
            for(hoadonnhap hdn : list){
                model.addRow(new Object[] {
                    hdn.getId(), hdn.getTensanpham(), hdn.getMaloai(), hdn.getGianhap(), hdn.getSoliong(), hdn.getMakho(), hdn.getNhanvien_id(), hdn.getNgaytao()
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
//            hoadonnhapDao dao = new hoadonnhapDao();
            List<hoadonnhap> list = dao.timkiem(timkiiems.getText());
            model.setRowCount(0);
            for(hoadonnhap hdn : list){
                model.addRow(new Object[] {
                    hdn.getId(), hdn.getTensanpham(), hdn.getMaloai(), hdn.getGianhap(), hdn.getSoliong(), hdn.getMakho(), hdn.getNhanvien_id(), hdn.getNgaytao()
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

        gianhaps = new javax.swing.JTextField();
        soluongs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        makhos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        manhanviens = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ngaytaos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        edits = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deletes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        tensanphams = new javax.swing.JTextField();
        maloais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        timkiiems = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tên sản phẩm");

        makhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makhosActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã loại");

        jLabel3.setText("Giá nhập");

        jLabel4.setText("Số lượng");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã kho");

        edits.setText("Edit");
        edits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã nhân viên");

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày tạo");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        jLabel8.setText("Tìm kiếm");

        timkiiems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiiemsKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel9.setText("Hóa đơn nhập");

        quyen.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maloais, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tensanphams, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(soluongs, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gianhaps, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(127, 127, 127)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(timkiiems, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel7)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(manhanviens, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(makhos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(156, 156, 156)
                                        .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quyen)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(quyen))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(tensanphams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(manhanviens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maloais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gianhaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(soluongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(timkiiems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makhosActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int maloai = 0;
        int gianhap = 0;
        int soluong = 0;
        int makho = 0;
        int nhanvienid = 0;
        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(tensanphams, sb, "Tên sản phầm không được để trống");
        DataValidor.kiemtra(maloais, sb, "Mã loại không được để trống");
        DataValidor.kiemtra(gianhaps, sb, "Giá nhập không được để trống");
        DataValidor.kiemtra(soluongs, sb, "Số lượng không được để trống");
        DataValidor.kiemtra(makhos, sb, "Mã kho không được để trống");
        DataValidor.kiemtra(manhanviens, sb, "Mã nhân viên không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        if(maloais.getText().chars().allMatch(Character :: isDigit) && gianhaps.getText().chars().allMatch(Character ::isDigit) && soluongs.getText().chars().allMatch(Character :: isDigit)
            && makhos.getText().chars().allMatch(Character :: isDigit) && manhanviens.getText().chars().allMatch(Character :: isDigit)){
            maloai = Integer.parseInt(maloais.getText());
            gianhap = Integer.parseInt(gianhaps.getText());
            soluong = Integer.parseInt(soluongs.getText());
            makho = Integer.parseInt(makhos.getText());
            nhanvienid = Integer.parseInt(manhanviens.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã loại, giá nhập, số lượng, mã kho, mã nhân viên phải là số", "Lỗi");
            return;
        }

        try{
            hoadonnhap hdn = new hoadonnhap();
            hdn.setTensanpham(tensanphams.getText());
            hdn.setMaloai(maloai);
            hdn.setGianhap(gianhap);
            hdn.setSoliong(soluong);
            hdn.setMakho(makho);
            hdn.setNhanvien_id(nhanvienid);
            hdn.setNgaytao(ngaytaos.getText());
//            hoadonnhapDao dao = new hoadonnhapDao();
            if(dao.insert(hdn)){
                MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công", "Thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsActionPerformed
        // TODO add your handling code here:

        int maloai = 0;
        int gianhap = 0;
        int soluong = 0;
        int makho = 0;
        int nhanvienid = 0;
        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(tensanphams, sb, "Tên sản phầm không được để trống");
        DataValidor.kiemtra(maloais, sb, "Mã loại không được để trống");
        DataValidor.kiemtra(gianhaps, sb, "Giá nhập không được để trống");
        DataValidor.kiemtra(soluongs, sb, "Số lượng không được để trống");
        DataValidor.kiemtra(makhos, sb, "Mã kho không được để trống");
        DataValidor.kiemtra(manhanviens, sb, "Mã nhân viên không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        if(maloais.getText().chars().allMatch(Character :: isDigit) && gianhaps.getText().chars().allMatch(Character ::isDigit) && soluongs.getText().chars().allMatch(Character :: isDigit)
            && makhos.getText().chars().allMatch(Character :: isDigit) && manhanviens.getText().chars().allMatch(Character :: isDigit)){
            maloai = Integer.parseInt(maloais.getText());
            gianhap = Integer.parseInt(gianhaps.getText());
            soluong = Integer.parseInt(soluongs.getText());
            makho = Integer.parseInt(makhos.getText());
            nhanvienid = Integer.parseInt(manhanviens.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã loại, giá nhập, số lượng, mã kho, mã nhân viên phải là số", "Lỗi");
            return;
        }

        try{
            hoadonnhap hdn = new hoadonnhap();
            hdn.setId(ids);
            hdn.setTensanpham(tensanphams.getText());
            hdn.setMaloai(maloai);
            hdn.setGianhap(gianhap);
            hdn.setSoliong(soluong);
            hdn.setMakho(makho);
            hdn.setNhanvien_id(nhanvienid);
            hdn.setNgaytao(ngaytaos.getText());
//            hoadonnhapDao dao = new hoadonnhapDao();
            if(dao.update(hdn)){
                MessageDialog.showMessageDialog(mains, "Update dữ liệu thành công", "Thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_editsActionPerformed

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        // TODO add your handling code here:

        if(MessageDialog.showConfirmDialog(mains, "bạn chắc chắn muốn xóa bản ghi này không", "Thông báo") == JOptionPane.NO_OPTION){
            return;
        }

        try{
//            hoadonnhapDao dao = new hoadonnhapDao();
            String id = String.valueOf(ids);
            if(dao.delete(id)){
                MessageDialog.showMessageDialog(mains, "Xóa thành công", "Thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã cố lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:

        try{
            int row = tblTable.getSelectedRow();
            if(row >= 0){
                ids = (int) tblTable.getValueAt(row, 0);
                hoadonnhapDao dao = new hoadonnhapDao();
                hoadonnhap hdn = dao.findbyid(ids);
                String maloai = String.valueOf(hdn.getMaloai());
                String gianhap = String.valueOf(hdn.getGianhap());
                String soluong = String.valueOf(hdn.getSoliong());
                String makho = String.valueOf(hdn.getMakho());
                String nhanvien = String.valueOf(hdn.getNhanvien_id());
                if(hdn != null){
                    tensanphams.setText(hdn.getTensanpham());
                    maloais.setText(maloai);
                    gianhaps.setText(gianhap);
                    soluongs.setText(soluong);
                    makhos.setText(makho);
                    manhanviens.setText(nhanvien);
                    ngaytaos.setText(hdn.getNgaytao());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void timkiiemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiiemsKeyReleased
        // TODO add your handling code here:

        String value = timkiiems.getText();
        if(value.equals("")){
            loadDatatable();
        }else{
            timkiem();
        }
    }//GEN-LAST:event_timkiiemsKeyReleased

    
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
        phanquyen();
        
        initTable();
        
        loadDatatable();
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
            java.util.logging.Logger.getLogger(hoadonnhapss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hoadonnhapss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hoadonnhapss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hoadonnhapss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hoadonnhapss dialog = new hoadonnhapss(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton edits;
    private javax.swing.JTextField gianhaps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField makhos;
    private javax.swing.JTextField maloais;
    private javax.swing.JTextField manhanviens;
    private javax.swing.JTextField ngaytaos;
    private javax.swing.JButton quyen;
    private javax.swing.JTextField soluongs;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField tensanphams;
    private javax.swing.JTextField timkiiems;
    // End of variables declaration//GEN-END:variables
}