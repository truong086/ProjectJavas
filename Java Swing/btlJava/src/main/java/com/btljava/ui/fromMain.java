/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;

/**
 *
 * @author ASUS
 */
public class fromMain extends javax.swing.JFrame {
    private doituongs doituongs;
    private loaisanphams lsp;
    private taikhoans tk;
    private nhommaus nm;
    private chucvus cv;
    private nhanviens nv;
    private benhnhans bv;
    private tienluongs tl;
    private sanphams sp;
    private hoadons hd;
    private khos kh;
    private loaigiuongs lg;
    private giuongngus gn;
    private cuochens ch;
    private nhataitros ntt;
    private hoadonnhaps hdn;
    private guiemail email;
    private thongke thongkes;
    private benhnhanss bns;
    /**
     * Creates new form fromMain
     */
    public fromMain() {
        initComponents();
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doituong = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        tpan = new javax.swing.JTabbedPane();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        taikhoans = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        test = new javax.swing.JButton();
        test1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        doituong.setText("Đối tượng");
        doituong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doituongActionPerformed(evt);
            }
        });

        jButton2.setText("Kho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hóa đơn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sản phẩm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Tiền lương");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Nhân viên");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Bệnh nhân");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Tài khoản");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Nhóm máu");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Loại sản phẩm");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Chức vụ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Giường ngủ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Nhà tài trợ");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Cuộc hẹn");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Loại giường");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Hóa đơn nhập");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        taikhoans.setText("jLabel1");

        jButton17.setText("Gửi email");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Thống kê");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Đổi mật khẩu");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        test.setText("Test");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        test1.setText("from");
        test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taikhoans, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(175, 175, 175)
                        .addComponent(test)
                        .addGap(18, 18, 18)
                        .addComponent(test1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doituong)
                                .addGap(32, 32, 32)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton19))
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(38, 38, 38)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(28, 28, 28)
                                .addComponent(jButton7)
                                .addGap(27, 27, 27)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(47, 47, 47)
                                .addComponent(jButton16))))
                    .addComponent(tpan, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(taikhoans)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doituong)
                    .addComponent(jButton10)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton11)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton5)
                    .addComponent(jButton17))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton16)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton13)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(test)
                    .addComponent(test1))
                .addGap(18, 18, 18)
                .addComponent(tpan, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doituongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doituongActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            doituong.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
             // Khi người dùng click vào from khác thì sẽ hiển thị from đó lên
            if(doituongs == null){ // Kiểm tra xem tab đó đã được mở chưa, nếu chưa được mở thì thực câu lệnh bên dưới
                doituongs = new doituongs(); // Khởi tạo from "studentManeger"
                //ImageIcon icon = new ImageIcon(getClass().getResource("com/mycompany/testswing/icons/anh.jsp")); // Hiển thị icon trên thanh tab khi mở
                //tpan.addTab("Quản lý sinh viên", icon, mStudent, "Quản lý sinh viên");
                tpan.addTab("Quản lý đối tượng", doituongs); // Đặt tên cho tab đó
            }
            tpan.setSelectedComponent(doituongs); // Hiển thị tab đó lên
            // "tpan" nghĩa là tên của thẻ "panel" để hiển thị các tab lên đó, phải có thẻ "panel" thì mới hiển thị các tab lên được
        }
       
        
    }//GEN-LAST:event_doituongActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton10.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            // Khi người dùng click vào from khác thì sẽ hiển thị from đó lên
            if(lsp == null){ // Kiểm tra xem tab đó đã được mở chưa, nếu chưa được mở thì thực câu lệnh bên dưới
                lsp = new loaisanphams(); // Khởi tạo from "studentManeger"
                //ImageIcon icon = new ImageIcon(getClass().getResource("com/mycompany/testswing/icons/anh.jsp")); // Hiển thị icon trên thanh tab khi mở
                //tpan.addTab("Quản lý sinh viên", icon, mStudent, "Quản lý sinh viên");
                tpan.addTab("Quản lý đối tượng", lsp); // Đặt tên cho tab đó
            }
            tpan.setSelectedComponent(lsp); // Hiển thị tab đó lên
            // "tpan" nghĩa là tên của thẻ "panel" để hiển thị các tab lên đó, phải có thẻ "panel" thì mới hiển thị các tab lên được
        }

//          test tests = new test(this, true);
//          tests.setVisible(true);
//          tests.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("2") || phanquyen.equals("3")){
            jButton8.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            // Khi người dùng click vào from khác thì sẽ hiển thị from đó lên
            if(tk == null){ // Kiểm tra xem tab đó đã được mở chưa, nếu chưa được mở thì thực câu lệnh bên dưới
                tk = new taikhoans(); // Khởi tạo from "studentManeger"
                //ImageIcon icon = new ImageIcon(getClass().getResource("com/mycompany/testswing/icons/anh.jsp")); // Hiển thị icon trên thanh tab khi mở
                //tpan.addTab("Quản lý sinh viên", icon, mStudent, "Quản lý sinh viên");
                tpan.addTab("Quản lý đối tượng", tk); // Đặt tên cho tab đó
            }
            tpan.setSelectedComponent(tk); // Hiển thị tab đó lên
            // "tpan" nghĩa là tên của thẻ "panel" để hiển thị các tab lên đó, phải có thẻ "panel" thì mới hiển thị các tab lên được
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String phanuyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanuyen.equals("3")){
            jButton9.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            // Khi người dùng click vào from khác thì sẽ hiển thị from đó lên
            if(nm == null){ // Kiểm tra xem tab đó đã được mở chưa, nếu chưa được mở thì thực câu lệnh bên dưới
                nm = new nhommaus(); // Khởi tạo from "studentManeger"
                //ImageIcon icon = new ImageIcon(getClass().getResource("com/mycompany/testswing/icons/anh.jsp")); // Hiển thị icon trên thanh tab khi mở
                //tpan.addTab("Quản lý sinh viên", icon, mStudent, "Quản lý sinh viên");
                tpan.addTab("Quản lý đối tượng", nm); // Đặt tên cho tab đó
            }
            tpan.setSelectedComponent(nm); // Hiển thị tab đó lên
            // "tpan" nghĩa là tên của thẻ "panel" để hiển thị các tab lên đó, phải có thẻ "panel" thì mới hiển thị các tab lên được
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton11.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(cv == null){
                cv = new chucvus();

                tpan.addTab("Quản lý chức vụ", cv);
            }
            tpan.setSelectedComponent(cv);
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3") || phanquyen.equals("2")){
            jButton6.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(nv == null){
                nv = new nhanviens();

                tpan.addTab("Nhân viên", nv);
            }

            tpan.setSelectedComponent(nv);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(bv == null){
            bv = new benhnhans();
            
            tpan.addTab("Bệnh nhân", bv);
        }
        
        tpan.setSelectedComponent(bv);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3") || phanquyen.equals("2")){
            jButton5.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(tl == null){
                tl = new tienluongs();

                tpan.addTab("Tiền lương", tl);
            }

            tpan.setSelectedComponent(tl);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(sp == null){
            sp = new sanphams();
            
            tpan.addTab("Sản phẩm", sp);
        }
        
        tpan.setSelectedComponent(sp);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(hd == null){
            hd = new hoadons();
            
            tpan.addTab("Hóa đơn", hd);
        }
        
        tpan.setSelectedComponent(hd);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton2.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(kh == null){
                kh = new khos();

                tpan.addTab("Kho", kh);
            }

            tpan.setSelectedComponent(kh);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton12.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(gn == null){
                gn = new giuongngus();

                tpan.addTab("Giường ngủ", gn);
            }

            tpan.setSelectedComponent(gn);
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton13.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(ntt == null){
                ntt = new nhataitros();

                tpan.addTab("Nhà tài trợ", ntt);
            }

            tpan.setSelectedComponent(ntt);
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton14.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(ch == null){
                ch = new cuochens();

                tpan.addTab("Cuộc hẹn", ch);
            }

            tpan.setSelectedComponent(ch);
        }
       
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
//        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton15.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(lg == null){
                lg = new loaigiuongs();

                tpan.addTab("Loại giường", lg);
            }
        
            tpan.setSelectedComponent(lg);
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton16.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(hdn == null){
                hdn = new hoadonnhaps();

                tpan.addTab("Hóa đơn nhập", hdn);
            }

            tpan.setSelectedComponent(hdn);
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        logins lg = new logins(this, true);
        lg.setVisible(true);
        
        phanquyen();
        phanquyens();
    }//GEN-LAST:event_formWindowOpened

    private void phanquyens(){
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            doituong.hide();
            jButton17.hide();
            jButton16.hide();
            jButton15.hide();
            jButton14.hide();
            jButton13.hide();
            jButton12.hide();
            jButton2.hide();
            jButton5.hide();
            jButton6.hide();
            jButton11.hide();
            jButton9.hide();
            jButton10.hide();
            jButton8.hide();
        }
        if(phanquyen.equals("2")){
            jButton8.hide();
        }
    }
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            jButton17.hide();
            MessageDialog.showMessageError(tpan, "Bạn không có quyền", "Lỗi");
            return;
        }else{
            if(email == null){
                email = new guiemail();

                tpan.addTab("Gửi email", email);
            }

            tpan.setSelectedComponent(email);
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(thongkes == null){
            thongkes = new thongke();
            
            tpan.addTab("Thống kê", thongkes);
        }
        
        tpan.setSelectedComponent(thongkes);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        doimatkhau mk = new doimatkhau(this, true);
        mk.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
        benhnhanss bn = new benhnhanss(this, true);
        bn.setVisible(true);
    }//GEN-LAST:event_testActionPerformed

    private void test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test1ActionPerformed
        // TODO add your handling code here:
        fromMainss mains = new fromMainss();
        mains.setVisible(true);
    }//GEN-LAST:event_test1ActionPerformed
    
    private void phanquyen(){
        String tentaikhoan = String.valueOf(ShereData.dangnhap.getTentaikhoan());
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        taikhoans.setText("Xin chào " + tentaikhoan);
        if(phanquyen.equals("1")){
            //doituong.hide();
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(fromMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doituong;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel taikhoans;
    private javax.swing.JButton test;
    private javax.swing.JButton test1;
    private javax.swing.JTabbedPane tpan;
    // End of variables declaration//GEN-END:variables
}
