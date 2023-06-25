package Taschenrechner;
import java.util.ArrayList;
import java.util.List;

public class UndoRedoManager {
    private List<Command> commandList = new ArrayList<>();
    private int currentIndex = -1;

    public void executeCommand(Command command) {
        command.execute();
        commandList.subList(currentIndex + 1, commandList.size()).clear();
        commandList.add(command);
        currentIndex++;
    }

    public void undo() {
        if (canUndo()) {
            commandList.get(currentIndex).undo();
            currentIndex--;
        }
    }

    public void redo() {
        if (canRedo()) {
            currentIndex++;
            commandList.get(currentIndex).execute();
        }
    }

    public boolean canUndo() {
        return currentIndex >= 0;
    }

    public boolean canRedo() {
        return currentIndex < commandList.size() - 1;
    }
}