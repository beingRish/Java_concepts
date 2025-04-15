package being.rish.generics.genericClass;

public class Main2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
