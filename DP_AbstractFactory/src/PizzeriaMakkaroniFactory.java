package org.example;

public class PizzeriaMakkaroniFactory implements AbstractFactory{

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = null;
        switch (pizzaType) {
            case "Cheese":
                pizza = new MakkaroniCheesePizza();
                //pizza.name = "Cheese";
                break;
            case "Vegetarian":
                pizza = new MakkaroniVegetarianPizza();
                break;
            //case "Pepperoni":
            //    pizza = new PepperoniPizza();
            //    break;
            case "Calzone":
                pizza = new MakkaroniCalzonePizza();
                break;
            default:
                pizza = new MargharitaPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
