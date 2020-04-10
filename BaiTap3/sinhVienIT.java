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
public class sinhVienIT extends sinhVienPoly{
    
    public double diemJava;
    public double diemCSS;
    public double diemHTML;

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }
    
    @Override
    public double getDiem() {
        return (2*diemJava + diemHTML + diemCSS)/ 4; 
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
