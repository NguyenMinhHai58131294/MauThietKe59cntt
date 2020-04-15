/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author admin
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setTen("Nguyễn Minh Hải");
        nv.setTuoi(22);
        nv.setDiaChi("12 Lê Hông Phong");
        nv.setTienLuong(2000);
        nv.setTongSoGioLam(150);
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyễn Văn Tiến");
        nv2.setTuoi(23);
        nv2.setDiaChi("30 Lê Lợi");
        nv2.setTienLuong(3000);
        nv2.setTongSoGioLam(400);
        System.out.println(""+nv.getThongTin() + " Tiền Thưởng " + nv.tinhThuong());
        System.out.println(""+nv2.getThongTin()+" Tiền Thưởng "+nv.tinhThuong());
        // TODO code application logic here
    }
    
}
