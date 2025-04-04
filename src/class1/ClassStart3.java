package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // int > 정수 타입 , string > 문자 타입 그러면 student 라는 타입 만들면 되지 않을까 ?
        Student student1 = new Student(); // 학생을 실제 메모리에 적재 , 이게 객체(= 인스턴스) student student1은 student는 student의 객체를 받을 수 있는것
        student1.name = "학생1"; //객체에 접근!
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();// 학생을 실제 메모리에 적재 , 이게 객체(= 인스턴스)
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 80;

        //객체 값 사용
        System.out.println("이름 : " + student1.name + " 나이" + student1.age + " 성적 " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이" + student2.age + " 성적 " + student2.grade);
    }
}
