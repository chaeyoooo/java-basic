package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,80);
        Student student2 = new Student();
        initStudent(student2,"학생2", 12,90);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student a, String name, int age , int grade){
        a.name = name; // student1(x001) 이 a로 넘어감!
        a.age = age;
        a.grade = grade;
    }
    static void printStudent(Student student){
        System.out.println("이름" + student.name + "나이" + student.age + "성적:" + student.grade);
    }
}
