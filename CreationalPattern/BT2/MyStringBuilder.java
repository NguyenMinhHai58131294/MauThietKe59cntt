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
public class MyStringBuilder {
    String str = "abc";

    protected MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    public static class Builder{
        String str = "abc";
        public Builder addString(String s)
        {            
            this.str = str + s;
            return this;
        }
        public Builder addFloat(float f)
        {
            this.str = str + f;
            return this;
        }
        public Builder addBoolean(boolean b)
        {
            this.str = str + b;
            return this;
        }
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
    } 
   
    
}
