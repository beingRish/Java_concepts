package being.rish.inner_classes.member_inner_class;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
