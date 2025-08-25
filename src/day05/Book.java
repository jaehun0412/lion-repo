package day05;

public class Book {

    String title;
    String author;
    int price;

    // 생성자가 한 번도 정의 된 적이 없다면, 컴파일러가 자동으로 디폴트생성자를 생성
    public Book() {
        this("java", "KIM", 30000);
        System.out.println("Book() 생성!!");
//        title = "java";
//        author = "KIM";
//        price = 30000;
    } // 메서드와 흡사하지만, 리턴 타입이 없고, 메서드명이 클래스명과 동일하다.

    public Book(String title) {
//        this.title = title;
        this(title, "", 0);
        System.out.println("Book(title) 생성!");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Book(title, author) 생성!");
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Book(title, author, price) 생성!");
    }

    public static void main(String[] args) {
        Book book = new Book("java"); // () - 생성자
//        book.title = "java";

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);

        Book book1 = new Book();
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);

        // 생성자는 객체가 생성될 때 딱 한 번만 호출된다 - 임의로 호출이 불가능하다.

        Book book2 = new Book("spring", "carami", 50000);
    }
}
