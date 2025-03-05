package OOP_CUI_Class_Work.src.Lab4.Task;
 class Fraction {
    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        else
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // Getter and Setter methods
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        else {
            this.denominator = denominator;
        }
    }

    // Display function
    public void display() {
        System.out.println(getNumerator() + "/" + getDenominator());
    }

    // Equals method to compare two fractions
    public boolean equals(Fraction other) {
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }
}
public class Task3{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);

        f1.display();
        f2.display();
        f3.display();

        System.out.println("f1 and f2 are equal: " + f1.equals(f2));
        System.out.println("f1 and f3 are equal: " + f1.equals(f3));
    }
}
