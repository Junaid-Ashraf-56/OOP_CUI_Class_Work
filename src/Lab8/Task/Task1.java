package OOP_CUI_Class_Work.src.Lab8.Task;


import java.util.Scanner;

class Package{
     String senderName;
     String senderAddress;
     String reciptentName;
     String reciptentAddress;
     double weight;
     double cost;

    public Package(String senderName, String senderAddress, String reciptentName, String reciptentAddress, double weight, double cost) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.reciptentName = reciptentName;
        this.reciptentAddress = reciptentAddress;
        this.weight = weight;
        this.cost = cost;
    }
    public double calculateCost(){
        return weight*cost;
    }
}
class TwoDaysPackage extends Package{
    double flatFee;

    public TwoDaysPackage(String senderName, String senderAddress, String reciptentName, String reciptentAddress, double weight, double cost, double flatFee) {
        super(senderName, senderAddress, reciptentName, reciptentAddress, weight, cost);
        this.flatFee = flatFee;
    }
    @Override
    public double calculateCost(){
        return super.calculateCost()+flatFee;
    }
}
class OverNightPackage extends Package{
     double additionalFee;

    public OverNightPackage(String senderName, String senderAddress, String reciptentName, String reciptentAddress, double weight, double cost, double additionalFee) {
        super(senderName, senderAddress, reciptentName, reciptentAddress, weight, cost);
        this.additionalFee = additionalFee;
    }
    @Override
    public double calculateCost(){
        return super.calculateCost()+additionalFee;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner  abc = new Scanner(System.in);
        System.out.println("Enter weight and cost");
        int weight = abc.nextInt();
        int cost = abc.nextInt();
        if (cost>0&&weight>0) {
            Package p1 = new TwoDaysPackage("Noman", "NN", "Juaid", "NN", 5, 5, 5);
            Package p2 = new OverNightPackage("Noman", "NN", "Juaid", "NN", 5, 5, 5);
            System.out.println(p1.calculateCost());
            System.out.println(p2.calculateCost());
        }
        else {
            System.out.println("Cost and weigh must be positive");
        }
    }
}
