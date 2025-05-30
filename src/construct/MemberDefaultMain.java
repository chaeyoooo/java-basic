package construct;

public class MemberDefaultMain {
    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();
    }

    // 왜 자바가 기본 생성자가 만들어줘 ?
    // 생성자가 필요하지 않은 경우에도 모든 클래스에 갭라자가 직접 기본 생성자를 정의 해야하기에

    // 생성자는 반드시 호출되어야한다
    // 생성자가 없으면 기본 생성자가 제공된다
    // 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다. 이 경우 개발자가 정의한 생성자를 직접 호출해야한다.
}
