/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b8_crud.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ProductRepository {

    public List<Product> getAll() throws SQLException {
        List<Product> products = new ArrayList<>();

        Connection connection = DBContext.getConnection();
        String sql = "SELECT ProductID, ProductName, Price, Quantity FROM Product";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        //duyệt từng bản ghi
        while (rs.next()) {
            //lấy thông tin từng đối tượng
            Integer id = rs.getInt("ProductID");
            String name = rs.getString("ProductName");
            BigDecimal price = rs.getBigDecimal("Price");
            Integer quantity = rs.getInt("Quantity");

            //Khởi tạo đối tượng
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);

            //thêm vào list
            products.add(product);
        }

        return products;
    }
}
