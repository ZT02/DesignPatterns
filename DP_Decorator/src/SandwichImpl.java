public class SandwichImpl implements Sandwich {


    @Override
    public String topping() {
        return "Bread ";
    }
    @Override
    public double getCost() {
        return 0.50;
    }
}
