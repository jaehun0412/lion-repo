package day05;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234", "Kim");

        bankAccount.displayInfo();
        System.out.println("----------");

        bankAccount.deposit(10000);
        bankAccount.displayInfo();

        System.out.println("----------");

        bankAccount.withdraw(3000);
        bankAccount.displayInfo();
    }
}
