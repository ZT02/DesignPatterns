public class Pickles extends SandwichDecorator {

    public Pickles(Sandwich sandwich) {
        super(sandwich);
    }

    public double getCost() {
        return super.getCost() + getCostPickles();
    }

    private double getCostPickles() {
        return 0.10;
    }

    public String topping() {
        return super.topping() + toppingWithPickles();
    }
    private String toppingWithPickles() {
        return "with Pickles ";
    }
}
