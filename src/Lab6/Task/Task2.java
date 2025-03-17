package OOP_CUI_Class_Work.src.Lab6.Task;

class Publication{
    protected String title;
    protected int price;

    public Publication(String title,int price){
        this.title = title;
        this.price = price;
    }

    public void setPublication(String title,int price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Title "+ getTitle()  + " Price"+ getPrice();
    }
}
class Book extends Publication{
    protected int PageCount;

    public Book(String title , int price){
        super(title,price);
    }

    public void setPageCount(int pageCount){
        this.PageCount = pageCount;
    }
    public int getPageCount(){
        return PageCount;
    }
    @Override
    public String toString(){
        return super.toString() + " Page count "+  getPageCount();
    }
}
class Tape extends  Publication{
    protected String time;
    public Tape(String t,int p){
        super(t,p);
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getTime(){
        return time;
    }
    @Override
    public String toString(){
        return super.toString() + " Time " + getTime();
    }
}
public class Task2 {
    public static void main(String[] args) {
            Book b1 = new Book("Atomic Habits",500);
            b1.setPageCount(500);
            Tape t1 = new Tape("Hello",500);
            t1.setTime("50 mintue");

        System.out.println(b1);
        System.out.println(t1);

    }
}
