public class CheckAccount {

    private int accountNumber;
    private double balance;

    public CheckAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

    public void withdraw(double amt) throws InsufficientFundsException {

        if (amt >= 0 && amt > this.balance) {

            throw new InsufficientFundsException(amt - this.balance);

        }

        this.balance -= amt;

    }

    public double getBalance() {
        return this.balance;
    }

    public double getAccountNum() {
        return this.accountNumber;
    }

}
