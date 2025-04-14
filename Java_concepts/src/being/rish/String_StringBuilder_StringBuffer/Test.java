package being.rish.String_StringBuilder_StringBuffer;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        // char array ( 16 )
        // mutable
        // method chaining

        sb.append(" World").append(" !");
        String string = sb.toString();
        System.out.println(string);

        StringBuffer sb1 = new StringBuffer("Hello");
        // mutable
        // method chaining
        // thread safe

    }
}
