package OOP_CUI_Class_Work.src.Lab11;

import java.io.*;

// Define the SomeClass class that implements Serializable so it can be written to/read from a file
class SomeClass implements Serializable {
    private int number;
    private char character;

    // Constructor
    public SomeClass(int number, char character) {
        this.number = number;
        this.character = character;
    }

    // toString() method for displaying object content
    public String toString() {
        return "Number: " + number + ", Character: " + character;
    }
}

// Main class
public class ObjectIODemo {
    public static void main(String[] args) {
        try {
            // Create an ObjectOutputStream to write objects to a file named "datafile"
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("datafile"));

            // Create two SomeClass objects
            SomeClass oneObject = new SomeClass(1, 'A');
            SomeClass anotherObject = new SomeClass(42, 'Z');

            // Write the objects to the file
            outputStream.writeObject(oneObject);
            outputStream.writeObject(anotherObject);

            // Close the output stream after writing
            outputStream.close();

            // Confirmation message
            System.out.println("Data sent to file.");
        }
        // Catch any IOException (e.g., issues writing to the file)
        catch (IOException e) {
            System.out.println("Problem with file output.");
        }

        // Inform the user that file reading is about to begin
        System.out.println("Now let's reopen the file and display the data.");

        try {
            // Create an ObjectInputStream to read objects from the file "datafile"
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("datafile"));

            // Read objects and cast them back to SomeClass
            SomeClass readOne = (SomeClass) inputStream.readObject();
            SomeClass readTwo = (SomeClass) inputStream.readObject();

            // Display the objects that were read
            System.out.println("The following were read from the file:");
            System.out.println(readOne);
            System.out.println(readTwo);

            // Close the input stream
            inputStream.close();
        }
        // Catch if the file was not found
        catch (FileNotFoundException e) {
            System.out.println("Cannot find datafile.");
        }
        // Catch if the class of the serialized object is not found
        catch (ClassNotFoundException e) {
            System.out.println("Problems with file input.");
        }
        // Catch any other I/O errors during input
        catch (IOException e) {
            System.out.println("Problems with file input.");
        }

        // Final message
        System.out.println("End of program.");
    }
}
