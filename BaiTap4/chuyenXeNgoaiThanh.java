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
public class chuyenXeNgoaiThanh extends chuyenXe{
    
    public String noiDen;
    public int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String toString() {
        return super.toString() + " Nơi đến: " + getNoiDen() + " Số ngày đi được " + getSoNgayDiDuoc(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    @Override
    public double doanhThu() {
        
       return soNgayDiDuoc * 200000;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
