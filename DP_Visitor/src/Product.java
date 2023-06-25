public abstract class Product {
    private String name;
    private double kosten;
    public Product(String name, double kosten) {
        this.name = name;
        this.kosten = kosten;
    }

    public Product(String name) {
        this.name = name;
        this.kosten = 0;
    }
    public  abstract void accept(ProductVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public abstract String toString();
}
