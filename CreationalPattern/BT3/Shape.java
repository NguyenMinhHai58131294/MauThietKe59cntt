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
public abstract class Shape {
    String brush = "Chải ";
    String paper = " tờ giấy ";
    String frame = " khung ";

    public Shape() {
    }

    
    public abstract String draw();
}
