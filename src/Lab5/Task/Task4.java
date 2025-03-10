package OOP_CUI_Class_Work.src.Lab5.Task;

class Pizza{
 private String size_of_pizza;
 private int cheese_topping;
 private int peperoni;
 private int ham_topping;

 public Pizza(){
     this.size_of_pizza = "unknown";
 }

 public void setPizza(String a,int b,int c,int d){
     this.size_of_pizza = a;
     this.cheese_topping = b;
     this.peperoni = c;
     this.ham_topping = d;
 }
 public String getSize_of_pizza(){
     return size_of_pizza;
 }
 public int getCheese_topping(){
     return cheese_topping;
 }
 public int getPeperoni(){
     return peperoni;
 }
public int getHam_topping(){
     return ham_topping;
}
public double calcCost(){
 double basePrice = switch (size_of_pizza) {
     case "small" -> 10;
     case "medium" -> 12;
     case "large" -> 14;
     default -> 0;
 };
    return basePrice+2*(cheese_topping+peperoni+ham_topping);
 }
public String display(){
    return  "Size: " + getSize_of_pizza() + ", Cheese: " + getCheese_topping() + ", Pepperoni: " + getPeperoni() + ", Ham: " + getHam_topping() + ", Cost: $" + calcCost();

}

}
class PizzaOrder{
    private final Pizza pizza1;
    private final Pizza pizza2;
    private final Pizza pizza3;

    public PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3) {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public double calcTotal() {
        double total = 0;
        if (pizza1 != null) total += pizza1.calcCost();
        if (pizza2 != null) total += pizza2.calcCost();
        if (pizza3 != null) total += pizza3.calcCost();
        return total;
    }

    public void displayOrder() {
        System.out.println("Pizza Order Details:");
        if (pizza1 != null) System.out.println(pizza1.display());
        if (pizza2 != null) System.out.println(pizza2.display());
        if (pizza3 != null) System.out.println(pizza3.display());
        System.out.println("Total Order Cost: $" + calcTotal());
    }
}
public class Task4 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        p1.setPizza("small",1,0,1);
        Pizza p2 = new Pizza();
        p2.setPizza("medium",1,2,1);
        Pizza p3 = new Pizza();
        p3.setPizza("large",1,3,1);

        PizzaOrder pizzaOrder = new PizzaOrder(p1,p2,p3);
        pizzaOrder.displayOrder();

    }
}