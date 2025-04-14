package being.rish.abstraction;

public abstract class Animal {

    private int age;
    private String name;
    private boolean hasSuperPowers;

    protected Animal() {
        this.hasSuperPowers = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // abstract method
    public abstract void sayHello();

    //concrete method
    public void sleep() {
        System.out.println("zzz...");
    }
}
