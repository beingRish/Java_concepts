package being.rish.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s1 = list.get(0);
        String s2 = list.get(1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
