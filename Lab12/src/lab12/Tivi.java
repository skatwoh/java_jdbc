/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12;

/**
 *
 * @author Admin
 */
public class Tivi {
    private String maTiVi;
    private String ten;
    private String moTa;
    private int namSanXuat;
    private String hang;
    private int kichThuoc;
    private double gia;
    private String loaiMan;

    public Tivi() {
    }

    public Tivi(String maTiVi, String ten, String moTa, int namSanXuat, String hang, int kichThuoc, double gia, String loaiMan) {
        this.maTiVi = maTiVi;
        this.ten = ten;
        this.moTa = moTa;
        this.namSanXuat = namSanXuat;
        this.hang = hang;
        this.kichThuoc = kichThuoc;
        this.gia = gia;
        this.loaiMan = loaiMan;
    }

    public String getMaTiVi() {
        return maTiVi;
    }

    public void setMaTiVi(String maTiVi) {
        this.maTiVi = maTiVi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getNgaySanXuat() {
        return namSanXuat;
    }

    public void setNgaySanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoaiMan() {
        return loaiMan;
    }

    public void setLoaiMan(String loaiMan) {
        this.loaiMan = loaiMan;
    }
    
    
}
