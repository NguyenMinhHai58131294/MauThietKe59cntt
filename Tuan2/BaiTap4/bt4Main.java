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
public class bt4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       quanLiChuyenXe qlcx = new quanLiChuyenXe();
       chuyenXeNoiThanh nt = new chuyenXeNoiThanh();
       nt.setMaSoChuyen("CXNT1");
       nt.setHoVaTenTaiXe("Nguyễn Văn A");
       nt.setSoXe("79H-86413");
       nt.setSoTuyen(01);
       nt.setSoKmDiDuoc(79);
       chuyenXeNoiThanh nt2 = new chuyenXeNoiThanh();
       nt2.setMaSoChuyen("CXNT2");
       nt2.setHoVaTenTaiXe("Nguyễn Văn Đông");
       nt2.setSoXe("79N-05498");
       nt2.setSoTuyen(03);
       nt2.setSoKmDiDuoc(20);
       chuyenXeNoiThanh nt3 = new chuyenXeNoiThanh();
       nt3.setMaSoChuyen("CXNT3");
       nt3.setHoVaTenTaiXe("Huỳnh Văn Hoàng");
       nt3.setSoXe("79K-02548");
       nt3.setSoTuyen(10);
       nt3.setSoKmDiDuoc(30);
       qlcx.cxnt.add(nt);
       qlcx.cxnt.add(nt2);
       qlcx.cxnt.add(nt3);
       chuyenXeNgoaiThanh ngth = new chuyenXeNgoaiThanh();
       ngth.setMaSoChuyen("CXNGT1");
       ngth.setHoVaTenTaiXe("Lê Văn Lai");
       ngth.setSoXe("79K-03548");
       ngth.setNoiDen("TP.HCM");
       ngth.setSoNgayDiDuoc(1);
       ngth.doanhThu();
       chuyenXeNgoaiThanh ngth2 = new chuyenXeNgoaiThanh();
       ngth2.setMaSoChuyen("CXNGT2");
       ngth2.setHoVaTenTaiXe("Lê Phát Tài");
       ngth2.setSoXe("79L-014855");
       ngth2.setNoiDen("Hà Nội");
       ngth2.setSoNgayDiDuoc(4);
       ngth2.doanhThu();
       chuyenXeNgoaiThanh ngth3 = new chuyenXeNgoaiThanh();
       ngth3.setMaSoChuyen("CXNGT3");
       ngth3.setHoVaTenTaiXe("Võ Văn Ái");
       ngth3.setSoXe("79I-67431");
       ngth3.setNoiDen("Huế");
       ngth3.setSoNgayDiDuoc(3);
       ngth3.doanhThu();
       qlcx.cxngt.add(ngth);
       qlcx.cxngt.add(ngth2);
       qlcx.cxngt.add(ngth3);
       for(int i = 0; i < qlcx.cxnt.size(); i++)
       {
           System.out.println("Chuyến xe nội thành "+qlcx.cxnt.get(i).toString());
       }
       for(int k = 0; k < qlcx.cxngt.size(); k++)
       {
           System.out.println("Chuyến xe ngoại thành "+qlcx.cxngt.get(k).toString());
       }
       double sNT = 0;
       for(int m = 0 ; m<qlcx.cxnt.size(); m++)
       {
           sNT = sNT + qlcx.cxnt.get(m).doanhThu(); 
       }
        System.out.println("Tổng doanh thu chuyến xe nội thành: "+sNT);
       double sNgT = 0;
       for(int n = 0; n < qlcx.cxngt.size(); n++)
       {
           sNgT = sNgT + qlcx.cxngt.get(n).doanhThu();
       }
        System.out.println("Tổng doanh thu chuyến xe ngoại thành: "+sNgT);
        double S = sNT + sNgT;
        System.out.println("Tổng doanh thu các chuyến xe: "+S);
        // TODO code application logic here
    }
    
}
