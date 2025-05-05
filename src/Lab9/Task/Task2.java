package OOP_CUI_Class_Work.src.Lab9.Task;

interface Payable{
    double getPaymentAmount();
}
class Invoice implements Payable{
 private String partNumber;
 private  String partDescription;
 private int quantity;
 private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {return partNumber;}
    public void setPartNumber(String partNumber) {this.partNumber = partNumber;}
    public String getPartDescription() {return partDescription;}
    public void setPartDescription(String partDescription) {this.partDescription = partDescription;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public double getPricePerItem() {return pricePerItem;}
    public void setPricePerItem(double pricePerItem) {this.pricePerItem = pricePerItem;}

    public void display(){
        System.out.println("Part Number "+getPartNumber());
        System.out.println("Part Description "+getPartDescription());
    }
    @Override
    public double getPaymentAmount(){
        return getQuantity()*getPricePerItem();
    }


}
class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityCard;

    public Employee(String firstName, String lastName, String socialSecurityCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityCard = socialSecurityCard;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getSocialSecurityCard() {return socialSecurityCard;}
    public void setSocialSecurityCard(String socialSecurityCard) {this.socialSecurityCard = socialSecurityCard;}

   public void display(){
       System.out.println("First Name "+getFirstName());
       System.out.println("Last Name "+getLastName());
       System.out.println("Social Security Card "+getSocialSecurityCard());
   }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
class SalariedEmployee extends Employee{
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityCard, double weekSalary) {
        super(firstName, lastName, socialSecurityCard);
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {return weekSalary;}
    public void setWeekSalary(double weekSalary) {this.weekSalary = weekSalary;}


    @Override
    public double getPaymentAmount() {
        super.display();
        return getWeekSalary();
    }
}
public class Task2 {
    public static void main(String[] args) {
        Payable p1 = new Invoice("123","Hello",10,250);
        Payable p2 = new SalariedEmployee("Junaid ","Ashraf","123",250);

        ((Invoice) p1).display();
        System.out.println(p1.getPaymentAmount());

        System.out.println(p2.getPaymentAmount());


    }
}