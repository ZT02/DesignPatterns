public class ReturnHandler extends AHandler{

    public ReturnHandler(AHandler handler) {

        super(handler);
    }

    @Override
    public boolean isCorrectHandler(Order orderx) {

        System.out.println("\nZurueck zu Absender:");
        System.out.println("\t"+orderx);
        System.out.print("\thandled by ReturnHandler");
            return true;
    }
}
