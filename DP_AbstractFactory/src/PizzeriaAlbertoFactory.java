package org.example;

public class PizzeriaAlbertoFactory implements AbstractFactory{

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        switch (pizzaType) {
            case "Cheese":
                pizza = new AlbertoCheesePizza();
                //pizza.name = "Cheese";
                break;
            case "Vegetarian":
                pizza = new AlbertoVegetarianPizza();
                break;
            //case "Pepperoni":
            //    pizza = new PepperoniPizza();
            //    break;
            case "Calzone":
                pizza = new AlbertoCalzonePizza();
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
