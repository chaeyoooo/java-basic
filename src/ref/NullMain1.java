package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // data변수에는 가리키는 변수가 없다
        System.out.println("1.data = " + data);

        data = new Data();
        System.out.println("2. data = "+ data);

        data = null; // data인스턴스는 아무도 참조 하지 않기에 메모리만 차지 할 뿐 ->GC(가비지 컬렉션)으로 더이상 사용하지 않은 인스턴스를 메모리에서 제거
        System.out.println("3. data = " + data);
    }
}
