package OOP_CUI_Class_Work.src.Lab10.Activity;

import java.util.ArrayList;

public class Activity1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());
// add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());
// display the array list
        System.out.println("Contents of al: " + al);
// Remove elements from the array list al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);}
}
