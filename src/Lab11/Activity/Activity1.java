package OOP_CUI_Class_Work.src.Lab11.Activity;

import java.io.*;
class Person implements Serializable
{
    public String name = null;
    public int age = 0;
    public void setAge(int a) { age = a ;}
    public String getName() {return name ;}
}

public class Activity1{
    public void writeToFile() {
        try
        {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("filename"));
            Person p = new Person();
            p.name = "Jakob Jenkov"; p.age = 40;
            objectOutputStream.writeObject(p);
        }
        catch (FileNotFoundException ex)
        { ex.printStackTrace();
        }
        catch (IOException ex)
        { ex.printStackTrace();
        }
    }
}
