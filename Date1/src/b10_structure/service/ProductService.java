/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.repository.ProductRepository;
import b8_crud.Product;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductService {

    private final ProductRepository repository;

    public ProductService() {
        repository = new ProductRepository();
    }

    public List<Product> getAllProducts() {
        List<Product> products = null;

        try {
            //Gọi repo lấy danh sách sản phẩm từ csdl
            return products = repository.getAll();
        } catch (SQLException ex) {
            return null; //trả về null nếu có lỗi

        }
    }
}
