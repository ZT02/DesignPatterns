public class Opened extends State {

    private Controller controller;
    private static State m_instance;

    private Opened(Controller controller){
        this.controller = controller;
    }
    public static State enter(Controller c) {
        if(m_instance == null) {
            m_instance = new Opened(c);
        }
        return m_instance;
    }


    public void close() {
        System.out.println("Wechsel zu: Closed");
        controller.changeState(Closed.enter(controller));
    }

    public String toString() {
        return "opened";
    }
}
