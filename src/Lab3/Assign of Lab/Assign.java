package OOP_CUI_Class_Work.src.Lab3;
class Laptop{
    public String Brand;
    public String Model;
    public  String Processor;
    public String Ram;
    public int Price;
//    public Laptop(){
//        Brand = "Unknown";
//        Model = "Unknown";
//        Processor = "Unknown";
//        Ram = "Unknown";
//        Price = 404;
//    }
    public Laptop(String a,String b,String c,String d,int e){
        Brand = a;
        Model = b;
        Processor = c;
        Ram = d;
        Price = e;
    }
public void displayDetail(){
    System.out.println("Brand :"+ Brand +" Model:"+Model+" Processor:"+Processor+" Ram: "+Ram+" Price: "+Price);
}
}
public class Assign {
    public static void main(String[] args) {
        Laptop P1 = new Laptop("HP","Spectrex360","Inteli7","16 GB",18000);
           P1.displayDetail();
    }
}
