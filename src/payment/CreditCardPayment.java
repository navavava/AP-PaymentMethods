package payment;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount + ", " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "payment method: credit card, card number: " + cardNumber + ", card holder name: " + cardHolderName;
    }
}
