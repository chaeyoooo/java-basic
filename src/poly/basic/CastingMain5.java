package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("------------1호출 ------------");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("------------2호출 ------------");
        call(parent2);
    }

    private  static void call(Parent parent){
        parent.parentMethod();

        if (parent instanceof Child child){
            System.out.println("child 인스턴스입니다");
//            Child child = (Child) parent;
            child.parentMethod();
        }else{
            System.out.println("child 인스턴스 아님");
        }
    }
}
