
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount("A223",12000);
        accounts[1] = new CurrentAccount("R334",18000);
        for(Account acc:accounts){
            double interest = acc.calculateInterest();
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance before interest: $" + acc.getBalance());
            System.out.println("Calculated Interest: $" + interest);
            acc.setBalance(acc.getBalance() + interest);
            System.out.println("Balance after interest: $" + acc.getBalance());
            System.out.println("//Another Account");
        }
    }
}
