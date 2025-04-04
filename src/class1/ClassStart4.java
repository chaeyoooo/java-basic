package class1;

public class ClassStart4 {
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

        Student[] students = new Student[2]; // student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
        students[0] = student1;
        students[1] = student2;
        //객체 값 사용
        System.out.println("이름 : " + students[0].name + " 나이" + students[0].age + " 성적 " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이" + students[1].age + " 성적 " + students[1].grade);
    }
}
