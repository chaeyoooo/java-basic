package construct;

import java.lang.reflect.Member;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자이기에 바로 값을 넣어줘야함!
         MemberConstructor member1 = new MemberConstructor("user1",15,90);
         MemberConstructor member2 = new MemberConstructor("user2", 16 ,90);

         MemberConstructor[] alpha = {member1, member2};

        for (MemberConstructor a : alpha) {
            System.out.println("이름 " + a.name + "나이 :" + a.age + "성적" + a.grade);
        }
    }
}
