package FactoryMethod.pattern.os;

public class Linux implements OS{
    @Override
    public void install() {
        System.out.println("리눅스 설치");
    }

}
