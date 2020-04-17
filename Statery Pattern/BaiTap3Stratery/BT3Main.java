/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3Stratery;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin
 */
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdtf = new SimpleDateFormat("dd-MM-yyyy");
        ISoSanh ss = new SoSanhTheoTen();
        ISoSanh ss2 = new SoSanhTheoDiem();
        QLSV qlsv = new QLSV();
        SinhVien sv = new SinhVien();
        sv.setHoTen("Nguyễn Văn Hoàng");
        sv.setNgaySinh(sdtf.parse("20-03-1998"));
        sv.setDiemTB(7);
        SinhVien sv2 = new SinhVien();
        sv2.setHoTen("Lê Văn Đông");
        sv2.setNgaySinh(sdtf.parse("12-12-1997"));
        sv2.setDiemTB(9);
        SinhVien sv3 = new SinhVien();
        sv3.setHoTen("Võ Thị Thắm");
        sv3.setNgaySinh(sdtf.parse("25-05-1994"));
        sv3.setDiemTB(6);
        qlsv.dssv.add(sv);
        qlsv.dssv.add(sv2);
        qlsv.dssv.add(sv3);
        System.out.println("Sắp xếp theo tên");
        qlsv.setSs(ss);
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("Sắp xếp theo điểm");
        qlsv.setSs(ss2);
        qlsv.sapXep();
        qlsv.inDS();
       
        
        
        
    }
    
}
