package being.rish.encapsulation;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(3442442);

        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());
    }
}
