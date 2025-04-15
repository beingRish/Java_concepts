package being.rish.generics.wildcardsInGenerics;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<? super Number> numbers = Arrays.asList(1, 2, 3);
        numbers.add(12);
        numbers.add(null);
    }

    //Upper Boundation
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for(Number o: numbers) {
            sum += o.doubleValue();
        }
        return sum;
    }

    //Lower Boundation
    public static void printNumbers(List<? super Integer> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
