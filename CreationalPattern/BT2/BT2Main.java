/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author admin
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder m4 = new MyStringBuilder.Builder()
                .addString("hai")
                .addFloat(6)
                .addBoolean(false)
                .build();
        System.out.println(m4.toString());
    }
    
}
