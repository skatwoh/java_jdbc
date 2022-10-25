/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2_adv;

/**
 *
 * @author Admin
 */
public class CuaKiemTraCovid extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
        //lấy số đo thân nhiệt của hành khách.
        double thanNhiet = hanhKhach.getThanNhiet();

        //kiểm tra thân nhiệt hợp lệ
        if (thanNhiet > 36.5 && thanNhiet < 37.5) {
            //cho cửa tiếp theo kiểm tra tiếp
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(hanhKhach);
            } else {
                return "Hợp lệ";
            }
        } else {
            return "Thân nhiệt không hợp lệ: " + hanhKhach.getTen();
        }
    }

}
