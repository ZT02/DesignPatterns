package org.example;

public class PizzaOnlineStoreTest {

    public static void main(String[] args) {

        FactoryProvider store = new FactoryProvider();
        Pizza p = store.getFactory("Alberto").orderPizza("Cheese");
        System.out.println("we orderd a " + p);



    }

}
