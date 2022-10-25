/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date1;

/**
 *
 * @author Admin
 */
public class HocSinh {

    private String maHocSinh;
    private String hoTen;
    private Integer tuoi;
    private Float diem;
    private Double canNang;
    private String soDienThoai;
    private String diaChi;

    public void hoc() {
        System.out.println("Học tập suốt đời!");
    }

    public void traoDoi(HocSinh thangBenCanh) {
        String mssvThangBenCanh = thangBenCanh.maHocSinh;
        System.out.println("Đang trao đổi với " + mssvThangBenCanh);
    }
    
    //Hàm khởi tạo 
    public HocSinh() {
    }
    
    //Hàm khởi tạo có tham số
    public HocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }
    
    
}
