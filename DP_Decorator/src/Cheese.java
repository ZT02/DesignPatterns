public class Cheese extends SandwichDecorator {

    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    public double getCost() {
        return super.getCost() + getCostCheese();
    }

    private double getCostCheese() {
        return 0.50;
    }

    public String topping() {
        return super.topping() + toppingWithCheese();
    }
    private String toppingWithCheese() {
        return "with Cheese ";
    }
}
