package command.equipment;

public class Keyboard {
    private Command command;

    public Keyboard(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pres() {
        command.input();

    }
}
