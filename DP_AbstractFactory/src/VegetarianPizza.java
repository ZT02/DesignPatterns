package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class VegetarianPizza extends Pizza{
    public VegetarianPizza() {
        super("Vegetarian");
    }
    public VegetarianPizza(String name, ArrayList<String> al) {
        super(name, al);
    }
    public void prepare(){
        System.out.println("Preparing 3 min Vegetarian Pizza");
    }
    public void bake(){
        System.out.println("Baking 20 min at 350° Vegetarian");
    }

}
