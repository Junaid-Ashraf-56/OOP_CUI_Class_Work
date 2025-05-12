package OOP_CUI_Class_Work.src.Assignment3;

import java.util.ArrayList;

interface Vehicle{
    void start();
    void stop();
    void fuelEfficiency();
    String getType();
}
class Car implements Vehicle{
    double milePerGallon = 30;

    @Override
    public void start() {
        System.out.println("The car Starts");
    }
    @Override
    public void stop(){System.out.println("The car stop");}
    @Override
    public void fuelEfficiency() {
        System.out.println("The miles of Car are "+milePerGallon+" mpg");
    }

    @Override
    public String getType() {
        return "Car";
    }
}
class Bike implements Vehicle{
    double milePerGallon = 60;

    @Override
    public void start() {
        System.out.println("The Bike Starts");
    }
    @Override
    public void stop(){System.out.println("The Bike stop");}
    @Override
    public void fuelEfficiency() {
        System.out.println("The miles of Bike are "+milePerGallon+" mpg");
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
class Truck implements Vehicle{
    double milePerGallon = 60;

    @Override
    public void start() {
        System.out.println("The Truck Starts");
    }
    @Override
    public void stop(){System.out.println("The Truck stop");}
    @Override
    public void fuelEfficiency() {
        System.out.println("The miles of Truck are "+milePerGallon+" mpg");
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
public class Question1 {
    public static void main(String[] args) {
       Vehicle v1 = new Car();
       Vehicle v2 = new Bike();
       Vehicle v3 = new Truck();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        for(Vehicle vehicle :vehicles ){
            vehicle.start();
            vehicle.stop();
            vehicle.fuelEfficiency();
            System.out.println("The vehicle type is "+vehicle.getType());
            System.out.println();
        }
    }
}

// * The role of interfaces in Java OOP design (decoupling, multiple inheritance, flexibility).
// * The main role of interface in java is first it gives us 100% abstraction, and secondly, it provides us multiple inheritances that we can't achieve
// * through inheritance.
/*
*How polymorphism enables you to interact with different vehicle types using
*the same interface reference, and why this is useful in real-world systems like a rental service.
*
* When we give interface reference, the child classes also access through the reference by which a hierarchy structure is applied to the classes by polymorphism
* is very useful in real world systems, and the code doesn't get error or crash.
* */