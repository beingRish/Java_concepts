package being.rish.math;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println(max);   //11
        System.out.println(min);   //10

        int c = -11;
        int abs = Math.abs(c);
        System.out.println(abs);    //11

        double d = 1.12;
        double ceil = Math.ceil(d);
        double floor = Math.floor(d);
        double round = Math.round(d);
        System.out.println(ceil);   //2.0
        System.out.println(floor);  //1.0
        System.out.println(round);  //1.0

        int e = 144;
        System.out.println(Math.sqrt(e));   //12.0
        System.out.println(Math.pow(12, 1.2));  //19.725021954206706

        System.out.println(Math.log(10));   //2.302585092994046
        System.out.println(Math.log10(10)); //1.0

        System.out.println(1 + Math.PI);    //4.141592653589793
        System.out.println((int)(Math.random() * 11));  //random number b/w 0 to 10
    }
}
