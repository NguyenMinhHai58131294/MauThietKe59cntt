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
public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String sdt;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String hienthiTT ()
    {
        return "Họ và tên: "+getHoTen()+" Tuổi: "+getTuoi()+" Địa chỉ: "+getDiaChi()+" SĐT: "+getSdt();
    }
    
}
