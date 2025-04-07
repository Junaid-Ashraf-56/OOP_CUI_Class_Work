package OOP_CUI_Class_Work.src.Lab7;

// Abstract class
abstract class PaymentMethod {
    // Abstract method to be implemented by subclasses
    abstract void processPayment(double amount);

    // Concrete method shared by all subclasses
    void generateReceipt() {
        System.out.println("Receipt generated for your payment. Thank you!");
    }
}

// Subclass 1
class CreditCardPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Simulate some logic
        System.out.println("Credit card approved!");
    }
}

// Subclass 2
class PayPalPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Simulate some logic
        System.out.println("Logged into PayPal and payment completed.");
    }
}

// Subclass 3
class BankTransferPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        // Simulate some logic
        System.out.println("Bank transfer initiated.");
    }
}

// Main class to test
public class Abstraction1 {
    public static void main(String[] args) {
        // Create objects of each subclass
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bank = new BankTransferPayment();

        // Call methods
        creditCard.processPayment(100.50);
        creditCard.generateReceipt();

        System.out.println();

        paypal.processPayment(75.25);
        paypal.generateReceipt();

        System.out.println();

        bank.processPayment(200.00);
        bank.generateReceipt();
    }
}
