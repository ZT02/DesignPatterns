public class Avocado extends SandwichDecorator {

    public Avocado(Sandwich sandwich) {
        super(sandwich);
    }

    public double getCost() {
        return super.getCost() + getCostAvocado();
    }

    private double getCostAvocado() {
        return 1.0;
    }

    public String topping() {
        return super.topping() + toppingWithAvocado();
    }
    private String toppingWithAvocado() {
        return "with Avocado ";
    }
}
