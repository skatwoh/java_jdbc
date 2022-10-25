/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TaiKhoan;
import repository.DBContext;
import service.TaiKhoanService;
import service.XacThucService;

/**
 *
 * @author Admin
 */
public class DangKyForm extends javax.swing.JFrame {

    /**
     * Creates new form DangKyForm
     */
    private final XacThucService xacThucService;
    private final TaiKhoanService taiKhoanService;
    List<TaiKhoan> taiKhoans = new ArrayList<>();

    public DangKyForm() {
        initComponents();
        taiKhoanService = new TaiKhoanService();
        xacThucService = new XacThucService();
    }

    public boolean validateForm() {
        if (txtUsername.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên tài khoản");
            return false;
        }
        try {
            String name = txtUsername.getText();
            Connection connection = DBContext.getConnection();
            String sql = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME ='" + name + "'";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery(sql);
            while (result.next()) {
                if (name.equalsIgnoreCase(txtUsername.getText())) {
                    JOptionPane.showMessageDialog(this, "Username đã tồn tại");
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if (txtHoTen.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return false;
        }

        if (txtPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống mật khẩu");
            return false;
        }
//        try {
//            String pass = "^(?=.*?[A-Z]).{8,16}$";
//            Pattern pattern = Pattern.compile(pass);
//            Matcher matcher = pattern.matcher(txtPassword.getText());
//            
//            if (!matcher.find()) {
//                JOptionPane.showMessageDialog(this, "Pass sai");
//                return false;
//            }

        try {
            String pass = txtPassword.getText();
            int u = 0;
            int d = 0;

            if (pass.length() < 8 || pass.length() > 16) {
                JOptionPane.showMessageDialog(this, "Mật khẩu phải từ 8 đến 16 kí tự");
                return false;
            }
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);
                if (Character.isUpperCase(c)) {
                    u = 1;
                }
                if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64)) {
                    d = 1;
                }
            }
            if (u != 1 || d == 1) {
                JOptionPane.showMessageDialog(this, "Mật khẩu phải có chữ viết hoa và không có kí tự");
                return false;
            }
        } catch (Exception e) {
        }

        if (txtRePass.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống repass");
            return false;
        }
        try {
            if(!txtRePass.getText().equals(txtPassword.getText())){
                JOptionPane.showMessageDialog(this, "Repass không đúng");
                return false;
            }
        } catch (Exception e) {
        }

        if (txtEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống email");
            return false;
        }
        try {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)"
                    + "*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(txtEmail.getText());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(this, "Email sai");
                return false;
            }
        } catch (Exception e) {

        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtRePass = new javax.swing.JPasswordField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Đăng Ký");

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        lblEmail.setText("Email");

        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        jLabel3.setText("RePass");

        lblHoTen.setText("Ho ten");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnDangKy)
                        .addGap(42, 42, 42)
                        .addComponent(btnDong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername)
                                    .addComponent(lblPassword)
                                    .addComponent(lblEmail)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txtHoTen)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRePass)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(btnDong))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            try {
                TaiKhoan tk = new TaiKhoan(txtUsername.getText(), txtHoTen.getText(), txtPassword.getText(), txtEmail.getText());
                
                boolean check = taiKhoanService.authenticate(tk);
                if(check == true){
                    JOptionPane.showMessageDialog(this, "Đăng kí thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại");
                }
                taiKhoans.add(tk);
            } catch (SQLException ex) {
                Logger.getLogger(DangKyForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        new DangNhapForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}