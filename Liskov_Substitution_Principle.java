/**
 * This is an abstract class representing a Vehicle.
 * It provides basic functionality and information about a vehicle.
 */
abstract class Vehicle {
    protected String type; // The type of the vehicle
    protected int wheels; // The number of wheels

    /**
     * Constructs a new Vehicle with the given type and number of wheels.
     * @param type The type of the vehicle (e.g., Car, Motorcycle)
     * @param wheels The number of wheels the vehicle has
     */
    public Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    /**
     * Gets the type of the vehicle.
     * @return The type of the vehicle
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the number of wheels of the vehicle.
     * @return The number of wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Abstract method to start the vehicle.
     * Subclasses must implement this method.
     */
    public abstract void start();

    /**
     * Returns a string representation of the vehicle.
     * @return A string containing type and wheels information
     */
    @Override
    public String toString() {
        return "Type: " + type + "\nWheels: " + wheels;
    }
}

/**
 * Represents a Car, which is a type of Vehicle.
 */
class Car extends Vehicle {
    private int doors; // The number of doors

    /**
     * Constructs a new Car with the given type, wheels, and doors.
     * @param type The type of the car
     * @param wheels The number of wheels the car has
     * @param doors The number of doors the car has
     */
    public Car(String type, int wheels, int doors) {
        super(type, wheels);
        this.doors = doors;
    }

    /**
     * Starts the car.
     */
    @Override
    public void start() {
        System.out.println("Starting the car.");
    }

    /**
     * Returns a string representation of the car.
     * @return A string containing car details
     */
    @Override
    public String toString() {
        return super.toString() + "\nDoors: " + doors;
    }
}

/**
 * Represents a Motorcycle, which is a type of Vehicle.
 */
class Motorcycle extends Vehicle {
    private int maxSpeed; // The maximum speed of the motorcycle

    /**
     * Constructs a new Motorcycle with the given type, wheels, and maximum speed.
     * @param type The type of the motorcycle
     * @param wheels The number of wheels the motorcycle has
     * @param maxSpeed The maximum speed of the motorcycle
     */
    public Motorcycle(String type, int wheels, int maxSpeed) {
        super(type, wheels);
        this.maxSpeed = maxSpeed;
    }

    /**
     * Starts the motorcycle.
     */
    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
    }

    /**
     * Returns a string representation of the motorcycle.
     * @return A string containing motorcycle details
     */
    @Override
    public String toString() {
        return super.toString() + "\nMax Speed: " + maxSpeed;
    }
}

/**
 * This class demonstrates the usage of the Vehicle, Car, and Motorcycle classes.
 */
public class LSP {
    /**
     * The main method creates instances of Car and Motorcycle and prints their details.
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        Vehicle car = new Car("Car", 4, 4); // Creating a Car object
        Vehicle motorcycle = new Motorcycle("Motorcycle", 2, 180); // Creating a Motorcycle object

        System.out.println("Car Details:");
        System.out.println(car.toString()); // Printing details of the car using overridden toString method

        System.out.println("\nMotorcycle Details:");
        System.out.println(motorcycle.toString()); // Printing details of the motorcycle using overridden toString method
    }
}
/**
 * The Liskov Substitution Principle (LSP), which states that objects of a superclass
 * should be replaceable with objects of its subclasses.In this example of code 
 * (Car and Motorcycle) can be substituted for their superclass (Vehicle) without
 * affecting the correctness of the program, adhering to the LSP.
 */
