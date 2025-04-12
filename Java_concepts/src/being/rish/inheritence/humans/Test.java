package being.rish.inheritence.humans;

public class Test {
    public static void main(String[] args) {
        Child child = new Child(10, "Ram");
        child.setName("Ram");
        child.setAge(8);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        System.out.println(child.hasSuperPowers());
        child.childMethod();

//        Parent parent = new Parent(40, "Raheem");
//        parent.setAge(30);
//        parent.setName("Mukesh");
//        System.out.println(parent.getName());
//        System.out.println(parent.getAge());
//        System.out.println(parent.hasSuperPowers());
    }
}
