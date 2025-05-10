package static2;



public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("인스턴스 호출");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        DecoData.staticCall(decoData);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
