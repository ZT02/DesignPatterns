package Taschenrechner;

public class Subtraction implements Command{
    Taschenrechner tr;
    double operand;
    public Subtraction(Taschenrechner tr, double operand){
        this.tr = tr;
        this.operand = operand;
    }
    public void execute() {
        tr.subtraction(operand);
    }
    @Override
    public void undo() {
        tr.addition(tr.result-operand);
    }
}
