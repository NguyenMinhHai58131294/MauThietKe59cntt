/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;




/**
 *
 * @author admin
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon();
        hd.hdh = new HoaDonHeader.Builder()
                .addMaHoaDon("HD01")
                .addNgayBan("06-05-2020")
                .addTenKhachHang("Huynh Đông")
                .build();
        CTHD ct = new CTHD.Builder()
                .addSanPham("Cá Hộp")
                .addDonGia(3000)
                .addSoLuong(3)
                .addChietKhau(20)
                .build();
        CTHD ct2 = new CTHD.Builder()
                .addSanPham("Thịt hộp")
                .addDonGia(5000)
                .addSoLuong(3)
                .addChietKhau(30)
                .build();
        hd.ds.add(ct);
        hd.ds.add(ct2);
        System.out.println("Hóa đơn 1:\n");
        System.out.println(hd.hdh.toString());
        for(int i = 0; i < hd.ds.size(); i++)
        {
            System.out.println("Sản phẩm thứ "+(i+1)+"\n"+hd.ds.get(i).toString());
        }
        
        
                
       
    }
    
}
