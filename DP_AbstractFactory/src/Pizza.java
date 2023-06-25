package org.example;

import java.util.ArrayList;

public abstract class Pizza {
    private String name;
    private ArrayList<String> toppings = new ArrayList<String>();
    public Pizza(String name) {
        this.name = name;
    }
    public Pizza(String name, ArrayList<String> toppings) {
        this.name = name;
        this.toppings = toppings;
    }
    public void prepare(){}
    public void bake(){}
    public void cut(){
        System.out.println("Cut " + name);
    }
    public void box(){
        System.out.println("Boxing " + name);
    }

    public String toString(){
        String toppings ="with ";
        for(String s : this.toppings)
            toppings+= s + " ";

        return "----"+name+"----\n"+toppings;

    }


}
