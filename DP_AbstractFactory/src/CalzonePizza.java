package org.example;

import java.util.ArrayList;

public class CalzonePizza extends Pizza{

    public CalzonePizza() {
        super("Calzone");
    }
    public CalzonePizza(String name, ArrayList<String> al) {
        super(name, al);
    }
    public void prepare(){
        System.out.println("Preparing 6 min Calzone Pizza");
    }
    public void bake(){
        System.out.println("Baking 30 min at 350° Calzone");
    }
    public void cut(){
        System.out.println("No cut Calzone");
    }
    public void box(){
        System.out.println("Choosing special box for Calzone");
    }

}
