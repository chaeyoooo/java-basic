package static2.ex;

public class Car {
    private static int totalCars;
    private String carname;

    public Car(String name){
        System.out.println("차량 , 구입 , 이름 :" + name);
        this.carname = name;
        totalCars++;
    }
    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
