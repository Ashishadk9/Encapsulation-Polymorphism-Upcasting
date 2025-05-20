
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Account
{
    private double balance;
    private String accountNumber;
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber= accountNumber;
        this.balance= initialBalance;
    }
    // Getter For balance
    public double getBalance() {
        return balance;
    }
    // Setter For balance
    public void setBalance(double balance) {
        this.balance=balance;
    }
    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    // Abstract method to calculate interest
    public abstract double calculateInterest();
}
