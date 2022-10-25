/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b8_crud;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SampleQuery {

    public static void main(String[] args) throws SQLException {
//        newproduct();
        List<Product> products = readProduct();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //Hàm này để hiển thị dữ liệu trong bảng Product
    public static List<Product> readProduct() throws SQLException {
        List<Product> products = new ArrayList<>();
        Connection connection = DBContext.getConnection();

        String query = "SELECT ProductId, ProductName, Price, Quantity FROM Product";
        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            //lấy dữ liệu từ DB
            Integer id = rs.getInt("ProductId");
            String name = rs.getString("ProductName");
            BigDecimal price = rs.getBigDecimal("Price");
            Integer quantity = rs.getInt("Quantity");

            Product product = new Product();//khởi tạo đối tượng
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);

            products.add(product);//thêm vào danh sách
        }

        //chạy xong phải ngắt kết nối để tiết kiệm tài nguyên
        rs.close();
        statement.close();
        connection.close();
        return products;
    }

    public static void newproduct() throws SQLException {
        Connection connection = DBContext.getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO Product VALUES('Product 1', 10000, 100)";

        //Thực thi câu lệnh
        int affectedRow = statement.executeUpdate(sql);
        System.out.println("Số bản ghi thêm mới thành công = " + affectedRow);

        //Đóng kết nối
        statement.close();
        connection.close();
    }

    public static void updateProduct() throws SQLException {
        Connection connection = DBContext.getConnection();
        Statement statement = connection.createStatement();
        String sql = "UPDATE Product SET ProductName = 'Product 2' WHERE ProductId = 5002)";

        //Thực thi câu lệnh
        int affectedRow = statement.executeUpdate(sql);
        System.out.println("Số bản ghi cập nhật thành công = " + affectedRow);

        //Đóng kết nối
        statement.close();
        connection.close();
    }
}
