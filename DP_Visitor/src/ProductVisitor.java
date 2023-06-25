public interface ProductVisitor {

    void visitItem(Product cI);

    void visitPackage(Package p);

}
