/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2;

/**
 *
 * @author Admin
 */
public class ChuongTrinhKiemTra {

    public static void main(String[] args) {
        HanhKhach[] dsHanhKhach = new HanhKhach[]{
            new HanhKhach("Phong", 38.0, 100.0, true),
            new HanhKhach("Tuấn", 37.0, 10.0, false),
            new HanhKhach("Trần", 37.0, 5.0, true)
        };

        CuaKiemTraCovid cuaMot = new CuaKiemTraCovid();
        CuaKiemTraHanhLy cuaHai = new CuaKiemTraHanhLy();

        for (HanhKhach hanhKhach : dsHanhKhach) {
            if (cuaMot.kiemTraThanNhiet(hanhKhach)) {
                //nếu hợp lệ
                System.out.println("Thân nhiệt hợp lệ " + hanhKhach.getTen());
            } else {
                System.out.println("Thân nhiệt không hợp lệ " + hanhKhach.getTen());
                continue; //đằng sau đi vào tiếp
            }

            if (cuaHai.kiemTraSoCan(hanhKhach)) {
                System.out.println("Số cân hợp lệ");
            } else {
                System.out.println("Số cân không hợp lệ");
            }
        }
    }
}
