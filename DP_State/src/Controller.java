
public class Controller {
     private State m_state;

     public Controller() {
         m_state = null;
     }


    public void changeState(State s) {
        m_state = s;
    }

    public void run() {
         changeState(new Closed(this));
        m_state.open();
        m_state.close();
        m_state.lock();
        m_state.startUnlock();
        m_state.errorEntered();
        m_state.startUnlock();
        m_state.combinationEntered();
    }

}
