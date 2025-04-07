package OOP_CUI_Class_Work.src.Lab7;

// Abstract class Animal
abstract class Animal {
    // Abstract methods to be implemented by subclasses
    abstract void eat();
    abstract void makeSound();

    // Common method shared by all animals
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass Lion that extends Animal
class Lion extends Animal {
    // Implementing the abstract method eat
    @Override
    void eat() {
        System.out.println("The lion is eating meat.");
    }

    // Implementing the abstract method makeSound
    @Override
    void makeSound() {
        System.out.println("The lion roars.");
    }
}

// Subclass Elephant that extends Animal
class Elephant extends Animal {
    // Implementing the abstract method eat
    @Override
    void eat() {
        System.out.println("The elephant is eating grass.");
    }

    // Implementing the abstract method makeSound
    @Override
    void makeSound() {
        System.out.println("The elephant trumpets.");
    }
}

// Main class to test the implementation
public class Abstract {
    public static void main(String[] args) {
        // Creating objects of Lion and Elephant
        Animal lion = new Lion();
        Animal elephant = new Elephant();

        // Calling methods from both Lion and Elephant objects
        lion.eat();
        lion.makeSound();
        lion.sleep();

        System.out.println();

        elephant.eat();
        elephant.makeSound();
        elephant.sleep();
    }
}
