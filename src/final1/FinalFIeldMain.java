package final1;

public class FinalFIeldMain {
    public static void main(String[] args) {
        // 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructorInit constructorInit = new ConstructorInit(10);
        ConstructorInit constructorInit1 = new ConstructorInit(20);
        System.out.println(constructorInit1.value);
        System.out.println(constructorInit.value);

        //필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2= new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit1.value);

        // 안바뀌니까 메모리 낭비 문제 -> 따라서 상수로 써야겠다! 해서 static final 같이 쓰면 상수가 됨!
        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
