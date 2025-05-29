package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // bigdata안에 data라는 변수타입에 data객체 집어넣은것임!
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //nullpointerexception
        System.out.println("bigData.data.value" + bigData.data.value);
    }
}
