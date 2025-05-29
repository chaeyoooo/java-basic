package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int studen1tAge = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int studen2tAge = 15;
        int student2Grade = 90;

        System.out.println("이름 " + student1Name + "나이" + studen1tAge + "성적" + student1Grade);
        System.out.println("이름 " + student2Name + "나이" + studen2tAge + "성적" + student2Grade);

        // 이렇게 하면 너무 많은 변수 만들거나 해야함 ..!
        // 그러면 for문으로 ? -> 하지만 변수 이름 다 다름
        // 배열로 풀어보자 !
        }
    }