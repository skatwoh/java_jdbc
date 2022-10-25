/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.model.Account;
import b10_structure.repository.AccountRepository;

/**
 *
 * @author Admin
 */
//Class phục vụ vấn đề xác thực người dùng
public class AuthenticationService {

    private final AccountRepository accountRepository;

    public AuthenticationService() {
        accountRepository = new AccountRepository();
    }

    //Hàm này có nhiệm vụ xác thực người dùng
    public boolean authenticate(String username, String password) {
        boolean isAccept = false;
        //Lấy tài khoản theo tên đăng nhập
        Account account = accountRepository.getAccountByUsername(username);
        if (account != null) {
            //So sánh mật khẩu
            return account.getPassword().equals(password);
        }
        //account không tồn tại 
        return false;
    }
}
