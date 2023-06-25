public class LargeDomesticHandler extends AHandler{

    public LargeDomesticHandler(AHandler handler) {

        super(handler);
    }
    @Override
    public boolean isCorrectHandler(Order orderx) {

        if(orderx.isDomestic()  && orderx.getWeight()<=5 && orderx.getLength() <= 60 && orderx.getWidth() <=30 && orderx.getHeight() <= 15) {
            System.out.println(orderx);
            System.out.print("\t handled by LargeDomesticHandler");
            return true;
        }
        else
            return handler.isCorrectHandler(orderx);

    }
}
