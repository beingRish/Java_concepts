package being.rish.generics.genericMethod;

public class Test {
    public static void main(String[] args) {
//        Test2 test2 = new Test2();
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Hello", "World"};
        printArray(intArray);
        printArray(strArray);
        display(12);
        display(12.2);
    }

    public static <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public static void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public static <T> void printArray(T[] array) {
        for(T element: array){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
