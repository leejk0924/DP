package command.equipment;

public class LogitechKeyboardCommand implements Command {
    private LogitechKeyboard logitechKeyboard;
    @Override
    public void input() {
        System.out.println("노트북 키보드 클릭");
        logitechKeyboard.input();
    }

    public LogitechKeyboardCommand(LogitechKeyboard logitechKeyboard) {
        this.logitechKeyboard = logitechKeyboard;
    }
}
