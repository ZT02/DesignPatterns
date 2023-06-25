package Taschenrechner;

public class Multiplication implements Command{
    Taschenrechner tr;
    double operand;
    public Multiplication(Taschenrechner tr, double operand){
        this.tr = tr;
        this.operand = operand;
    }
    public void execute() {
        tr.multiplication(operand);
    }
    //Bei allen Undo Methoden gibt es probleme!
    @Override
    public void undo() {
        tr.division(operand);
    }
}
