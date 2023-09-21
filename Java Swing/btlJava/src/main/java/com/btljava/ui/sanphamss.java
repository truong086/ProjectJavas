/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.controller.SanPhamController;
import com.btljava.dao.impl.sanphamDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.sanpham;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class sanphamss extends javax.swing.JDialog {
    private fromMain mains;
    private DefaultTableModel model;
    int ids = 0;
    
    private SanPhamController dao = new SanPhamController();
    /**
     * Creates new form sanphamss
     * @param parent
     * @param modal
     */
    public sanphamss(java.awt.Frame parent, boolean modal) {
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
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"ID", "Tên sản phẩm", "Loại sản phẩm", "Miêu tả", "Giá bán", "Ngày tạo"});
        tbltable.setModel(model);
    }
    
    private void loadDatatable(){
        try{
//            sanphamDao dao = new sanphamDao();
            List<sanpham> list = dao.findAll();
            model.setRowCount(0);
            for(sanpham sp : list){
                model.addRow(new Object[] {
                    sp.getId(), sp.getTensanpham(), sp.getLoaisanpham_id(), sp.getMieuta(), sp.getGiaban(), sp.getNgaytao()
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
//            sanphamDao dao = new sanphamDao();
            List<sanpham> list = dao.timkiem(timkiems.getText());
            model.setRowCount(0);
            for(sanpham sp : list){
                model.addRow(new Object[] {
                    sp.getId(), sp.getTensanpham(), sp.getLoaisanpham_id(), sp.getMieuta(), sp.getGiaban(), sp.getNgaytao()
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

        mieutas = new javax.swing.JTextField();
        giabans = new javax.swing.JTextField();
        ngaytaos = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edits = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deletes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timkiems = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltable = new javax.swing.JTable();
        tensanphams = new javax.swing.JTextField();
        loaisanphamss = new javax.swing.JTextField();
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

        jLabel1.setText("Tên sản phẩm");

        edits.setText("Edit");
        edits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsActionPerformed(evt);
            }
        });

        jLabel2.setText("Loại sản phẩm");

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        jLabel3.setText("Miêu tả");

        jLabel6.setText("Tìm kiếm");

        jLabel4.setText("Giá bán");

        timkiems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemsKeyReleased(evt);
            }
        });

        jLabel5.setText("Ngày tạo");

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setText("Sản phẩm");

        quyen.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(tensanphams, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(loaisanphamss, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mieutas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(giabans, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(115, 115, 115)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(deletes, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 245, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(quyen)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(quyen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tensanphams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(loaisanphamss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(mieutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(giabans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();
        DataValidor.kiemtra(tensanphams, sb, "Tên sản phẩm không được để trống");
        DataValidor.kiemtra(loaisanphamss, sb, "Loại sản phẩm không được để trống");
        DataValidor.kiemtra(mieutas, sb, "Miêu tả không được để trống");
        DataValidor.kiemtra(giabans, sb, "Giá bán không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        int loaisanpham = 0;
        int giaban = 0;

        if(loaisanphamss.getText().chars().allMatch(Character :: isDigit) && giabans.getText().chars().allMatch(Character :: isDigit)){
            loaisanpham = Integer.parseInt(loaisanphamss.getText());
            giaban = Integer.parseInt(giabans.getText());
        }else{
            MessageDialog.showMessageError(mains, "Loại sản phẩm và giá bán phải là số", "Lỗi");
            return;
        }

        try{
            sanpham sp = new sanpham();
            sp.setTensanpham(tensanphams.getText());
            sp.setLoaisanpham_id(loaisanpham);
            sp.setMieuta(mieutas.getText());
            sp.setGiaban(giaban);
            sp.setNgaytao(ngaytaos.getText());
//            sanphamDao dao = new sanphamDao();
            if(dao.insert(sp)){
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

        StringBuilder sb = new StringBuilder();
        DataValidor.kiemtra(tensanphams, sb, "Tên sản phẩm không được để trống");
        DataValidor.kiemtra(loaisanphamss, sb, "Loại sản phẩm không được để trống");
        DataValidor.kiemtra(mieutas, sb, "Miêu tả không được để trống");
        DataValidor.kiemtra(giabans, sb, "Giá bán không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }

        int loaisanpham = 0;
        int giaban = 0;

        if(loaisanphamss.getText().chars().allMatch(Character :: isDigit) && giabans.getText().chars().allMatch(Character :: isDigit)){
            loaisanpham = Integer.parseInt(loaisanphamss.getText());
            giaban = Integer.parseInt(giabans.getText());
        }else{
            MessageDialog.showMessageError(mains, "Loại sản phẩm và giá bán phải là số", "Lỗi");
            return;
        }

        try{
            sanpham sp = new sanpham();
            sp.setId(ids);
            sp.setTensanpham(tensanphams.getText());
            sp.setLoaisanpham_id(loaisanpham);
            sp.setMieuta(mieutas.getText());
            sp.setGiaban(giaban);
            sp.setNgaytao(ngaytaos.getText());
//            sanphamDao dao = new sanphamDao();
            if(dao.update(sp)){
                MessageDialog.showMessageDialog(mains, "Update liệu thành công", "Thông báo");
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

        if(MessageDialog.showConfirmDialog(mains, "Bạn chắc chắn muốn xóa bản ghi này không", "Thông báo") == JOptionPane.NO_OPTION){
            return;
        }

        try{
//            sanphamDao dao = new sanphamDao();
            String id = String.valueOf(ids);
            if(dao.delete(id)){
                MessageDialog.showMessageDialog(mains, "Xóa bản ghi thành công", "Thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

    private void timkiemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemsKeyReleased
        // TODO add your handling code here:

        String value = timkiems.getText();
        if(value.equals("")){
            loadDatatable();
        }else{
            timkiem();
        }
    }//GEN-LAST:event_timkiemsKeyReleased

    private void tbltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltableMouseClicked
        // TODO add your handling code here:
        try{
            int row = tbltable.getSelectedRow();
            if(row >= 0){
                ids = (int) tbltable.getValueAt(row, 0);
//                sanphamDao dao = new sanphamDao();
                sanpham sp = dao.findby(ids);
                String loaisanpham = String.valueOf(sp.getLoaisanpham_id());
                String giaban = String.valueOf(sp.getGiaban());
                if(sp != null){
                    tensanphams.setText(sp.getTensanpham());
                    loaisanphamss.setText(loaisanpham);
                    mieutas.setText(sp.getMieuta());
                    giabans.setText(giaban);
                    ngaytaos.setText(sp.getNgaytao());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbltableMouseClicked

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
        inittable();
        
        loadDatatable();
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
            java.util.logging.Logger.getLogger(sanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sanphamss dialog = new sanphamss(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField giabans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loaisanphamss;
    private javax.swing.JTextField mieutas;
    private javax.swing.JTextField ngaytaos;
    private javax.swing.JButton quyen;
    private javax.swing.JTable tbltable;
    private javax.swing.JTextField tensanphams;
    private javax.swing.JTextField timkiems;
    // End of variables declaration//GEN-END:variables
}