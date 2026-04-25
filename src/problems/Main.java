package problems;

import problem.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCardPayment creditCard = new CreditCardPayment();
        PayPalPayment payPal = new PayPalPayment();

//        processor.processPaymentCreditCard(creditCard, 50.50);
//        processor.processPaymentCreditCard(creditCard, 150.50);

        processor.processPaymentCreditCard(creditCard, 50.50);
        processor.processPaymentCreditCard(payPal, 400);
    }
}