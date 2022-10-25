/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.SQLException;
import java.util.List;
import model.TaiKhoan;
import repository.TaikhoanRepository;

/**
 *
 * @author Admin
 */
public class XacThucService {
    private final TaikhoanRepository taikhoanRepository;

    public XacThucService() {
        taikhoanRepository = new TaikhoanRepository();
    }
    public List<TaiKhoan> getLogin() {
        try {
            return taikhoanRepository.getLogin();
        } catch (SQLException ex) {
            return null;
        }
    }

    //Hàm xác thực ngừuoi dùng
    public boolean authenticate(String username, String password) throws SQLException {
        //1.Lấy tài khoản theo tên đăng nhập
        TaiKhoan account = taikhoanRepository.getAll(username);
        if (account != null) {
            //2.So sánh mật khẩu
            return account.getPassword().equals(password);
        }
        //Account ko tồn tại
        return false;
    }

    
    public String dangKi(String username, String password) throws SQLException {
        TaiKhoan account = taikhoanRepository.getAll(username);
        if(account != null){
            if(account.getUsername().equals(username)){
                return "true";
            } else{
                return "false";
            }
        }
        return "tồn tại";
    }
    
    public String authenticateEmail(String username, String email) throws SQLException {
        TaiKhoan account = taikhoanRepository.getAll(username);
        if (account != null) {
            if (account.getEmail().equals(email)) {
                return "true";
            } else{
                return "sai email";
            }
        } else{
            return "không tồn tại";
        }
        
    }
    
}
