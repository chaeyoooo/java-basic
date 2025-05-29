package oop1;

public class ValueData {
    int value;

    void add(){
            value++;
            System.out.println("숫자 증가 value" + value);
    }

    // 클래스는 속성( 데이터 , 멤버변수 )와 기능 ( 메서드 ) 를 정의할 수 있다.
    // 객체는 자신의 메서드(add)를 통해 자신의 멤버 변수(value)에 접근할 수 있다.
}
