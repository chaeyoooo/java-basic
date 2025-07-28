package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }

    // 만약 오버라이드를 안하면
    // 부모 클래스(= 추상 클래스) 메서드로 호출
    // 따라서 이는 실행 안됨(컴파일 오류 발생)
}
