package being.rish.inner_classes.anonymous_inner_class;

public class CreditCardV0 implements Payment {

    private String creditCardNumber;

    public CreditCardV0(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
