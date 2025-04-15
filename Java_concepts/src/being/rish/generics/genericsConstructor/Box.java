package being.rish.generics.genericsConstructor;

public class Box {
    public <T extends Number> Box(T value) {

    }

    public static void main(String[] args) {
        Box box2 = new Box(2);
    }
}
