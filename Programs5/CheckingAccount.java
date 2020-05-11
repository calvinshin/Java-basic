public class CheckingAccount extends BankAccount {
    boolean overdraft;
    public CheckingAccount(String str, boolean bool) {
        super(str);
        overdraft = bool;
    }
    public boolean hasOverdraft() {
        return overdraft;
    }
    public boolean clearCheck(double doub) {
        double bal = getBalance();
        if(bal - doub > 0) {
            withdraw(doub);
            return true;
        }
        else {
            return false;
        }
    }
}