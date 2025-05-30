package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 자기자신 생성
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}

class DefaultClass2{

}
// 이런식으로 pulbic class 는 파일명이랑 이름을 동일하게 해야하고
// public이 안붙은 class는 여러개 만들 수 있음