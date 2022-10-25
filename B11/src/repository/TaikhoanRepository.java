/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author Admin
 */


public class TaikhoanRepository {
    
    public final List<TaiKhoan> getLogin() throws SQLException{
        List<TaiKhoan> taiKhoans = new ArrayList<>();
        
        Connection connection = DBContext.getConnection();
        String sql = "SELECT USERNAME, HOTEN, PASSWORD, EMAIL FROM ACCOUNT";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            String name = rs.getString("USERNAME");
            String hoTen = rs.getString("HOTEN");
            String pass = rs.getString("PASSWORD");
            String email = rs.getString("EMAIL");
            
            TaiKhoan taiKhoan = new TaiKhoan();
            taiKhoan.setUsername(name);
            taiKhoan.setHoTen(hoTen);
            taiKhoan.setPassword(pass);
            taiKhoan.setEmail(email);
            
            taiKhoans.add(taiKhoan);
        }
        
        return taiKhoans;
    }
    
    public TaiKhoan getAll(String username) throws SQLException{
        for (TaiKhoan taiKhoan : getLogin()) {
            if (taiKhoan.getUsername().equalsIgnoreCase(username)) {
                return taiKhoan;
            }
        }
        return null;
    }
    
}
