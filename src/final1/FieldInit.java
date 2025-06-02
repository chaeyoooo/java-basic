package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // 바뀌지 않는 공유변수
    final int value = 10;

//    public FieldInit(int value){
//        this.value = value; 값이 이미 생성 돼서 안됨
//    }

    // constructorinit.java에 보면 알 수 있음
    // 이미 초기값을 설정했으면 생성자에도 못바꿈 !
    // 초기값이 없으면 가능하지만 초기값 설정했으면 안됨!
}
