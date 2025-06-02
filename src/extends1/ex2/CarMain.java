package extends1.ex2;


public class CarMain {
    public static void main(String[] args) {
        ElectircCar electircCar = new ElectircCar();
        electircCar.move();
        electircCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fullUp();
    }
}

// 단일 상속은 가능하지만
// 다중 상속(한개의 자식이 여러개의 부모를 물려 받는 것)은 가능하지 않음!

// 상속과 메모리 구조
// ElectircCar electircCar = new ElectircCar(); 이거를 실행 할때
// 외부에서 볼때는 하나의 인스턴스를 생성하는 것 같지만
// 내부에서는 부모와 자식이 모두 생성되고 공간도 분리 된다!

// 중요!
// 호출하는 변수의 타입(Electric Car)을 기준으로 순서를 선택한다!
// 자식 메서드를 봤더니 move()메서드가 없음 -> 자식 타입에서 해당 기능 없으면
// 부모 타입으로 올라가서 찾는다!

// 1) 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다
// 2) 상속관계의 객체를 호출 할떄 , 대상 타입을 정해야한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다.
// 3) 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.