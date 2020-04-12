/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author admin
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String hienthiTT() {
        return super.hienthiTT() + " Lớp: " +getLop() + " Năng khiếu: " + getNangKhieu() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
