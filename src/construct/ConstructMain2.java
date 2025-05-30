package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // 생성하자마다 호출
        // 메서드는 2줄에 의해서 작성 하지만 생성자 1줄
        // 메서드는 name , age , grade 빠뜨려도 에러 x , but 생성자는 빠뜨리면 에러 0
        MemberConstructor member1 = new MemberConstructor("user1",15, 90);
        MemberConstructor member2 = new MemberConstructor("user2",16);

        MemberConstructor[] members = {member1 , member2};

        for (MemberConstructor m : members) {
            System.out.println("이름 : " + m.name + "나이" + m.age + "성적" + m.grade);
        }
    }
}
