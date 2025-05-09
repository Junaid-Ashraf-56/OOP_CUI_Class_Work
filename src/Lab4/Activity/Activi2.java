package OOP_CUI_Class_Work.src.Lab4.Activity;
class Complex {
    private final double real;
    private final double imag;
    public Complex() {
        real = 0.0;
        imag = 0.0;
    }
    public Complex(double r, double im) {
        real = r;
        imag = im;
    }
    public Complex Add(Complex b) {
        Complex c_new = new Complex(real + b.real, imag + b.imag);
        return c_new;
    }
    public void Show() {
        System.out.println(real + imag);
    }
}
public class Activi2 {
    public static void main(String[] args) {
        Complex C1 = new Complex(11, 2.3);
        Complex C2 = new Complex(9, 2.3);
        Complex C3 = new Complex();
        C3 = C1.Add(C2);
        C3.Show();
    }
}