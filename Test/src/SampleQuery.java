/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class SampleQuery {

    public static void main(String[] args) throws SQLException {
        //1. lấy connection
        Connection connection = DBContext.getConnection();

        //2. Khởi tạo câu lệnh truy vấn
        String query = "SELECT * FROM sys.objects";
        Statement statement = connection.createStatement();

        //3. Truy vấn
        ResultSet rs = statement.executeQuery(query);
        //Di chuyển con trỏ đi từng bản ghi
        while (rs.next()) { //Nếu có dữ liệu 
//            String FirstCol = rs.getString(1); //lấy theo index
//            String nameCol = rs.getString("name"); // lấy theo tên
//            System.out.println(FirstCol+" "+nameCol);
            System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | "
                    + rs.getString(3) + " | " + rs.getString(4) + " | "
                    + rs.getString(5) + " | " + rs.getString(6) + " | "
                    + rs.getString(7) + " | " + rs.getString(8) + " | "
                    + rs.getString(9) + " | " + rs.getString(10) + " | "
                    + rs.getString(11) + " | " + rs.getString(12));
        }

    }
}
