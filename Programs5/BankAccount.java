public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String str) {
        accountHolder = str;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amt) {
        balance -= amt;
    }
}