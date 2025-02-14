package OOP_CUI_Class_Work.src.Lab1.Task;
class Car{
    public String brand;
    public int  model;
    public int cost;
    public String engineType;
    public void display(){
        System.out.println(brand+" "+model+" "+cost+" "+engineType);
    }
}
class Task3{
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.brand = "BMW";
        C1.model = 1996;
        C1.cost = 78000;
        C1.engineType = "Diesel";
        C1.display();
    }
}