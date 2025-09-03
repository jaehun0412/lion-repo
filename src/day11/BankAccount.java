package day11;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123-456", 10000);

        try {
            account.withdraw(15000);
        } catch (InsufficientBalanceException e) {
            System.out.println("출금 실패: " + e.getMessage());
            System.out.println("현재 잔액: " + e.getBalance());
            System.out.println("출금 시도액: " + e.getWithdrawAmount());
        }
    }
}

abstract class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends BankingException {
    private String accountNumber;

    public AccountNotFoundException(String accountNumber) {
        super("계좌를 찾을 수 없습니다: " + accountNumber);
        this.accountNumber = accountNumber;
    }
}

class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawAmount;

    public InsufficientBalanceException(double balance, double withdrawAmount) {
        super(String.format("잔액 부족: 현재 잔액 %.2f원, 출금 시도 %.2f원",
                balance, withdrawAmount));
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() { return balance; }
    public double getWithdrawAmount() { return withdrawAmount; }
}
