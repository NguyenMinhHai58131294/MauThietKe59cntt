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
public class MainBT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ct = new context();
        ct.setTinhToan(new cong());
        System.out.println("75+12="+ct.tinh(75, 12));
        context ct2 = new context();
        ct2.setTinhToan(new tru());
        System.out.println("54-78="+ct2.tinh(54, 78));
    
}
}
