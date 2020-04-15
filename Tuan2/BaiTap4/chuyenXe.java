/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author admin
 */
public abstract class chuyenXe {
    public String maSoChuyen;
    public String hoVaTenTaiXe;
    public String soXe;

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoVaTenTaiXe() {
        return hoVaTenTaiXe;
    }

    public void setHoVaTenTaiXe(String hoVaTenTaiXe) {
        this.hoVaTenTaiXe = hoVaTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    @Override
    public String toString() {
        return "Mã số tuyến: "+ getMaSoChuyen() + " Tên tài xế: " + getHoVaTenTaiXe() + " Số xe: " + getSoXe() ;
    }
    
    public abstract double doanhThu();
    
}
