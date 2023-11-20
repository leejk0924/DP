package abstract_factory;

import abstract_factory.app.Application;
import abstract_factory.factories.GUIFactory;
import abstract_factory.factories.MacOSFactory;
import abstract_factory.factories.WindowsFactory;

/**
 * 팩토리 메서드 : 조건에 따른 객체 생성을 팩토리 클래스로 위임, 팩토리 클래스에서 객체를 생성하는 패턴
 * 추상 팩토리 패턴 : 서로 관련이 있는 객체들을 통쨰로 묶어서 팩토리 클래스로 만들고, 조건에 따라 생성하도록 다시 팩토리를 만들어서 객체를 생성하는 패턴
 *
 * 팩토리 메서드의 문제 : 구성품이 늘어날 수록 객체를 생성하는 부분이 계속해서 길어진다.
 */
public class Practice {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac"))
            factory = new MacOSFactory();
        else
            factory = new WindowsFactory();
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
// 추상 팩토리 패턴은 팩토리 패턴의 조건문으로부터 벗어날 수 있다.
