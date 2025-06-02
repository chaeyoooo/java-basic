package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        super(10,20); // B는 생성자 2개 있으니까 super 써줘야함
        System.out.println("ClassC 생성자");
    }
}
