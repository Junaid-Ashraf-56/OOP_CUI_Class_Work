package OOP_CUI_Class_Work.src.Lab11.Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Question1 {
    public static void main(String[] args) {

        String content = "My name is Junaid Ashraf";
        String fileName = "/home/junaidashraf/Documents/OOP-lab/OOP_CUI_Class_Work/src/Lab11/filname.txt";
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("File exist "+fileName);
        }
        else {
            try{
             if (file.createNewFile()){
                 System.out.println("File created "+fileName);
             }
             else {
                 System.out.println("Error ");
             }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
