package OOP_CUI_Class_Work.src.Lab11;

import java.io.*;

class Person {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonDataCheck {
    public static void main(String[] args) {
        String filePath = "/home/junaidashraf/Documents/OOP-lab/OOP_CUI_Class_Work/src/Lab11/persondata.txt";

        // Save object as plain text
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            Person p = new Person();
            p.name = "Jakob Jenkov";
            p.age = 40;
            bw.write("Name: " + p.name + ", Age: " + p.age);
            bw.close();
            System.out.println("✅ Human-readable object data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read object data from plain text
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("📄 Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}