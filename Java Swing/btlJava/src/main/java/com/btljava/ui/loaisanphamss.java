/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.controller.LoaiSanPhamController;
import com.btljava.dao.impl.loaisanphamDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.loaisanpham;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class loaisanphamss extends javax.swing.JDialog {
    private fromMain mains;
    private DefaultTableModel model;
    
    private LoaiSanPhamController dao = new LoaiSanPhamController();
    
    
    /**
     * Creates new form loaisanphamss
     */
    public loaisanphamss(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
    }
    
    private void phanquyen(){
        String taikhoan = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(taikhoan.equals("2")){
            deletes.hide();
        }
        if(taikhoan.equals("3")){
            add.hide();
            edits.hide();
            deletes.hide();
        }
    }
    
    private void find(){
        try{
//            loaisanphamDao dao = new loaisanphamDao();
            List<loaisanpham> list = dao.finbyid(timkiem.getText());
            model.setRowCount(0);
            for(loaisanpham id : list){
                model.addRow(new Object[] {
                    id.getId(), id.getTenloai(), id.getNgaytao()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }
    
    int idsss = 0;
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"ID", "Tên loại", "Ngày tạo"});
        tblTable.setModel(model);
    }
    
    private void loadDatatable(){
        try{
//            loaisanphamDao dao = new loaisanphamDao();
            List<loaisanpham> list = dao.findAll();
            model.setRowCount(0);
            for(loaisanpham id : list){
                model.addRow(new Object[] {
                    id.getId(), id.getTenloai(), id.getNgaytao()
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ids = new javax.swing.JTextField();
        tenloai = new javax.swing.JTextField();
        ngaytao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timkiem = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        edits = new javax.swing.JButton();
        deletes = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        quyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("id");

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

        jLabel2.setText("Tên loại");

        jLabel3.setText("Ngày tạo");

        jLabel4.setText("Tìm kiếm");

        timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemKeyReleased(evt);
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

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setText("Loại sản phẩm");

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
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ids)
                                            .addComponent(ngaytao)
                                            .addComponent(tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(deletes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(80, 80, 80))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(53, 53, 53)
                        .addComponent(quyen)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(quyen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addGap(31, 31, 31)
                        .addComponent(edits)
                        .addGap(29, 29, 29)
                        .addComponent(deletes)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
        // Khi người dùng click vào dữ liệu trong table thì sẽ hiển thị dữ liệu đó lên ô text
        try{
            int row = tblTable.getSelectedRow();

            if(row >= 0){
                idsss = (int) tblTable.getValueAt(row, 0);
//                loaisanphamDao dao = new loaisanphamDao();
                loaisanpham ls = dao.finbyids(idsss);
                String value = String.valueOf(ls.getId());
                if(ls != null){
                    ids.setText(value);
                    tenloai.setText(ls.getTenloai());
                    ngaytao.setText(ls.getNgaytao());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "lỗi");
        }

        // Khi người dùng click vào dữ liệu trong bảng table thì sẽ hiển thị dữ liệu lên ô text
        //        try{
            //            int row = btlStudent.getSelectedRow();
            //
            //            if(row >= 0){
                //                String id = (String) btlStudent.getValueAt(row, 0); // Lấy ra id
                //                SinhVienDao dao = new SinhVienDao();
                //                SinhVien sv = dao.findBy(id);
                //                if(sv != null){
                    //                    txtStudentId.setText(sv.getMaSinhVien());
                    //                    txtStudentName.setText(sv.getHoTen());
                    //                    txtStudentEmail.setText(sv.getEmail());
                    //                    txtPhone.setText(sv.getSoDT());
                    //                    txtAddress.setText(sv.getDiaChi());
                    //                    rdoNam.setSelected(sv.getGioiTinh() == 1 ? true : false);
                    //                    if(sv.getHinh() != null){ // Kiểm tra hình ảnh có tồn tại trên database không, nếu tồn tại thì hiển thị lên from
                        //                        Image img = ImageHelper.createImageFromByteArray(sv.getHinh(), "png"); // Gọi lại hàm "createImageFromByteArray" trong lớp "ImageHelper" để sử dụng chuyển đổi hình ảnh từ kiểu dữ liệu các byte[] sang kiểu dữ liệu hình ảnh
                        //                        lblImage.setIcon(new ImageIcon(img)); // Hiển thị ảnh lên thẻ "label"
                        //                        personalImage = sv.getHinh(); // Sau khi hiển thị hình ảnh lên thì sẽ lưu lại thông tin hình ảnh vào mảng byte[]
                        //                    }else{
                        //                        //personalImage = sv.getHinh(); // Lưu lại hình ảnh vào mảng byte[]
                        //                        // Nếu không có hình ảnh thì sẽ hiển thị lại hình ảnh mặc định của hệ thống
                        //                        /*ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/testswing/icons/anh.jpg")); // Khi người dùng chưa nhập hình ảnh vào thì hệ thống sẽ hiển thị hình ảnh mặc định
                        //                                                                    // "getResource()" Nghĩa là đường dẫn đến hình ảnh
                        //                        lblImage.setIcon(icon); // Hiển thị hình ảnh lên thẻ "label"*/
                        //                    }
                    //                }
                //            }
            //        }catch(Exception e){
            //            e.printStackTrace();
            //            MessageDialogHelper.showErorDialog(parent, e.getMessage(), "Lỗi");
            //        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemKeyReleased
        // TODO add your handling code here:

        String value = timkiem.getText();
        if(value != null){
            find();
        }else{
            loadDatatable();
        }
    }//GEN-LAST:event_timkiemKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        StringBuilder bd = new StringBuilder();

        DataValidor.kiemtra(tenloai, bd, "Tên loại không được bỏ trống");
        DataValidor.kiemtra(ngaytao, bd, "Ngày tạo không được bỏ trống");

        if(bd.length() > 0){
            MessageDialog.showMessageError(mains, bd.toString(), "Lỗi");
            return;
        }

        try{
            loaisanpham ls = new loaisanpham();
            ls.setTenloai(tenloai.getText());
            ls.setNgaytao(ngaytao.getText());
//            loaisanphamDao dao = new loaisanphamDao();

            if(dao.insert(ls)){
                MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công", "Thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsActionPerformed
        // TODO add your handling code here:

        StringBuilder bd = new StringBuilder();

        DataValidor.kiemtra(tenloai, bd, "Tên loại không được để trống");
        DataValidor.kiemtra(ngaytao, bd, "Ngày tạo không được để trống");

        if(bd.length() > 0){
            MessageDialog.showMessageError(mains, bd.toString(), "Lỗi");
            return;
        }

        if(MessageDialog.showConfirmDialog(mains, "Bạn muốn cập nhật bản ghi này không", "Thông báo") == JOptionPane.NO_OPTION){
            return;
        }

        try{
            loaisanpham ls = new loaisanpham();
            ls.setTenloai(tenloai.getText());
            ls.setNgaytao(ngaytao.getText());
//            loaisanphamDao dao = new loaisanphamDao();
            if(dao.update(ls)){
                MessageDialog.showMessageDialog(mains, "Edit dữ liệu thành công", "thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_editsActionPerformed

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        // TODO add your handling code here:
        StringBuilder bd = new StringBuilder();

        DataValidor.kiemtra(ids, bd, "ID không được để trống hãy click vào bảng table bên dưới để có được dữ liệu ID");
        if(bd.length() > 0){
            MessageDialog.showMessageError(mains, bd.toString(), " Lỗi");
            return;
        }

        if(MessageDialog.showConfirmDialog(mains, "Bạn chắc chắn muốn xóa bản ghi này không", "Lỗi") == JOptionPane.NO_OPTION){
            return;
        }

        try{
//            loaisanphamDao dao = new loaisanphamDao();
            String idd = String.valueOf(idsss);
            if(dao.delete(idd)){
                MessageDialog.showMessageDialog(mains, "Xóa dữ liệu thành công", "thông báo");
                loadDatatable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

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
            java.util.logging.Logger.getLogger(loaisanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loaisanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loaisanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loaisanphamss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loaisanphamss dialog = new loaisanphamss(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField ids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ngaytao;
    private javax.swing.JButton quyen;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField tenloai;
    private javax.swing.JTextField timkiem;
    // End of variables declaration//GEN-END:variables
}
