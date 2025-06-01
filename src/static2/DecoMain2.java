package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 클래스에 직접 접근

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
    // 이렇게 클래스를 통해서 접근 할 수 있으면 ?
    // 그냥 객체를 안만들어도 되지 않냐 ? 라는 의문
    // but staic메서드는 static만 사용할 수 있다.
    // -> 클래스 내부의 기능을 사용할 때 , 정적(static)메서드는 static이 붙은 정적 메서드나 정적 변수에만 사용할 수 있다.
    // -> 클래스 내부의 기능을 사용할 떄 , 정적(static)메서드는 인스턴스 변수나 , 인스턴스 메서드를 사용할 수 없다.
    // 반대로 모든 곳에서 static을 호출 할 수 있다.
}
