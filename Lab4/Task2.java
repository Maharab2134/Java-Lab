//Task: Define an interface Vehicle with a default method startEngine(), which prints a message saying &quot;Engine started.&quot; Create two classes, Car and Bike, that implement the Vehicle interface. Override the startEngine() method in each class to provide specific messages.


interface Vehicle{
    default void startEngine(){
        System.out.println("Engine is started");
    }
}

class Car implements Vehicle{
    public void startEngine(){
        System.out.println("Car Engine is started");
    }
}

class Bike implements Vehicle{
    public void startEngine(){
        System.out.println("Bike Engine is started");
    }
}

public class Task2{
    public static void main(String[] args){
        Car car = new Car();
        Bike bike = new Bike();

        car.startEngine();
        bike.startEngine();
    }
}
