package static1;

import java.sql.SQLOutput;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count " + data2.count);

        Data1 data3 = new Data1("B");
        System.out.println("C count " + data3.count);
    }

    // 지금 Data1에 count값이랑 인스턴스 값은 새로 만들어지기 떄문에
    // 누적이 아니라 1로 나오는 것임
}
