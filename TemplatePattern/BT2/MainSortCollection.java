/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortCollection;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class MainSortCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product1 = new Product("Tuong ot", 15000, 3000);
        Product product2 = new Product("Nuoc ngot cola", 5500, 200);
        Product product3 = new Product("Quan Jean", 300000, 650);
        ArrayList<Product> ds = new ArrayList<Product>();
        ds.add(product1);
        ds.add(product2);
        ds.add(product3);
        SortCollection sortbyname = new SortByName();
        SortCollection sortbyprice = new SortByPrice();
        sortbyname.sort(ds);
        System.out.println("sap xep theo ten: "+ds.toString());
        sortbyprice.sort(ds);
        System.out.println("sap xep theo gia: "+ds.toString());
        // TODO code application logic here
    }
    
}
