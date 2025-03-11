package payment;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount + ", " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "payment method: PayPal, email: " + email;
    }
}
