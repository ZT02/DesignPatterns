public class AwaitingCombination extends State{

    private Controller controller;
    private static AwaitingCombination m_instance;

    private AwaitingCombination(Controller controller){
        this.controller = controller;
    }

    public static State enter(Controller c) {
        if(m_instance == null) {
            m_instance = new AwaitingCombination(c);
        }
        return m_instance;
    }


    public void combinationEntered() {
        System.out.println("Wechsel zu: Closed");
        controller.changeState(Closed.enter(controller));

    }
    public void errorEntered() {
        System.out.println("Wechsel zu: Locked");
        controller.changeState(Locked.enter(controller));
    }
    public String toString() {
        return "awaitingCombination";
    }
}
