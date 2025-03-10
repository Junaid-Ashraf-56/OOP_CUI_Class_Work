package OOP_CUI_Class_Work.src.Lab5.Task;

import java.util.Scanner;

// Address1 class
class Address1 {
    private String street;
    private String house;
    private String city;
    private String code;

    // Constructor
    public Address1(String street, String house, String city, String code) {
        this.street = street;
        this.house = house;
        this.city = city;
        this.code = code;
    }

    public Address1() {
        // Default constructor
    }

    // Getter and Setter Methods
    public String getStreet() { return street; }
    public String getHouse() { return house; }
    public String getCity() { return city; }
    public String getCode() { return code; }


    // Method to take user input for address
    public void setAddress(Scanner scanner) {
        System.out.print("Enter House Number: ");
        this.house = scanner.nextLine();
        System.out.print("Enter Street: ");
        this.street = scanner.nextLine();
        System.out.print("Enter City: ");
        this.city = scanner.nextLine();
        System.out.print("Enter Postal Code: ");
        this.code = scanner.nextLine();
    }

    // Display Method
    public void display() {
        System.out.println("Address: " + getCity() + ", " + getStreet() + ", " + getHouse() + " - " + getCode());
    }
}

// Person1 class
class Person1 {
    private String name;
    private Address1 address; // Composition: Person1 has an Address1

    public Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    // Getter and Setter Methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Address1 getAddress() { return address; }
    public void setAddress(Address1 address) { this.address = address; }

    // Display Method
    public void display() {
        System.out.println("Author Name: " + getName());
        address.display();
    }
}

// Book class
class Book {
    private String bookName;
    private String publisher;
    private Person1 author;  // Composition: Book has-a Person1 (Author)

    public Book(String bookName, String publisher, Person1 author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }

    // Getter and Setter Methods
    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Person1 getAuthor() { return author; }
    public void setAuthor(Person1 author) { this.author = author; }

    // Display Method
    public void display() {
        System.out.println("Book Name: " + getBookName());
        System.out.println("Publisher: " + getPublisher());
        author.display(); // Calls the display method of Person1
    }
}

// Test Class
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking initial address input
        System.out.println("Enter initial address:");
        Address1 initialAddress = new Address1();
        initialAddress.setAddress(scanner);

        // Creating a Person1 (Author) with the initial Address1
        Person1 author = new Person1("James Clear", initialAddress);

        // Creating a Book with an Author
        Book book = new Book("Atomic Habits", "Mark Manson", author);

        // Displaying Initial Details
        System.out.println("\nBefore modifying author address:");
        book.display();

        // Taking modified address input
        System.out.println("\nEnter modified address:");
        Address1 modifiedAddress = new Address1();
        modifiedAddress.setAddress(scanner);

        // Updating the Author's Address
        author.setAddress(modifiedAddress);

        // Displaying Updated Details
        System.out.println("\nAfter modifying author address:");
        book.display();

        scanner.close();
    }
}
