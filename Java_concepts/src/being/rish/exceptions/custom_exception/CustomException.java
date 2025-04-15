package being.rish.exceptions.custom_exception;

public class CustomException {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);
        try{
            bankAccount.withdraw(11);
        }catch (InsufficientFundsException e){
            e.getAmount();
            System.out.println(e);
        }
    }
}
