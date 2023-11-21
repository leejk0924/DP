package builder;

import builder.computer.Computer;

/**
 * 빌더 패턴 : 객체를 생성하는 클래스와 표현하는 클래스로 분리
 * 빌더 패턴 장점
 * 1) 필요한 데이터만 설정할 수 있어 유연성을 확보할 수 있고, 변경 가능성을 최소화 할 수 있음
 */
public class Practice {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "8GB").build();
        Computer computer2 = new Computer.ComputerBuilder("1TB", "32GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println("computer spec = " + computer);
        System.out.println("computer2 = " + computer2);
    }
}
