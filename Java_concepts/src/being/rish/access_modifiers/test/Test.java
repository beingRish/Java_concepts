package being.rish.access_modifiers.test;

/*
Access Modifiers is a keyword which decides the visibility of the class, method or other members like field etc.
public: Anywhere
private: class level
protected
default(no keyword)
*/

import being.rish.access_modifiers.school.Utils;
import being.rish.access_modifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
        Utils.sayHello();
        Utils.sayBye();

        Dog dog = new Dog("Bob");
        dog.makeSound();
//        dog.changeSound(); // because it's protected so we can access the changeSound() method from same package or child class
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();

    }
}
