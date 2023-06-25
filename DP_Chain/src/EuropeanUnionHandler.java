public class EuropeanUnionHandler extends AHandler {

    public EuropeanUnionHandler(AHandler handler) {

        super(handler);
    }
    @Override
    public boolean isCorrectHandler(Order orderx) {

        if(orderx.isEuropeanUnion()  && orderx.getWeight()<=10 && orderx.getLength() <= 80 && orderx.getWidth() <=60 && orderx.getHeight() <= 100 ) {
            System.out.println(orderx);
            System.out.print("\t handled by EuropeanUnionHandler");
            return true;
        }
        else
            return handler.isCorrectHandler(orderx);
    }
}
