package OOP_CUI_Class_Work.src.Lab10.Task;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() +
                "\nPhone: " + getPhoneNumber() +
                "\nEmail: " + getEmail();
    }

    public boolean matches(String keyword) {
        keyword = keyword.toLowerCase();
        return firstName.toLowerCase().contains(keyword) ||
                lastName.toLowerCase().contains(keyword) ||
                phoneNumber.toLowerCase().contains(keyword) ||
                email.toLowerCase().contains(keyword);
    }
}

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Contact Manager =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search and Display Contact");
            System.out.println("4. Search and Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    contacts.add(new Contact(firstName, lastName, phone, email));
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.println("\n--- All Contacts ---");
                    for (Contact c : contacts) {
                        System.out.println(c + "\n------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String searchKeyword = scanner.nextLine();
                    boolean found = false;
                    for (Contact c : contacts) {
                        if (c.matches(searchKeyword)) {
                            System.out.println("\nMatch found:\n" + c + "\n------------------");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No matching contact found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter keyword to search for deletion: ");
                    String deleteKeyword = scanner.nextLine();
                    ArrayList<Contact> toDelete = new ArrayList<>();
                    for (Contact c : contacts) {
                        if (c.matches(deleteKeyword)) {
                            System.out.println("\nMatch found:\n" + c);
                            System.out.print("Do you want to delete this contact? (yes/no): ");
                            String confirm = scanner.nextLine();
                            if (confirm.equalsIgnoreCase("yes")) {
                                toDelete.add(c);
                            }
                        }
                    }
                    contacts.removeAll(toDelete);
                    System.out.println(toDelete.size() + " contact(s) deleted.");
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
