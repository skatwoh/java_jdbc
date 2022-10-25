/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.TaiKhoan;
/**
 *
 * @author Admin
 */
public class Repo {
    public boolean dangKi(TaiKhoan tk) throws SQLException {
        int check = 0;

        Connection connection = DBContext.getConnection();
        String sql = "INSERT ACCOUNT(USERNAME, HOTEN, PASSWORD, EMAIL) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, tk.getUsername());
        ps.setString(2, tk.getHoTen());
        ps.setString(3, tk.getPassword());
        ps.setString(4, tk.getEmail());

        check = ps.executeUpdate();
        ps.close();
        connection.close();
        return true;
    }
    
    public boolean updateMK(String tk) throws SQLException {
        int check = 0;

        Connection connection = DBContext.getConnection();
        String sql = "UPDATE ACCOUNT SET PASSWORD='12345678H' WHERE USERNAME=?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, tk);

        check = ps.executeUpdate();
        ps.close();
        connection.close();
        return check > 0;
    }
}
