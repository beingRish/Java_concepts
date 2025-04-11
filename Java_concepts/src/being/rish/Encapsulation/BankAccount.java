package being.rish.Encapsulation;

public class BankAccount {
    private long accountNumber;
    private int balance;

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw " + amount);
        }else {
            System.out.println("Invalid amount or Insufficient balance.");
        }
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
