package FactoryMethod.pattern.os;

public class Windows implements OS {
    @Override
    public void install() {
        System.out.println("윈도우 설치");
    }
}
