/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1Stratery;

/**
 *
 * @author admin
 */
public class chia implements iTinh{

    @Override
    public float tinh(float a, float b) {
        if(b!=0)
        {
            return a/b;
        }else return 0;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
