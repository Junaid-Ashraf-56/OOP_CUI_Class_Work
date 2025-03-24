package OOP_CUI_Class_Work.src.Lab7.Activity;

 abstract class AB {
    abstract void callme();
    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
class BA extends AB {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}
public class Activity3 {
    public static void main(String[] args) {
        BA b = new BA();
        b.callme();
        b.callmetoo();
    }
}
