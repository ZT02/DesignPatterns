public abstract class AHandler {
    public AHandler handler;
    public AHandler(AHandler handler) {
        this.handler = handler;
    }
    public abstract boolean isCorrectHandler(Order orderx);
}
