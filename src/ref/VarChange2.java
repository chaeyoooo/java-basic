package ref;

import java.sql.SQLOutput;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA); // x001
        System.out.println("dataB 참조값 = " + dataB); // x001
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        dataA.value = 20;
        System.out.println("변경 dataA.");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20


        //dataB변경
        dataB.value = 30;
        System.out.println("변경 dataA.");
        System.out.println("dataA.value = " + dataA.value); //30
        System.out.println("dataB.value = " + dataB.value); //30
    }
}
