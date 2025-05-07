package construct.ex;

public class Book {

    String title;
    String author;
    int page;


    Book(String title , String author, int page){
//        this(title ,author ,page); 자기자신 부르면 재귀 함수 호출 돼서 터짐
        this.title = title;
        this.author = author;
        this.page = page;
    }
    Book(String title , String author){
        this(title ,author ,0);
    }
    Book(){
        this("","",0);
    }

    void displayInfo(){
        System.out.println("제목 : " + title + "저자 " + author + "페이지 " + page);
    }

}
