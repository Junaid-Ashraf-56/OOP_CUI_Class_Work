package OOP_CUI_Class_Work.src.Task;
import java.util.Scanner;

class Library{
    public String BookName;
    public String BookId;
    public String AuthorName;

    public void setpermeter(String x,String y,String z){
        BookName = x;
        BookId = y;
        AuthorName = z;
    }
    public void display(){
        System.out.println(" Book name " + BookName +" Book Id "+ BookId + " Author Name "+AuthorName);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        Library l1 = new Library();
        System.out.println("Enter Book Name");
        String x = abc.nextLine();
        System.out.println("Enter Book Id");
        String y = abc.nextLine();
        System.out.println("Enter Author name");
        String z = abc.nextLine();

        l1.setpermeter(x,y,z);
        l1.display();

    }

}