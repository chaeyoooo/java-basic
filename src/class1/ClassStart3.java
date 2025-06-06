package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // student1을 담아둘 수 있는 변수
        student1 = new Student(); // student클래스에 있는 정보를 변수에 저장
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 " + student1.name + "나이" + student1.age + "성적" + student1.grade);
        System.out.println("이름 " + student2.name + "나이" + student2.age + "성적" + student2.grade);

        // 객체는 클래스에서 정의한 속성과 기능을 가진 실체
        // 예를 들어 student1과 student2는 같은 클래스에서 만들어졌지만 , 서로 다른 객체
        // 인스턴스는 특정 클래스로 부터 생성된 객체를 의미한다.(뉘앙스의 차이)
        // student1 객체는 Student클래스의 인스턴스다.(관계가 있을 때)
    }
}