package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조( 다형적 참조 )
        Parent poly = new Child(); // x001이 현재 poly
        // 자식의 기능은 호출 할 수 x -> 컴파일 오류 발생
        //poly.childMethod();

        // 다운 캐스팅 ( 부모 타입  -> 자식 타입 )
//        Child child = poly; // x001을 child에 근데 자식은 부모를 품을 수 X , 컴파일 오류
        Child child = (Child)poly; // ()넣고 개발자가 책임질게 ! 근데 poly의 타입이 변하는 건 아님 , 참조값을 복사해서 child타입이 되는 것
        child.childMethod();
    }
}
