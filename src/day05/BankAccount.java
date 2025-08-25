package day05;

public class BankAccount {

    private String account;
    private String owner;
    private int balance;

    public BankAccount(String account, String owner) {
        this.account = account;
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("출금액은 잔액보다 작아야 합니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("출금액은 0보다 커야 합니다.");
            return;
        }

        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 잔액은 " + balance + "원 입니다.");
    }

    public int getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("계좌번호: " + account);
        System.out.println("소유자: " + owner);
        System.out.println("잔액: " + balance + "원");
    }
}
