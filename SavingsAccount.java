/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account {
    private static final double Interest_Rate=0.05;
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    public double calculateInterest() {
        return getBalance()*Interest_Rate;
    }
}
class CurrentAccount extends Account {
    private static final double Interest_Rate=0.02;
    public CurrentAccount(String accountNumber,double initialBalance) {
        super(accountNumber, initialBalance);
    }
    public double calculateInterest() {
        return getBalance()*Interest_Rate;
    }
}
