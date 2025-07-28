package poly.ex5;

public interface InterfaceAnimal {
    void sound(); // public abstract 가 생략됨!
    void move(); // public abstract


    // 인터페이스는 거의 다른 곳에서 사용하는 목적으로 만들어지기에
    // public으로 한다 !
}

// 인터페이스는 "상속"이 목적이 아님 !

// 인터페이스의 멤버 변수
// -> public static final 이 생략 되어 있다고 본다
// -> int MY_PI = 3.14; 아렇게 쓴다!

