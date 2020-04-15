/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author admin
 */
public class sinhVienBiz extends sinhVienPoly{

    public double diemMarketting;
    public double diemSale;

    public double getDiemMarketting() {
        return diemMarketting;
    }

    public void setDiemMarketting(double diemMarketting) {
        this.diemMarketting = diemMarketting;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }
    
    @Override
    public double getDiem() {
        return (2*diemMarketting + diemSale)/3;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
