package problem;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
    public void processPayPalPayment(PayPalPayment paypal, double amount) {
        paypal.pay(amount);
    }
}