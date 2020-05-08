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
public class ShapeFactory {
    public Shape createShape(ShapeType shapetype)
    {
        Retangle r = Retangle.createInstance();
        Triangle t = Triangle.createInstance();
        Circle c = Circle.createInstance();
        switch(shapetype)
        {
            case Rectangle: return r;
            case Triangle: return t;
            case Circle: return c;
        }
        return null;
    }
}
