package being.rish.interfaces;

import being.rish.interfaces.animals.Animal;
import being.rish.interfaces.animals.Cat;
import being.rish.interfaces.animals.Dog;
import being.rish.interfaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);


        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal.info();
        cat.run();
        dog.run();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.clickPhoto();
        smartPhone.recordVideo();
        smartPhone.playMusic();
    }
}
