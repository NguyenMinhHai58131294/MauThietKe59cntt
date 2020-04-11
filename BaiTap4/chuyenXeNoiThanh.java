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
public class chuyenXeNoiThanh extends chuyenXe{
    
    public int soTuyen;
    public float soKmDiDuoc;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(float soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Số tuyến: "+ getSoTuyen()+" Số km đi được :"+getSoKmDiDuoc() ;
    }

   
    
    @Override
    public double doanhThu() {
            
        return soKmDiDuoc * 50000;
   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
