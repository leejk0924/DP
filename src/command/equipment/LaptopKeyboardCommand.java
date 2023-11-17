package command.equipment;

public class LaptopKeyboardCommand implements Command{
    private LaptopKeyboard laptopKeyboard;
    @Override
    public void input() {
        System.out.println("노트북 키보드 클릭");
        laptopKeyboard.input();
    }

    public LaptopKeyboardCommand(LaptopKeyboard laptopKeyboard) {
        this.laptopKeyboard = laptopKeyboard;
    }
}
