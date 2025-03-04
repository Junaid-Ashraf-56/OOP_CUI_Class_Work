package OOP_CUI_Class_Work.src.Lab4.Task;
class Distance{
    private int feet;
    private int inches;
    public Distance(){
         feet = 5;
         inches = 4;
    }
    public Distance(int x,int y){
        feet = x;
        inches = y;
    }
    public void setDistance(int x,int y){
        feet = x;
        inches = y;
    }
    public  Distance Add(Distance a){
        Distance d4 = new Distance(feet+a.feet,inches+a.inches);
        return d4;
    }
    public int getFeet(){
        return feet;
    }
    public int getInches(){
        return inches;
    }
    public void display(){
        System.out.println(getFeet()+" "+getInches());
    }
}
public class Task1 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5,6);
        Distance d2 = new Distance();
        Distance d3 = new Distance();
        d3 = d3.Add(d1);
        d3.display();
    }
}