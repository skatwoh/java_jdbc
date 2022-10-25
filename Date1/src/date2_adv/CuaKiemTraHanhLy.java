/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2_adv;

/**
 *
 * @author Admin
 */
public class CuaKiemTraHanhLy extends CuaKiemTra {

    @Override
    public String kiemTra(HanhKhach hanhKhach) {
        Double soCan = hanhKhach.getSoCanHanhLy();

        if (soCan > 0 && soCan < 20) {
            if (cuaTiepTheo != null) {
                return cuaTiepTheo.kiemTra(hanhKhach);
            } else {
                return "Hợp lệ";
            }
        } else {
            return "Số cân không hợp lệ";
        }
    }
}
