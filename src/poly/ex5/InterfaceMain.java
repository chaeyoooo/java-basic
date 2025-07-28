package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow caw = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

//왜 순수 추상 클래스를 안쓰고 인터페이스를 사용해야할까 ?
// 1) 인터페이스를 만드는 이유는 인터페이스의 메서드를 반드시 구현해라는 규약을 주는 것!
// -> 만약 순수 추상 클래스에서 누군가 메서드를 끼어 넣을 있게 되기에 순수 추상 클래스가 안됨
// 2) 다중 구현 가능 !
