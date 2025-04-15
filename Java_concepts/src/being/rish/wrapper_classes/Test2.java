package being.rish.wrapper_classes;

public class Test2 {
    public static void main(String[] args) {
        Student x = new Student();
        x.setId(1);
        fun(x);
        System.out.println(x.getId());
    }

    private static void fun(Student a){
//        Student student = new Student();
//        student.setId(2);
//        a = student;

        a.setId(2);
    }
}
