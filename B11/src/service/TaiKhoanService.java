/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.SQLException;
import model.TaiKhoan;
import repository.Repo;

/**
 *
 * @author Admin
 */
public class TaiKhoanService {

    private final Repo repo;

    public TaiKhoanService() {
        repo = new Repo();
    }

    public boolean authenticate(TaiKhoan tk) throws SQLException {
        try {
            return repo.dangKi(tk);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateMK(String tk) {
        try {
            return repo.updateMK(tk);
        } catch (Exception e) {
            return false;
        }
    }
}
