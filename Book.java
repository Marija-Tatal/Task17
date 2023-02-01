package Task17;

public class Book {
    String name;
    String author;
    int year;


    Book(String bookName, String bookAuthor,int bookYear){
        name=bookName;
        author=bookAuthor;
        year= bookYear;
    }
    void print(){
        System.out.println("Name of the book "+name+" Author of the book "+author+" Publication year "+year);
    }
}
