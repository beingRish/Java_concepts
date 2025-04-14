package being.rish.inner_classes.anonymous_inner_class;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}
