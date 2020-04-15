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
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sinhVienPoly pl = new sinhVienPoly() {
            @Override
            public double getDiem() {
                return 6.5;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        pl.setHoTen("Nguyễn Văn B");
        pl.setNganh("Công nghệ thực phẩm");
        pl.xuat();
        System.out.println(pl.getDiem()+" "+pl.getHocLuc());
        
        sinhVienIT it = new sinhVienIT();
        it.setHoTen("Nguyễn Văn A");
        it.setNganh("Công Nghệ Thông Tin");
        it.setDiemJava(9);
        it.setDiemCSS(8);
        it.setDiemHTML(7);
        it.xuat();
        System.out.println(it.getDiem() + "  "+ it.getHocLuc());

        sinhVienBiz biz = new sinhVienBiz();
        biz.setHoTen("Nguyễn Thị Hằng");
        biz.setNganh("Marketting");
        biz.setDiemMarketting(5);
        biz.setDiemSale(5);
        biz.xuat();
        System.out.println(biz.getDiem()+" "+biz.getHocLuc());
        // TODO code application logic here
    }
    
}
