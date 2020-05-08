/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author admin
 */
public class Circle extends Shape{
    
    private static Circle instance;
    public static Circle createInstance()
    {
        if(instance == null)
        {
            return new Circle();
        }
        return instance;
    }
    @Override
    public String draw() {
         return brush + " " + paper + " lên " + frame + "có hình tròn và cắt";
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
