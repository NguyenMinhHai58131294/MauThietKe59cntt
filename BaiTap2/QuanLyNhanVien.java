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
public class QuanLyNhanVien implements IQuanLi{

    ArrayList<NhanVien> nhanVien = new ArrayList();

    
    @Override
    public void them(NhanVien nv) {
       nhanVien.add(nv);
      // ortedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        for(int i = 0; i < nhanVien.size(); i++)
        {
            System.out.println(nhanVien.get(i).getThongTin());
        }
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
