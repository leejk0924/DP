package command;

import command.equipment.*;

import java.security.Key;

/**
 * 객체의 메서드를 클래스로 만들어 캡슐화 하는 패턴
 * Command
 */
public class Practice {
    public static void main(String[] args) {
        LaptopKeyboard laptopKeyboard = new LaptopKeyboard();
        Command laptopKeyboardCommand = new LaptopKeyboardCommand(laptopKeyboard);

        LogitechKeyboard logitechKeyboard = new LogitechKeyboard();
        LogitechKeyboardCommand logitechKeyboardCommand = new LogitechKeyboardCommand(logitechKeyboard);

        Keyboard keyboard1 = new Keyboard(logitechKeyboardCommand);
        keyboard1.pres();

        Keyboard keyboard2 = new Keyboard(logitechKeyboardCommand);
        keyboard2.pres();
        keyboard2.setCommand(laptopKeyboardCommand);
        keyboard2.pres();
    }
}
