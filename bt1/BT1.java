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
public class BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lopHoc lh = new lopHoc();
        HocSinh hs = new HocSinh();
        hs.setHoTen("Nguyễn Minh Hải");
        hs.setDiaChi("23 Lê Lợi");
        hs.setSdt("034185451");
        hs.setTuoi(22);
        hs.setLop("58-TH1");
        hs.setNangKhieu("C++");
        HocSinh hs2 = new HocSinh();
        hs2.setHoTen("Nguyễn Minh Quân");
        hs2.setDiaChi("21 Lê Lai");
        hs2.setSdt("07533842");
        hs2.setTuoi(21);
        hs2.setLop("58-TH1");
        hs2.setNangKhieu("Java");
        HocSinh hs3 = new HocSinh();
        hs3.setHoTen("Lê Thị Hồng");
        hs3.setDiaChi("60 Ngô Gai Tự");
        hs3.setSdt("08964321");
        hs3.setTuoi(21);
        hs3.setLop("58-TH1");
        hs3.setNangKhieu("Cơ Sở Dữ Liệu SQL");
        lh.themHocSinh(hs);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        GiaoVien gv = new GiaoVien();
        gv.setHoTen("Lê Thị Kha");
        gv.setDiaChi("23 Ngô Gia Tự");
        gv.setSdt("025498713");
        gv.setTuoi(36);
        gv.setMonDay("Lập trình Java");
        gv.setToBoMon("Kỹ Thuật phần mềm");
        lh.themGVCN(gv);
        System.out.println("Lớp 58TH-1");
        System.out.println("Danh sách học sinh lớp 58TH-1");
        lh.inDSHS();
        System.out.println("Danh sách giáo viên lớp 58TH-1");
        lh.inDSGV();
        
        
        // TODO code application logic here
    }
    
}
