package being.rish.exceptions.custom_exception;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount){
        super("What do you want? you don't have enough money");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
