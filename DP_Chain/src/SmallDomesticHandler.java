public class SmallDomesticHandler extends AHandler{
    public SmallDomesticHandler(AHandler handler) {

        super(handler);
    }
    @Override
    public boolean isCorrectHandler(Order orderx) {

        if(orderx.isDomestic()  && orderx.getWeight()<=2 && orderx.getLength() <= 30 && orderx.getWidth() <=30 && orderx.getHeight() <= 15) {
            System.out.println(orderx);
            System.out.print("\t handled by SmallDomesticHandler");
            return true;
        }
        else
            return handler.isCorrectHandler(orderx);
    }

}
