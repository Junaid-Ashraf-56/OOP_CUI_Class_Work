package OOP_CUI_Class_Work.src.Lab10.Task;

import java.util.ArrayList;

class MyMathClass<T extends Number> {

    public double standardDeviation(ArrayList<T> list) {
        if (list.isEmpty()) return 0;

        double sum = 0.0;
        for (T value : list) {
            sum += value.doubleValue();
        }

        double mean = sum / list.size();
        double squaredDiffSum = 0.0;

        for (T value : list) {
            double diff = value.doubleValue() - mean;
            squaredDiffSum += diff * diff;
        }

        return Math.sqrt(squaredDiffSum / list.size());
    }
}

public class Task2 {
    public static void main(String[] args) {
        // Test with Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        MyMathClass<Integer> mathInt = new MyMathClass<>();
        System.out.println("Standard Deviation (Integers): " + mathInt.standardDeviation(intList));

        // Test with Doubles
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.5);
        doubleList.add(7.2);
        doubleList.add(4.8);

        MyMathClass<Double> mathDouble = new MyMathClass<>();
        System.out.println("Standard Deviation (Doubles): " + mathDouble.standardDeviation(doubleList));

    }
}
