/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2_adv;

/**
 *
 * @author Admin
 */
public class CuaKiemTraToanThan extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
        if (hanhKhach.getCoVuKhi()) {
            return "Không được mang vũ khí";
        } else {
            return "Hợp lệ";
        }
    }

}
