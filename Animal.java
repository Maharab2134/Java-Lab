// Method overriding

public class Animal {
    void sound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
