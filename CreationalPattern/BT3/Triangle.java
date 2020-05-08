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
public class Triangle extends Shape{
    private static Triangle instance;
    public static Triangle createInstance()
    {
        if(instance == null)
        {
            return new Triangle();
        }
        return instance;
    }
    @Override
    public String draw() {
         return brush + " " + paper + " lên " + frame + " có hình tam giác và cắt";
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
