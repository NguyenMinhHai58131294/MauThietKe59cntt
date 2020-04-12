/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class BatTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyên Văn Thái");
        nv1.setDiaChi("12 Lê Lợi");
        nv1.setTuoi(20);
        nv1.setTienLuong(2000);
        nv1.setTongSoGioLam(150);
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyên Văn Lộc");
        nv2.setDiaChi("02 Lê Lai");
        nv2.setTuoi(23);
        nv2.setTienLuong(2005);
        nv2.setTongSoGioLam(156);
        NhanVien nv3 = new NhanVien();
        nv3.setTen("Nguyên Thị Hương");
        nv3.setDiaChi("23 Phù Đổng");
        nv3.setTuoi(18);
        nv3.setTienLuong(200);
        nv3.setTongSoGioLam(140);
        NhanVien nv4 = new NhanVien();
        nv4.setTen("Huỳnh Văn Thái");
        nv4.setDiaChi("23 Ngô Gia Tự");
        nv4.setTuoi(21);
        nv4.setTienLuong(2010);
        nv4.setTongSoGioLam(200);
        NhanVien nv5 = new NhanVien();
        nv5.setTen("Nguyên Thị Hồng");
        nv5.setDiaChi("02 Trần Bình Trọng");
        nv5.setTuoi(23);
        nv5.setTienLuong(1980);
        nv5.setTongSoGioLam(256);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
    
}
