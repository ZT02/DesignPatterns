public class Locked extends State{

    private Controller controller;
    private static Locked m_instance;

    Locked(Controller controller){
        this.controller = controller;
    }

    public static State enter(Controller c) {
        if(m_instance == null) {
            m_instance = new Locked(c);
        }
        return m_instance;
    }

    public void startUnlock() {
        System.out.println("Wechsel zu: startUnlock");
        controller.changeState(AwaitingCombination.enter(controller));
    }

    public String toString() {
        return "locked";
    }
}
