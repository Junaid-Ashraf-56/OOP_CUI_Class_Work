package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.*;

public class Task2 {
    public static void displayAllBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BookStore"))) {
            System.out.println("Books in BookStore:\n");

            while (true) {
                Book book = (Book) ois.readObject();
                System.out.println(book);
            }

        } catch (EOFException e) {
            // End of file reached — no problem
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        displayAllBooks();
    }
}
