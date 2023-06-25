package Taschenrechner;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Taschenrechner extends Observable {
	private Command currentCommand;
	private List<Command> commandList = new ArrayList<>();
	private int currentIndex = -1;

	double result;

	public Taschenrechner() {

	}
	

	
	public void setResult(double operand) {
		this.result = operand;
		this.setChanged();
		this.notifyObservers();
		
	}
	public double getResult() { return result; }


	public void setCommand(Command command) {

		this.currentCommand = command;
	}

	public void execute() {

		if (currentCommand != null) {

			currentCommand.execute();
			commandList.subList(currentIndex + 1, commandList.size()).clear();
			commandList.add(currentCommand);
			currentIndex++;
		}
		this.setChanged();
		this.notifyObservers();
	}


	public void addition(double operand) {
		result+=operand;

	}
	public void subtraction(double operand) {
		result = operand - result;

	}
	public void division(double operand) {
		if (operand != 0) {
			result =  operand / result;

		}
	}

	public void multiplication(double operand) {
		if (operand != 0) {
			result *= operand;

		}
	}

	public void undo() {
		if (canUndo()) {
			commandList.get(currentIndex).undo();
			currentIndex--;
			this.setChanged();
			this.notifyObservers();
		}
	}

	public void redo() {
		if (canRedo()) {
			currentIndex++;
			commandList.get(currentIndex).execute();
			this.setChanged();
			this.notifyObservers();
		}
	}

	public boolean canUndo() {
		return currentIndex >= 0;
	}

	public boolean canRedo() {
		return currentIndex < commandList.size() - 1;
	}

}
