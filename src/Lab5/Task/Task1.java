package OOP_CUI_Class_Work.src.Lab5.Task;

import java.util.Scanner;

class Address{
    private  String street;
    private  int house;
    private  String city;
    private  int code;
    public Address(){
    }
    public void setAddress(Scanner abc){
        street = abc.nextLine();
        house = abc.nextInt();
        city = abc.nextLine();
        abc.nextLine();
        code = abc.nextInt();
    }
    public String getStreet(){
     return street;
    }
    public int getHouse(){
        return house;
    }
    public String getCity(){
        return city;
    }
    public int getCode(){
        return code;
    }
}
class Person{
    private  final Address address;
    public Person(Address a){
        address = a;
    }
    public void display(){
        System.out.println("Street is : " + address.getStreet());
        System.out.println("House is : " + address.getHouse());
        System.out.println("City is : " + address.getCity());
        System.out.println("Code is : " + address.getCode());
    }

}
public class Task1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        Address a = new Address();
        a.setAddress(abc);
        Person p =new Person(a);
        p.display();
    }
}
