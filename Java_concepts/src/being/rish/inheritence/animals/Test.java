package being.rish.inheritence.animals;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("Bob");
        dog.eat();
        dog.sayHello();

        Cat cat = new Cat();
    }
}
