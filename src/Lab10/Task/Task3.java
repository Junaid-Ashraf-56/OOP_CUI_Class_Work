package OOP_CUI_Class_Work.src.Lab10.Task;

import java.util.ArrayList;
import java.util.Random;

class RandomBox<T> {
    private final ArrayList<T> items;
    private final Random random;

    public RandomBox() {
        items = new ArrayList<>();
        random = new Random();
    }

    // Add item to box
    public void add(T item) {
        items.add(item);
    }

    // Check if box is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Draw random item from box
    public T drawItem() {
        if (isEmpty()) {
            return null;
        }
        int index = random.nextInt(items.size());
        return items.get(index);
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Test with Strings (names)
        RandomBox<String> nameBox = new RandomBox<>();
        nameBox.add("Alice");
        nameBox.add("Bob");
        nameBox.add("Charlie");

        System.out.println("Random name drawn: " + nameBox.drawItem());

        // Test with Integers (lottery numbers)
        RandomBox<Integer> lotteryBox = new RandomBox<>();
        lotteryBox.add(7);
        lotteryBox.add(13);
        lotteryBox.add(42);
        lotteryBox.add(88);

        System.out.println("Random lottery number drawn: " + lotteryBox.drawItem());

        // Test drawing from empty box
        RandomBox<Double> emptyBox = new RandomBox<>();
        System.out.println("Draw from empty box: " + emptyBox.drawItem()); // Should print null
    }
}

