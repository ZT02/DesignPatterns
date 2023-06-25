package org.example;

public class PepperoniPizza extends Pizza {


    public PepperoniPizza() {
        super("Pepperoni");
    }
    public void prepare(){
        System.out.println("Preparing 4 min Pepperoni Pizza");
    }
    public void bake(){
        System.out.println("Baking 27 min at 350°Pepperoni");
    }

}
