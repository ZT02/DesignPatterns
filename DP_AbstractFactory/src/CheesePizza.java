package org.example;

import java.util.ArrayList;

public class CheesePizza extends Pizza{

    public CheesePizza() {
        super("Cheese");
    }
    public CheesePizza(String name, ArrayList<String> al) {
        super(name, al);
    }
    public void prepare(){
        System.out.println("Preparing 5 min Cheese Pizza");
    }
    public void bake(){
        System.out.println("Baking 25 min at 350°Cheese");
    }

}
