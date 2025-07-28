package poly.ex4;

public abstract class AbstractAnimal {
// 추상 메서드가 하나라도 있으면 클래스도 abstract 붙여야함
    public abstract  void sound();
    public abstract void move();
}
// 순수 추상 클래스
// 1) 인스턴스를 생성할 수 없다.
// 2) 상속시 자식은 모든 메서드를 오버라이딩 해야한다.
// 3) 주로 다형성을 위해 사용된다.
// -> 순수 추상 클래스는 마치 어떤 규격을 지켜서 구현 하는 것 처럼 !
// -> 따라서 인터페이스(ex. USB 인터페이스)와 같이 느껴잠


// 이러한 순수 추상 클래스의 개념은 프로그래밍에서 매우 자주 사용
// -> 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스 개념 제공
