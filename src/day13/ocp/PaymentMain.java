package day13.ocp;

public class PaymentMain {

    public static void main(String[] args) {
        Payment creditCard = new CreditCard();
        Payment payPal = new PayPal();

        creditCard.pay(10000);
        payPal.pay(20000);
    }
}
