package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    // 생성자 오버로딩
    MemberConstructor (String name, int age){
        this(name , age, 50); // 중복 제거를 위한 코드 ! 이게 밑에 코드로 넘어감!
        // 이  this는 생성자의 첫줄에만 써야함!
    }
    MemberConstructor(String name , int age, int grade){
        System.out.println("생성자 호출 name = " + name + ",age = "+ age + ",grade" + grade);
        this.name = name; // 여기 중복
        this.age = age; // 여기 중복
        this.grade = grade;
    }
    // 생성자는 메서드와 비슷하지만 차이가 있음.
    // 1) 생성자의 이름은 클래스 이름과 같아야한다. 따라서 첫 글자도 대문자로 시작한다.
    // 2) 생성자는 반환 타입이 없다. 비워둬야한다.
    // 3) 나머지는 메소드와 같다.
}
