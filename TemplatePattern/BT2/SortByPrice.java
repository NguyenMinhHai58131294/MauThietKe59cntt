/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortCollection;

/**
 *
 * @author admin
 */
public class SortByPrice extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
          if(t1.getPrice()>t2.getPrice())
          {
              return 1;
          }else
              if(t1.getPrice()<t2.getPrice())
              {
                  return -1;
              }else
                  return 0;
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
