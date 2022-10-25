/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2_adv;

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

        CuaKiemTra cuaKiemTra = new CuaKiemTraCovid();
        cuaKiemTra.setCuaTiepTheo(new CuaKiemTraHanhLy())
                .setCuaTiepTheo(new CuaKiemTraToanThan());

        for (HanhKhach hanhKhach : dsHanhKhach) {
            String message = cuaKiemTra.kiemTra(hanhKhach);
            System.out.println(message);
        }
    }
}
