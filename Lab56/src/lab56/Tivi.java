/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab56;

/**
 *
 * @author Admin
 */
public class Tivi {

    private String ma;
    private String ten;
    private String moTa;
    private String ngaySanXuat;
    private String loai;
    private Integer inch;
    private String khaNang;
    private String conKhaDung;
    private String doPhanGiai;

    public Tivi() {
    }

    public Tivi(String ma, String ten, String moTa, String ngaySanXuat, String loai, Integer inch, String khaNang, String conKhaDung, String doPhanGiai) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.ngaySanXuat = ngaySanXuat;
        this.loai = loai;
        this.inch = inch;
        this.khaNang = khaNang;
        this.conKhaDung = conKhaDung;
        this.doPhanGiai = doPhanGiai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Integer getInch() {
        return inch;
    }

    public void setInch(Integer inch) {
        this.inch = inch;
    }

    public String getKhaNang() {
        return khaNang;
    }

    public void setKhaNang(String khaNang) {
        this.khaNang = khaNang;
    }

    public String getConKhaDung() {
        return conKhaDung;
    }

    public void setConKhaDung(String conKhaDung) {
        this.conKhaDung = conKhaDung;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

}
