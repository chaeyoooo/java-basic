package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectircCar electircCar = new ElectircCar();
        electircCar.move();
//        electircCar.charge();
//        electircCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
//        gasCar.fullUp();
//        gasCar.openDoor();
//
////        HydrogenCar hydrogenCar = new HydrogenCar();
////        hydrogenCar.move();
////        hydrogenCar.fillHydrogen();
////        hydrogenCar.openDoor();
//    }
    }
}
