package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        InitMember(member1,"users1",15,90);
        MemberInit member2 = new MemberInit();
        InitMember(member2,"users2",16,80);


        MemberInit[] members = {member1 , member2};

        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + "나이" + m.age + "성적" + m.grade);
        }
    }
    static void InitMember(MemberInit member , String name , int age , int grade){
        member.name = name;
        member.age = age;
        member.grade =  grade;
    }

    // 객체 지향에서 학습한 것 처럼 속성과 기능을 한 곳에 두는 것이 나은 방법
    // MemberInit이 자기 자신의 데이터를 변경하는 기능을 제공하는게 좋다
}
