/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ShapeFactory s = new ShapeFactory();
       System.out.println(s.createShape(ShapeType.Rectangle).draw());
       System.out.println(s.createShape(ShapeType.Circle).draw());
       System.out.println(s.createShape(ShapeType.Triangle).draw()); 
    }
    
}
