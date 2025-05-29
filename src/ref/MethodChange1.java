package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    static void changePrimitive(int x ){
        x = 20; // x에 a의 값을 전달 따라서 x = 20이면 a랑 x원래 10이었는데 x만 20으로 바뀐다!
        // a는 그대로 / x는 20 -> 10
    }
}
