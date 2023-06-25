public class Closed extends State{

    private Controller controller;
    private static Closed m_instance;

    Closed(Controller controller){
        this.controller = controller;
    }

    public static State enter(Controller c) {
        if(m_instance == null)
            m_instance = new Closed(c);

        return m_instance;
    }


    public void lock(){
        System.out.println("Wechsel zu: Locked");
        controller.changeState(Locked.enter(controller));
    }
    public void open(){
        System.out.println("Wechsel zu: Open");
        controller.changeState(Opened.enter(controller));
    }

    public String toString() {
        return "closed";
    }

}
