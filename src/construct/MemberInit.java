package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // InnitMember 메소드 기능을 추가하면 MemberInnit에 한번에 모아볼 수 있다.
    void InitMember( String name , int age , int grade){
        this.name = name; // this를 쓰면 인스턴스를 가져옴
        this.age = age;
        this.grade =  grade;
    }
}
