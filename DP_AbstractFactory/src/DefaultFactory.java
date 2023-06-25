package org.example;

public class DefaultFactory implements AbstractFactory{

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "Cheese":
                pizza = new CheesePizza();

                break;
            case "Vegetarian":
                pizza = new VegetarianPizza();
                break;
            case "Pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "Calzone":
                pizza = new CalzonePizza();
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
