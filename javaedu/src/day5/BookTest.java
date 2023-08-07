package day5;

class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "혼자공부하는자바";
        this.author = "작자명";
        this.price = 10000;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getBookInfo() {
        return title + "\t\t" + author + "   " + price;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("혼자공부하는컴퓨터구조", "신용권", 30000);
        Book book3 = new Book("혼자공부하는C언어", "신용권", 25000);
        Book book4 = new Book("혼자공부하는SQL","신용권", 28000);
        Book book5 = new Book("혼자공부하는머신러닝", "신용권", 32000);
        Book book6 = new Book("혼자공부하는파이썬", "신용권", 32000);

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());
        System.out.println(book4.getBookInfo());
        System.out.println(book5.getBookInfo());
        System.out.println(book6.getBookInfo());
    }
}
