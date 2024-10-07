// Car and Bus are different types of vehicles. Car has its property speed and no_ of passengers. The Bus also has the same properties. Both the vehicle's speed depends on its engine and passengers depend on number of sits given when a Car or a Bus object is created. You are assigned to the task of comparing the two types of vehicles by their speed. Now translate the scenario to a java program, by creating the classes and comparing the speed of two objects of the classes Bus and Car. 


class Vehicle {
    int speed;
    int no_of_passengers;
    
    Vehicle(int speed, int no_of_passengers) {
        this.speed = speed;
        this.no_of_passengers = no_of_passengers;
    }
}

class Car extends Vehicle { 
    Car(int speed, int no_of_passengers) {
        super(speed, no_of_passengers);
    }
}

class Bus extends Vehicle {
    Bus(int speed, int no_of_passengers) {
        super(speed, no_of_passengers);
    }
}

public class Q2a {
    public static void main(String[] args) {
        Car car = new Car(50, 4);
        Bus bus = new Bus(50, 20);
        if (car.speed > bus.speed) {
            System.out.println("Car is faster than Bus");
        } else if (car.speed < bus.speed) {
            System.out.println("Bus is faster than Car");
        } else {
            System.out.println("Both are of same speed");
        }
    }
}

