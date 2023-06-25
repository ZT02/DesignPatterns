public class SandwichDecorator implements Sandwich {
    private Sandwich sandwich;
    public SandwichDecorator(Sandwich sw) {
        this.sandwich = sw;
    }

    @Override
    public String topping() {
        return sandwich.topping();
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }

    public String toString() {
        return topping() + "Price: " + getCost() + " €";
    }


}
