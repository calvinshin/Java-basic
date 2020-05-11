interface Account {
    int deposit(int amount);
    boolean withdraw(int amount);
}

public class BankAccount implements Account {
    int balance;
    public BankAccount(int initial) {
        balance = initial;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public boolean withdraw(int amount) {
        if(amount < balance) {
            balance -= amount;
            return true;
        }
        else return false;
    }
}