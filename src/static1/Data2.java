package static1;

public class Data2 {
    public String name;

    public Data2(String name , Counter counter){
        // counter counter 객체를 만들어서 공유하게 만듦
        this.name = name;
        counter.count++;
    }
}
