/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.dao.impl.loaisanphamDao;
import com.btljava.dao.impl.nhanvienDao;
import com.btljava.dao.impl.taikhoanDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.loaisanpham;
import com.btljava.model.nhanvien;
import com.btljava.model.taikhoan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class taikhoans extends javax.swing.JPanel {
    private DefaultTableModel model;
    private fromMain mains;
    /**
     * Creates new form taikhoans
     */
    public taikhoans() {
        initComponents();
        initTable();
        
        loadDatatable();
        
        phanquyen();
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
    
    int ids = 0;
    private void initTable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"ID", "Tên tài khoản", "Mật khẩu", "Phân quyền"});
        btlTable.setModel(model);
    }
    
    private void loadDatatable(){
        try{
            taikhoanDao dao = new taikhoanDao();
            List<taikhoan> list = dao.findAll();
            model.setRowCount(0);
            for(taikhoan id : list){
                model.addRow(new Object[] {
                    id.getId(), id.getTentaikhoan(), id.getMatkhau(), id.getPhanquyen()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "lỗi");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        taikhoanss = new javax.swing.JTextField();
        phanquyens = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        edits = new javax.swing.JButton();
        deletes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        timkiems = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        btlTable = new javax.swing.JTable();
        matkhaus = new javax.swing.JPasswordField();

        jLabel1.setText("Tên tài khoản");

        jLabel2.setText("Mật khẩu");

        jLabel3.setText("Quyền");

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

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        jLabel4.setText("Tìm kiếm");

        timkiems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemsKeyReleased(evt);
            }
        });

        btlTable.setModel(new javax.swing.table.DefaultTableModel(
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
        btlTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btlTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(btlTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(taikhoanss, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(phanquyens, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(matkhaus, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletes)
                    .addComponent(edits)
                    .addComponent(add))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(taikhoanss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edits)
                    .addComponent(jLabel2)
                    .addComponent(matkhaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletes)
                    .addComponent(jLabel3)
                    .addComponent(phanquyens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int so = 0;
        int capquyen = 0;
        StringBuilder bd = new StringBuilder();
        DataValidor.kiemtra(taikhoanss, bd, "Tài khoản không được để trống( Trường chim bé )");
        DataValidor.kiemtrapass(matkhaus, bd, "Mật khẩu không được để trống( Trường chim bé )");
        
        if(bd.length() > 0){
            MessageDialog.showMessageError(mains, bd.toString(), "Lỗi");
        }
        
        // Kiểm tra xem dữ liệu người dùng vừa nhập vào có phải số không, nếu là số thì bắt đầu gán dữ liệu vào biến, nếu không phải số thì in ra thông báo lỗi
        if(taikhoanss.getText().chars().allMatch(Character :: isDigit)){
             // Đổi từ chuỗi sang số nguyên
            so = Integer.parseInt(taikhoanss.getText()); // Gán dữ liệu của người dùng vào biến
        }else{
            MessageDialog.showMessageError(mains, "Dữ liệu của tài khoản phải là số ( Trường chim bé )", "Lỗi");
            return;
        }
        
        // Kiểm tra xem dữ liệu người dùng vừa nhập vào có phải số không, nếu là số thì bắt đầu gán dữ liệu vào biến, nếu không phải số thì in ra thông báo lỗi
        if(phanquyens.getText().chars().allMatch(Character :: isDigit)){
            capquyen = Integer.parseInt(phanquyens.getText()); // Gán dữ liệu của người dùng vào biến
        }else{
            MessageDialog.showMessageError(mains, "Dữ liệu của tài khoản phải là số", "Lỗi");
            return;
        }
       
        
        try{
            taikhoan tk = new taikhoan();
            tk.setTentaikhoan(so);
            tk.setMatkhau(matkhaus.getText());
            tk.setPhanquyen(capquyen);
            taikhoanDao dao = new taikhoanDao();
            if(dao.findbyid(taikhoanss.getText()) != null){
                if(MessageDialog.showConfirmDialog(mains, "Bản ghi này đã tồn tại bạn có muốn update không( Trường chim bé )?", "Thông báo") == JOptionPane.NO_OPTION){
                    return;
                }
                String phanquyen = String.valueOf(ShereData.dangnhapss.getPhanquyen());
                if(capquyen == 2){
                    nhanvienDao daonv = new nhanvienDao();
                    nhanvien nvs = daonv.findby(taikhoanss.getText());
                    if(nvs != null){
                        
                    }
                }
                    taikhoan tks = new taikhoan();
                    tks.setId(ids);
                    tks.setTentaikhoan(so);
                    tks.setMatkhau(matkhaus.getText());
                    tks.setPhanquyen(capquyen);
                if(dao.update(tks)){
                    MessageDialog.showMessageDialog(mains, "Update thành công( Trường chim bé )", "Thông báo");
                    loadDatatable();
                }else{
                    MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
                }
            }else{
                if(dao.insert(tk)){
                    MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công( Trường chim bé )", "Thông báo");
                    loadDatatable();
                }else{
                    MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
                }
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsActionPerformed
        // TODO add your handling code here:
        addActionPerformed(evt);
    }//GEN-LAST:event_editsActionPerformed

    private void btlTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btlTableMouseClicked
        // TODO add your handling code here:
        
        try{
            int row = btlTable.getSelectedRow();
            if(row >= 0){
                ids = (int) btlTable.getValueAt(row, 0);
                taikhoanDao dao = new taikhoanDao();
                taikhoan tk = dao.findbyids(ids);
                String tks = String.valueOf(tk.getTentaikhoan());
                String capquyen = String.valueOf(tk.getPhanquyen());
                if(tk != null){
                    taikhoanss.setText(tks);
                    matkhaus.setText(tk.getMatkhau());
                    phanquyens.setText(capquyen);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
        
         
        
    }//GEN-LAST:event_btlTableMouseClicked

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        // TODO add your handling code here:
        if(MessageDialog.showConfirmDialog(mains, "Bạn có chắc chắn muốn xóa bản ghi này không( Trường chim bé )", "Thông báo") == JOptionPane.NO_OPTION){
            return;
        }
        
        String id = String.valueOf(ids);
        try{
            taikhoanDao dao = new taikhoanDao();
            if(dao.delete(id)){
                MessageDialog.showMessageDialog(mains, "Xóa thành công", "Thông  báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

    private void timkiem(){
        try{
            taikhoanDao dao = new taikhoanDao();
            List<taikhoan> list = dao.tinkiem(timkiems.getText());
            model.setRowCount(0);
            for(taikhoan tk : list){
                model.addRow(new Object[]{
                    tk.getId(), tk.getTentaikhoan(), tk.getMatkhau(), tk.getPhanquyen()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }
    private void timkiemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemsKeyReleased
        // TODO add your handling code here:
        String value = timkiems.getText();
        if(value != null){
            timkiem();
        }else{
            loadDatatable();
        }
    }//GEN-LAST:event_timkiemsKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTable btlTable;
    private javax.swing.JButton deletes;
    private javax.swing.JButton edits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField matkhaus;
    private javax.swing.JTextField phanquyens;
    private javax.swing.JTextField taikhoanss;
    private javax.swing.JTextField timkiems;
    // End of variables declaration//GEN-END:variables
}
