/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b10_structure.model.Account;

/**
 *
 * @author Admin
 */
public class AccountRepository {

    private final static Account[] accounts = new Account[]{
        new Account("k12345", "123456"),
        new Account("admin", "admin")

    };

    public Account getAccountByUsername(String username) {
        for (Account account : accounts) { // duyệt danh sách tài khoản
            //nếu tài khoản trùng danh sách với tên cần tìm thì trả về
            if (account.getUsername().equalsIgnoreCase(username)) {
                return account;
            }
        }

        // không tìm thấy trả về null
        return null;
    }
}
