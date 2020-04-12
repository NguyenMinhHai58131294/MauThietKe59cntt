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
public class lopHoc {
    
    public lopHoc() {
    }
    QLDS qldshs = new QLDS();
    QLDS qldsgv = new QLDS();
    
    public int themHocSinh(HocSinh hs)
    {
          qldshs.them(hs);
          return 1;
    }
    public int themGVCN(GiaoVien gv)
    {
          qldsgv.them(gv);
          return 1;
    }
    public int inDSHS()
    {
       
        qldshs.inDS(qldshs.ds);
        return 1;
    }
    public int inDSGV()
    {
        qldsgv.inDS(qldsgv.ds);
        return 1;
    }
            
}
