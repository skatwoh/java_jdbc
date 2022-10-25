/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date2;

/**
 *
 * @author Admin
 */
public class HanhKhach {

    private String ten;
    private Double thanNhiet;
    private Double soCanHanhLy;
    private Boolean coVuKhi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getThanNhiet() {
        return thanNhiet;
    }

    public void setThanNhiet(Double thanNhiet) {
        this.thanNhiet = thanNhiet;
    }

    public Double getSoCanHanhLy() {
        return soCanHanhLy;
    }

    public void setSoCanHanhLy(Double soCanHanhLy) {
        this.soCanHanhLy = soCanHanhLy;
    }

    public Boolean getCoVuKhi() {
        return coVuKhi;
    }

    public void setCoVuKhi(Boolean coVuKhi) {
        this.coVuKhi = coVuKhi;
    }

    public HanhKhach() {
    }

    public HanhKhach(String ten, Double thanNhiet, Double soCanHanhLy, Boolean coVuKhi) {
        this.ten = ten;
        this.thanNhiet = thanNhiet;
        this.soCanHanhLy = soCanHanhLy;
        this.coVuKhi = coVuKhi;
    }
    
    
}
