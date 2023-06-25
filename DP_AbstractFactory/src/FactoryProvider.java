package org.example;


    public class FactoryProvider {
        public static AbstractFactory getFactory(String choice){
            switch(choice) {
                case "Alberto":
                    return new PizzeriaAlbertoFactory();

                case "Makkaroni":
                    return new PizzeriaMakkaroniFactory();

                default:
                    return new DefaultFactory();
            }


    }
    }



