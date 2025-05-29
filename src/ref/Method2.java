package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 =  createStudent("학생1", 15,90);
        Student student2 = createStudent("학생2",14,80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age , int grade){
        Student student = new Student(); // x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // x001 생성을, 원래 메인 메서드에서 객체 생성 해야하는데 메인에서 안했으니까 던져야됨!
    }

    static void printStudent(Student student){
        System.out.println("이름:" + student.name + "나이" + student.age + "성적" + student.grade);
    }
}


//createStudent는 생성한 Student 인스턴스의 참조값을 반환한다. 이렇게 반환된 참조값을
//student1 변수에 저장했다. 앞으로는 Student1을 통해 Student인스턴스 (학생1 , 나이 , 성적)를 사용 ㄱㄴ