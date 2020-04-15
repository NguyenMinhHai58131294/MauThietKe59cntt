/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QLDS implements iQLDS{
   
    ArrayList<CaNhan> ds = new ArrayList<CaNhan>();

    public QLDS() {
    }
    
    @Override
    public int them(CaNhan p) {
        ds.add(p);
        return 1;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
            return 1;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS(ArrayList<CaNhan> ds) {
        for(int i = 0; i < ds.size(); i++)
        {
            System.out.println(ds.get(i).hienthiTT());
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
