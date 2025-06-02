package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this.value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
        //super는 부모 클래스에 대한 참조
    }
}
