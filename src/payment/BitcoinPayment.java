package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount + ", " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "payment method: Bitcoin, wallet address: " + walletAddress;
    }
}
