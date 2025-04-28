package OOP_CUI_Class_Work.src.Lab8.Task;

abstract class Convert {
    double val1;
    double val2;

    public Convert(double val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    abstract void compute();
}

class LTG extends Convert {
    public LTG(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.264172; // Correct conversion
        System.out.println(val1 + " liters = " + val2 + " gallons");
    }
}

class FTC extends Convert {
    public FTC(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void compute() {
        val2 = (val1 - 32) * 5.0/9.0; // Correct conversion
        System.out.println(val1 + " Fahrenheit = " + val2 + " Celsius");
    }
}

class FTM extends Convert {
    public FTM(double val1, double val2) {
        super(val1, val2);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.3048; // Correct conversion
        System.out.println(val1 + " feet = " + val2 + " meters");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Convert c1 = new LTG(4, 0);
        Convert c2 = new FTC(100, 0);
        Convert c3 = new FTM(3, 0);

        c1.compute();
        c2.compute();
        c3.compute();
    }
}
