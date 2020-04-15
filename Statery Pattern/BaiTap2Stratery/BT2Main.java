/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2Stratery;

/**
 *
 * @author admin
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        HangHoa hh = new HangHoa();
        hh.setTenHH("Banh");
        hh.setGia(25000);
        hh.setMoTa("Banh ngon");
        HangHoa hh2 = new HangHoa();
        hh2.setTenHH("Keo");
        hh2.setGia(30000);
        hh2.setMoTa("Keo ngon");
        gh1.hh.add(hh);
        gh1.hh.add(hh2);
        System.out.println("Gio hang1 :");
        int tien = 0;
        for(int i = 0; i < gh1.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+gh1.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < gh1.hh.size(); i++)
        {
            tien = tien + gh1.hh.get(i).getGia();
        }
        gh1.hinhthucTT(new ThanhToanOnline());
        System.out.println("So tien phai tra: "+ gh1.thanhToan(tien));
        GioHang gh2 = new GioHang();
        HangHoa hh4 = new HangHoa();
        hh4.setTenHH("Coca");
        hh4.setGia(3500000);
        hh4.setMoTa("20 thung nuoc ngot");
        HangHoa hh5 = new HangHoa();
        hh5.setTenHH("Pepsi");
        hh5.setGia(1000000);
        hh5.setMoTa("9 thung pepsi");
        HangHoa hh6 = new HangHoa();
        hh6.setTenHH("Mountain Dew");
        hh6.setGia(2500000);
        hh6.setMoTa("12 thung mountain dew");
        gh2.hh.add(hh4);
        gh2.hh.add(hh5);
        gh2.hh.add(hh6);
        System.out.println("Gio hang 2:");
        int tien2 = 0;
        for(int i = 0; i < gh2.hh.size(); i++)
        {
            System.out.println("Mat hang "+i+":[ "+gh2.hh.get(i).toString()+"]");
        }
        for(int i = 0; i < gh2.hh.size(); i++)
        {
            tien2 = tien2 + gh2.hh.get(i).getGia();
        }
        gh2.hinhthucTT(new ThanhToanCOD());
        System.err.println("So tien phai tra: "+gh2.thanhToan(tien2));
        
        // TODO code application logic here
    }
    
}
