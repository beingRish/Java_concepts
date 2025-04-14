package being.rish.access_modifiers.zoo;


import being.rish.access_modifiers.school.Utils;

public class Test {
    public static void main(String[] args) {
        Utils.sayHello();
        Utils.sayBye();

        Dog dog = new Dog("Bob");
        dog.makeSound();
        dog.changeSound("Woof"); // because this Test class is in the same package even if it is protected.
        dog.makeSound();
        dog.wagTail();

    }
}
