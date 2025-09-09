package day13.ocp;

public class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}
