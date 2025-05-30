package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name , int age, int grade){
        System.out.println("생성자 호출 name = " + name + ",age = "+ age + ",grade" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // 생성자는 메서드와 비슷하지만 차이가 있음.
    // 1) 생성자의 이름은 클래스 이름과 같아야한다. 따라서 첫 글자도 대문자로 시작한다.
    // 2) 생성자는 반환 타입이 없다. 비워둬야한다.
    // 3) 나머지는 메소드와 같다.
}
