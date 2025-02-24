package OOP_CUI_Class_Work.src.Lab3.Task;

import java.util.Scanner;

class HotDogStand {
    private final int ID;
    private int soldPerDay;

    public HotDogStand(){
        this.ID = 404;
        this.soldPerDay = 404;
    }
    public HotDogStand(int ID, int soldPerDay) {
        this.ID = ID;
        this.soldPerDay = soldPerDay;
    }

    public void justSold() {
        soldPerDay++;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public int getSoldPerDay() {
        return soldPerDay;
    }

    // Display method
    public void display() {
        System.out.println("HotDogStand ID: " + ID + ", Hot Dogs Sold: " + soldPerDay);
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        System.out.println("Enter ID and initial sales for Stand 1:");
        HotDogStand h1 = new HotDogStand(abc.nextInt(), abc.nextInt());

        System.out.println("Enter ID and initial sales for Stand 2:");
        HotDogStand h2 = new HotDogStand(abc.nextInt(), abc.nextInt());

        System.out.println("Enter ID and initial sales for Stand 3:");
        HotDogStand h3 = new HotDogStand(abc.nextInt(), abc.nextInt());

        h1.justSold();
        h1.justSold();

        h2.justSold();
        h2.justSold();

        h3.justSold();
        h3.justSold();


        // Displaying sales for each stand
        h1.display();
        h2.display();
        h3.display();

        abc.close();
    }
}
