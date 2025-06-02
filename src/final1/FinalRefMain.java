package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = newData(); 이미 값 할당 됐기에 컴파일 오류

        data.value = 10; // 참조 대상의 객체의 값은 변경 가능
        // final 데이터(data)를 못 바꾸는 거지 ! 객체의 값(value)은 ㄱㄴ
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);
    }
}
