import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Package paket = new Package("Einkauf");

        FreshVegetable one = new FreshVegetable("Soja Bohnen", 10);
        CannedItem two = new CannedItem("Thunfisch", 20);
        CannedItem three = new CannedItem("Brot", 5);
        CannedItem four = new CannedItem("Brot", 6);



        paket.addProduct(one);
        paket.addProduct(two);
        paket.addProduct(three);
        paket.addProduct(four);


        ReduceItemPriceVisitor reduceVisitor = new ReduceItemPriceVisitor(2);
        CheapestItemVisitor cheapVisitor = new CheapestItemVisitor();

        System.out.println(paket);
        paket.accept(cheapVisitor);
        paket.accept(reduceVisitor);

    }
}