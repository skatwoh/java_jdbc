/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2;

/**
 *
 * @author Admin
 */
public class CuaKiemTraCovid {

    public boolean kiemTraThanNhiet(HanhKhach hanhKhach) {
        //lấy số đo thân nhiệt của hành khách.
        double thanNhiet = hanhKhach.getThanNhiet();

        //kiểm tra thân nhiệt hợp lệ
        if (thanNhiet > 36.5 && thanNhiet < 37.5) {
            return true; //hợp lệ
        } else {
            return false; //không hợp lệ
        }
    }
}
