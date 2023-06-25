public class CheapestItemVisitor implements ProductVisitor {



    @Override
    public void visitItem(Product p) {
        System.out.println("Cheapest Product"+p + "\n");
        System.out.print(p);
    }

    @Override
    public void visitPackage(Package p) {
        double cheapestPrice = Double.POSITIVE_INFINITY;
        if(p.getProducts().size()==0) {
            System.out.println("Kein Item in der Liste\n");
            return;
        }
        Product product = null;
        for(Product i : p.getProducts())
            if(i.getKosten()<cheapestPrice) {
                cheapestPrice = i.getKosten();
                product = i;
            }

        System.out.println("Cheapest Product"+product);

    }
}
