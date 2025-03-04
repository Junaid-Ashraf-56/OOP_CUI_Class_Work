package OOP_CUI_Class_Work.src.Lab3;

import java.time.Year;

class Book {
    private final String title;
    private final String author;
    private final double price;
    private final Year publicationYear;

    public Book() {
        this("Unknown", "Unknown", 0.0, Year.now().getValue());
    }

    public Book(String title, String author) {
        this(title, author, 0.0, Year.now().getValue());
    }

    public Book(String title, String author, double price) {
        this(title, author, price, Year.now().getValue());
    }

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = Year.of(year);
    }

    public void display() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price + "  Year: " + publicationYear);
    }
}

public class Assign2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        Book b2 = new Book("Atomic Habits", "James Clear");
        b2.display();
        Book b3 = new Book("Hyper Focus", "Chris Bailey", 500);
        b3.display();
        Book b4 = new Book("North", "Brad Kessler", 500, 2008);
        b4.display();
    }
}
