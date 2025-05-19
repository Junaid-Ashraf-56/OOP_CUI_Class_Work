package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.*;
import java.util.Scanner;

public class Task3 {

    public static void searchBookByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book to search: ");
        String searchName = scanner.nextLine().toLowerCase();

        boolean found = false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BookStore"))) {
            while (true) {
                Book book = (Book) ois.readObject();
                if (book.getName().toLowerCase().contains(searchName)) {
                    System.out.println("Book found:\n" + book);
                    found = true;
                    break; // Remove this if you want to find *all* matching books
                }
            }
        } catch (EOFException e) {
            // End of file
            if (!found) {
                System.out.println("Book not found.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        searchBookByName();
    }
}

