package being.rish.final_keyword;

/*
final -> variables, method, class
*/

public final class Car extends Vehicle{

    private final int speedLimit;

    public Car() {
        speedLimit = 200;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air bags");
    }
}
