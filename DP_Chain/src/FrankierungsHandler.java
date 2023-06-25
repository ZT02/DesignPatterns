public class FrankierungsHandler extends AHandler {
    public FrankierungsHandler(AHandler handler) {

        super(handler);
    }

    @Override
    public boolean isCorrectHandler(Order orderx) {

        String s = "";
        boolean output = false;
        //SmallDomestic
        if(orderx.isDomestic()  && orderx.getWeight()<=2 && orderx.getLength() <= 30 && orderx.getWidth() <=30 && orderx.getHeight() <= 15) {

            output = handler.isCorrectHandler(orderx);
            System.out.println(" frankiert mit 4 x 1€ 1 x 0.25€\n");
        }
        //LargeDomesticHandler
        else if(orderx.isDomestic()) {

            output = handler.isCorrectHandler(orderx);
            System.out.println(" frankiert mit 6 x 1€ 1 x 0.50€ 1 x 0.25€\n");
        }
        else if(orderx.isEuropeanUnion()) {

            output = handler.isCorrectHandler(orderx);
            System.out.println(" frankiert mit 10 x 1€ 1x 0.50€\n");
        }

        else if(orderx.isInternational()) {

            output = handler.isCorrectHandler(orderx);
            System.out.println(" frankiert mit 30 x 1€\n");
        }

        return output;
    }
}
