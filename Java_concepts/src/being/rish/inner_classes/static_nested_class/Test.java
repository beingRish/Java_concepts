package being.rish.inner_classes.static_nested_class;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayInfo();
        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
