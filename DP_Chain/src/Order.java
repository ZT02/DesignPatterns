public class Order {
    private double weight;
    private Adress adress;

    private int length;
    private int width;
    private int height;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Order(double weight, int length, int width, int height , Adress adress) {

        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.adress = adress;
    }
    public double getWeight() {
        return weight;
    }

    public Adress getAdress() {
        return adress;
    }
    public boolean isDomestic() {
        return this.adress == adress.DOMESTIC;
    }
    public boolean isInternational() {
        return this.adress == adress.INTERNATIONAL;
    }
    public boolean isEuropeanUnion() {
        return this.adress == adress.EUROPEAN_UNION;
    }

    public  String toString() {

        return "Order " +"[Weight="+ getWeight()+ " kg, " + "L=" + getLength() +" cm, " + "W="+getWidth() +" cm, " + "H="+getHeight() + ", " + getAdress()+"]";
    }
}
