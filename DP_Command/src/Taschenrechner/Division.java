package Taschenrechner;

public class Division implements Command{
    Taschenrechner tr;
    double operand;
    public Division(Taschenrechner tr, double operand){
        this.tr = tr;
        this.operand = operand;
    }
    public void execute() {
        tr.division(operand);
    }
    @Override
    public void undo() {
        tr.multiplication(operand);
    }
}
