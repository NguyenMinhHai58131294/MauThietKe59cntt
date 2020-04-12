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
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    @Override
    public String hienthiTT() {
        return super.hienthiTT()+" Môn Dạy: "+getMonDay()+" Bộ Môn: "+getToBoMon(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
