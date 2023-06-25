public class InternationalHandler extends AHandler{


    public InternationalHandler(AHandler handler) {
        super(handler);
    }
    @Override
    public boolean isCorrectHandler(Order orderx) {

        if(orderx.isInternational()  && orderx.getWeight()<=70  && orderx.getLength() <= 150 && orderx.getWidth() <=60 && orderx.getHeight() <= 70 ) {
            System.out.println(orderx);
            System.out.print("\t handled by InternationalHandler");
            return true;
        }
        else
            return handler.isCorrectHandler(orderx);

    }
}
