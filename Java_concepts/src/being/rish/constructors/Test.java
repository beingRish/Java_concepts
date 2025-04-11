package being.rish.constructors;

// constructor is a special method which is used to initialize the object.

public class Test {
    public static void main(String[] args) {
        Student student = new Student(); // calling overloaded constructor
        Student student1 = new Student("Ram", 2, 11); // calling parameterized constructor
        Student student2 = new Student("Shyam");
        System.out.println(student.getName());
        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
