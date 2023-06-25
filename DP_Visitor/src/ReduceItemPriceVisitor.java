public class ReduceItemPriceVisitor implements ProductVisitor{

    private double amount;

    public ReduceItemPriceVisitor(double amount) {
    this.amount = amount;
    }
/*
    @Override
    public void visitFreshVegetable(FreshVegetable fV) {
        System.out.println("Alter Preis: ");
        System.out.println(fV);
        if(fV.getKosten()-amount < 0)
            fV.setKosten(0);
        else
            fV.setKosten(fV.getKosten()-amount);
        System.out.println("Neuer Preis: ");
        System.out.println(fV);

    }

    @Override
    public void visitCannedItem(Item cI) {
        System.out.println("Alter Preis: ");
        System.out.println(cI);
        if(cI.getKosten()-amount < 0)
            cI.setKosten(0);
        else
            cI.setKosten(cI.getKosten()-amount);
        System.out.println("Neuer Preis: ");
        System.out.println(cI);
    } */

    @Override
    public void visitItem(Product i) {
        System.out.println("Alter Preis: ");
        System.out.println(i);
        if(i.getKosten()-amount < 0)
            i.setKosten(0);
        else
            i.setKosten(i.getKosten()-amount);
        System.out.println("Neuer Preis: ");
        System.out.println(i);
        System.out.println("----------------\n");
    }

    @Override
    public void visitPackage(Package p) {
        for(Product i : p.getProducts()) {
          visitItem(i);
        }
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
