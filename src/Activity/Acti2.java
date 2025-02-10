package OOP_CUI_Class_Work.src.Activity;
import java.util.Scanner;
class Car{
    public String Brand;
    public String Model;
    public String Cost;

    public void setpermeter(String x,String y,String z){
        Brand = x;
        Model = y;
        Cost = z;
    }
    public void display(){
        System.out.println(" Name "+Brand+" Model "+Model+" Cost "+Cost);
    }

}
public class Acti2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter car name");
        String x = abc.nextLine();
        System.out.println("Enter Model Year");
        String y = abc.nextLine();
        System.out.println("Enter Cost");
        String z = abc.nextLine();
        car1.setpermeter(x,y,z);
        car1.display();

    }
}