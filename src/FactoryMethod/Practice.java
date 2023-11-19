package FactoryMethod;

import FactoryMethod.pattern.Laptop;
import FactoryMethod.pattern.LinuxUserLaptop;
import FactoryMethod.pattern.WindowUserLaptop;
import FactoryMethod.pattern.os.OS;

/**
 * [생성 패턴]
 * 객체 생성을 Factory 클래스로 캡슐화 처리하여 대신 생성하는 생성 디자인 패턴
 * 객체를 생성할 때 어떤 클래스의 인스턴스를 만들 지 서브 클래스에서 결정 (인스턴스 생성을 서브클래스에게 위임)
 */
public class Practice {
    private static Laptop laptop;

    public static void main(String[] args) {
        Laptop laptop = new WindowUserLaptop();
        OS os = laptop.installedOS();
        os.install();

        Laptop laptop2 = new LinuxUserLaptop();
        OS os1 = laptop2.installedOS();
        os1.install();

    }
}

/**
 * 사용 시기
 * 1. 클래스 생성과 사용의 처리 로직을 분리하여 결합도 낮추고자할 때
 *
 * ## 장점
 *
 * ## 단점
 *
 *
 * ## Reference
 * https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%ED%8C%A9%ED%86%A0%EB%A6%AC-%EB%A9%94%EC%84%9C%EB%93%9CFactory-Method-%ED%8C%A8%ED%84%B4-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EB%B0%B0%EC%9B%8C%EB%B3%B4%EC%9E%90
 */