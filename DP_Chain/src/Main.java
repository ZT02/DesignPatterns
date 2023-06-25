public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1.5, 15,25,10, Adress.DOMESTIC);
        Order order2 = new Order(35.0, 76,50,70, Adress.INTERNATIONAL);
        Order order3 = new Order(4.5, 48,19,9, Adress.DOMESTIC);
        Order order4 = new Order(9.5, 80,50,100, Adress.EUROPEAN_UNION);
        Order order5 = new Order(3.5, 17,30,15, Adress.DOMESTIC);
        //Odd order
        Order order6 = new Order(29.5, 26,30,15, Adress.DOMESTIC);
        //Chain of responsibility
        AHandler orderHandler = new FrankierungsHandler(new SmallDomesticHandler(new LargeDomesticHandler(new EuropeanUnionHandler(new InternationalHandler(new ReturnHandler(null))))));
        orderHandler.isCorrectHandler(order1);
        orderHandler.isCorrectHandler(order2);
        orderHandler.isCorrectHandler(order3);
        orderHandler.isCorrectHandler(order4);
        orderHandler.isCorrectHandler(order5);
        //Odd test
        orderHandler.isCorrectHandler(order6);

    }
}