package poly.ex5;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 이동");
    }


    // 상속
    // 이름 그대로 부모의 기능을 물려 받는 것이 목적

    // 인터페이스는 모든 메서드가 추상 메서드
    // 물려 받는 기능 x , 오히려 인터페이스에 정의한 모든 메서드를 자식이 오버라이딩해서 기능 구현


    // 왜 순수 추상 클래스가 아니고 인터페이스 ?
    // 1. 제약 : 순수 추상 클래스는 미래에 누군가 실행가능한 ( 추상 메서드 x ) 메서드를 끼워 넣을 수 있다.
    // 2. 다중 구현 : 자바에서 클래스 상속은 부모를 하나만 지정 , but 인터페이스는 -> 부모를 여러명 두는 다중 구현

    // 인터페이스
    // default 메서드, private메서드는 예외적으로 특별한 경우에만 사용 해야 ..!
}
