package being.rish.abstraction;

/*
    Hiding internal working is called abstraction.
*/


public class Test {
    public static void main(String[] args) {

//        Animal animal = new Animal(); // can't create the object of an abstract class

        Animal dog = new Dog();
        dog.sayHello();
    }
}
