package day13.ocp;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
}
