package being.rish.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            level1();
        }catch (Exception e){
            System.out.println(e);
        }

        method2();
        System.out.println("Hello");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new FileNotFoundException("oops");
        }
    }

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
