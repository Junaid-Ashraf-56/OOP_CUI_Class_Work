package OOP_CUI_Class_Work.src.Lab11.Activity;

import java.io.*;

import static java.lang.System.out;

public class Activity2 {
    public void readFromFile()
    {
        try
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new
                    FileInputStream("filename"));
            while (true)
            {
                Person personRead = (Person) objectInputStream.readObject();
                out.println(personRead.name);
                out.println(personRead.age);
            }
        }
        catch (EOFException ex) { //This exception will be caught when EOF is
             System.out.println("End of file reached.");
        } catch (ClassNotFoundException ex) { ex.printStackTrace();
        } catch (FileNotFoundException ex) { ex.printStackTrace();
        } catch (IOException ex) { ex.printStackTrace();
        }
    }
}
