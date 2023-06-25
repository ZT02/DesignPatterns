public class Meat extends SandwichDecorator {

    public Meat(Sandwich sandwich) {
        super(sandwich);
    }


    public double getCost() {
        return super.getCost() + getCostMeat();
    }

    private double getCostMeat() {
        return 0.60;
    }

    public String topping() {
        return super.topping() + toppingWithMeat();
    }
    private String toppingWithMeat() {
        return "with Meat ";
    }
}
