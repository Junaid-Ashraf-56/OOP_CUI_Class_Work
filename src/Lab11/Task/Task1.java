package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.*;
import java.util.*;

class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

class Book implements Serializable {
    private String name;
    private String publisher;
    private Person author;

    public Book(String name, String publisher, Person author) {
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
        // Create 5 book objects
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", "O’Reilly", new Person("John Doe")));
        books.add(new Book("Effective Java", "Pearson", new Person("Joshua Bloch")));
        books.add(new Book("Clean Code", "Prentice Hall", new Person("Robert C. Martin")));
        books.add(new Book("Head First Java", "O’Reilly", new Person("Kathy Sierra")));
        books.add(new Book("Java Concurrency", "Addison-Wesley", new Person("Brian Goetz")));

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

