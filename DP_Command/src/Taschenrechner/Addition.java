package Taschenrechner;

public class Addition implements Command{
    Taschenrechner tr;
    double operand;
    public Addition(Taschenrechner tr, double operand){
        this.tr = tr;
        this.operand = operand;
    }
    public void execute() {
        tr.addition(operand);
    }

    @Override
    public void undo() {
        tr.subtraction(tr.getResult()-operand);
    }


}
