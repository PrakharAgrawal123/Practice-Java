//Abstract Class 

abstract class Animal {
    //Abstract method (no body)

    public abstract void sound();

    //Concrete Method (with body)
    public void sleep() {
        System.out.println("Animals are sleeping");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dogs bark !!!");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("Cats meow !!!");
    }
}

public class Abstract_Class {

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
        a1.sleep();
        a2.sleep();
    }
}
