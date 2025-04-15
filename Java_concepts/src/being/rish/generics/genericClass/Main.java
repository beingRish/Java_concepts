package being.rish.generics.genericClass;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(); // Box is now type safe
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);
    }
}
