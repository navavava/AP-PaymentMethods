import payment.*;

public class Main {
    public static void main(String[] args) {
        PremiumCustomer arman = new PremiumCustomer("arman");
        PremiumCustomer nika = new PremiumCustomer("nika");
        RegularCustomer rose = new RegularCustomer("rose");
        CreditCardPayment credCard = new CreditCardPayment("4000056655665556", "nika");
        PayPalPayment payPal = new PayPalPayment("rose@fakemail.com");
        BitcoinPayment bitCoin = new BitcoinPayment("idk");
        arman.displayCustomerInfo();
        nika.displayCustomerInfo();
        rose.displayCustomerInfo();
        arman.makePayment(bitCoin, 2);
        arman.makePayment(bitCoin, 3);
        nika.makePayment(credCard, 5000);
        nika.makePayment(bitCoin, 1);
        rose.makePayment(payPal, 300);
        rose.makePayment(payPal, 500);
        System.out.println("arman's payment history: ");
        arman.showPaymentHistory();
        System.out.println("nika's payment history: ");
        nika.showPaymentHistory();
        System.out.println("rose's payment history: ");
        rose.showPaymentHistory();
    }
}