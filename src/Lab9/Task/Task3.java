package OOP_CUI_Class_Work.src.Lab9.Task;

interface Compare
{
    boolean compareObjects(Object o);
}
class InventoryItem implements Compare
{
    private String name;
    private int uniqueItemID;

    public InventoryItem() {
    }

    public InventoryItem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getUniqueItemID() {return uniqueItemID;}
    public void setUniqueItemID(int uniqueItemID) {this.uniqueItemID = uniqueItemID;}

    public boolean compareObjects(Object o){
        if (this==o){return true;}
        if (o==null||this.getClass()!=o.getClass()){return false;}
        InventoryItem that = (InventoryItem) o;
        return uniqueItemID == that.uniqueItemID && name.equals(that.name);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Compare c1 = new InventoryItem("Junaid",123);
        Compare c2 = new InventoryItem();
        ((InventoryItem) c2).setName("Junaid");
        ((InventoryItem) c2).setUniqueItemID(123);

        System.out.println(c1.compareObjects(c2));
    }
}
