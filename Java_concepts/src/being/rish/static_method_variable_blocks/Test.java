package being.rish.static_method_variable_blocks;

/*
The static keyword in Java is used for memory management primarily.
It can be applied to variables, methods, blocks, and nested classes.
The main concept behind static is that it belongs to the class rather than instances of the class.
The static method can not use non-static data member or call non-static method directly.
this and super cannot be used in static context.

*/

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(12);
        student1.setName("Ram");
        student1.setId(1);
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        System.out.println(Student.count);
        Student.getCount();
        int c = sum(1, 2);
        System.out.println(c);

        System.out.println(Utils.max(1, 22));
        System.out.println(Utils.min(1, 22));
        String trimmedAndUppercaseString = Utils.trimAndUppercase(" edfer feuijfde ");
        System.out.println(trimmedAndUppercaseString);

        School.getInstance();
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
