public class Bread extends SandwichDecorator {


    public Bread(Sandwich sandwich) {
        super(sandwich);
    }

    public double getCost() {
        return super.getCost() + getCostBread();
    }

    private double getCostBread() {
        return 0.50;
    }

    public String topping() {
        return super.topping() + toppingWithBread();
    }
    private String toppingWithBread() {
        return "with Bread ";
    }
}
