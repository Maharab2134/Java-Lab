//Task: Define an interface named Animal with methods eat() and sleep(). Then, create two classes, Dog and Cat, that implement this interface. Provide specific implementations for the eat() and sleep() methods in each class.

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

public class Task {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}