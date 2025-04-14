package being.rish.interfaces.animals;

public interface Animal {

    int MAX_AGE = 150;

    public abstract void eat();
    void sleep();

    // static methods in interface
    public static void info(){
        System.out.println("This is an Animal interface");
    }

    public default void run() {
        this.eat();
        System.out.println("Animal is running.");
    }
}
