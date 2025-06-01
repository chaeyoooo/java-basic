package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        // static은 class에 바로 직접 접근한다! 따라서 data1.count가 아니라 Data3.count!
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);


        //인스턴스를 통한 접근 해도 ㄱㄴ 하지만
        // 이는 클래스접근인데 하고 클래스 접근으로 다시 바뀌는 것
        Data3 data4 = new Data3("D");
//      System.out.println(data4.count); 클래스 접근으로 하는게 좋음!

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
