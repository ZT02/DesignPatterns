public class Main {
    public static void main(String[] args) {

        Sandwich lecker = new Bread(new Cheese(new Pickles(new SandwichImpl())));
        System.out.println(lecker.topping());
        System.out.println(lecker.getCost());
    }
}
























//https://www.youtube.com/watch?v=v6tpISNjHf8