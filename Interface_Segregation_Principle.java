
// Interface for starting vehicles
interface Startable {
    /**
     * Starts the vehicle.
     */
    void start();  // Start the vehicle
}

// Interface for stopping vehicles
interface Stoppable {
    /**
     * Stops the vehicle.
     */
    void stop();  // Stop the vehicle
}

// Interface for vehicles that can be driven
interface Drive {
    /**
     * Drives the vehicle.
     */
    void drive();  // Drive the vehicle
}

// Interface for vehicles that can fly
interface Fly {
    /**
     * Flies the vehicle.
     */
    void fly();  // Fly the vehicle
}

// Car class implementing Drive, Startable, and Stoppable interfaces
class Car implements Drive, Startable, Stoppable {
    @Override
    public void drive() {
        System.out.println("The Car is driving");
    }

    @Override
    public void start() {
        System.out.println("The Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("The Car is stopping");
    }
}

// Plane class implementing Fly, Startable, and Stoppable interfaces
class Plane implements Fly, Startable, Stoppable {
    @Override
    public void start() {
        System.out.println("The Plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("The Plane is stopping");
    }

    @Override
    public void fly() {
        System.out.println("The Plane is flying");
    }
}

public class ISP {
    /**
     * Main method to demonstrate the usage of Car and Plane classes.
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Start the car
        car.drive();  // Drive the car
        car.stop();   // Stop the car

        Plane plane = new Plane();
        plane.start();  // Start the plane
        plane.fly();    // Fly the plane
        plane.stop();   // Stop the plane
    }
}
/**
 * The Interface Segregation Principle (ISP) states that clients should not be 
 * forced to depend on interfaces they do not use. 
 * By having separate interfaces for different behaviors, classes like Car and 
 * Plane can implement only the interfaces relevant to their functionality. 
 * For example, a Car implements Drive, Startable, and Stoppable,
 * while a Plane implements Fly, Startable, and Stoppable. 
 * Thats why this code adheres to the Interface Segregation Principle.
 */
