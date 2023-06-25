import java.util.LinkedList;

public class Package extends Product{

    private LinkedList<Product> products;

    public Package(String name) {
        super(name);
        products = new LinkedList<>();
        this.setKosten(0);
    }
    public Package(String name, LinkedList<Product> products) {
        super(name);
        this.products = products;
        this.calculateCost();
    }

    public void accept(ProductVisitor visitor) {
        visitor.visitPackage(this);
        this.calculateCost();
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
        this.calculateCost();
    }
    public void addProduct(Product p) {
        products.add(p);
        this.calculateCost();
    }

    void calculateCost() {
        double summary = 0;
        for(Product i : products)
            summary+=i.getKosten();
        this.setKosten(summary);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Package Inhalt:\n\n");
        for(Product p : products) {

            s.append(p);
            s.append("\n");
        }
        s.append("Gesamtkosten: "+this.getKosten());
        s.append("\n----------------");
        return s.toString();
    }


}
