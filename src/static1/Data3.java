package static1;

public class Data3 {
    public String name; // 멤버 변수
    public static int count; // 멤버변수

    // 멤버 변수는 2가지 종류로 구분된다
    // 1) 인스턴스 변수
    // 2) 클래스 변수
    // -> 인스턴스 변수는 static이 붙지 않은 멤버 변수
    // -> 클래스 변수는 static이 붙은 멤버 변수

    public Data3(String name){
        this.name = name;
        count++;
    }
}
