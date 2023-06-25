public class Item extends Product{

    public Item(String name, double kosten) {
        super(name, kosten);

    }
    public  void accept(ProductVisitor visitor) {
        visitor.visitItem(this);
    }


    public String toString() {
        return "Name: "+getName() + "\nPreis: "+getKosten()+"\n";
    }
}
