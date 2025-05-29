package class1;

public class ClassStart5 {
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

        Student[] students = new Student[] {student1, student2};

        for (Student student : students) {
            System.out.println("이름 : " + student.name + " 나이" + student.age + " 성적 " + student.grade);
        }

    }
}

