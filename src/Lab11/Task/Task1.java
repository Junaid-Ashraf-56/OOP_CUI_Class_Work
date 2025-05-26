package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.*;
import java.util.*;
class Book implements Serializable {
    private String name;
    private String publisher;
    private String author;

    public Book(String name, String publisher, String author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Book: " + name + ", Publisher: " + publisher + ", Author: " + getName();
    }

}

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", "O’Reilly", "John Doe"));
        books.add(new Book("Effective Java", "Pearson", "Joshua Bloch"));
        books.add(new Book("Clean Code", "Prentice Hall", "Robert C. Martin"));
        books.add(new Book("Head First Java", "O’Reilly", "Kathy Sierra"));
        books.add(new Book("Java Concurrency", "Addison-Wesley", "Brian Goetz"));

        // Write to file named BookStore
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BookStore"))) {
            for (Book book : books) {
                oos.writeObject(book);
            }
            System.out.println("Books successfully written to 'BookStore'.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

