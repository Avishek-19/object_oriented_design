/**
 * Represents a car interface with methods to get brand, price, and calculate tax.
 */
interface Car {

    /**
     * Gets the brand of the car.
     * @return The brand of the car.
     */
    String getBrand();

    /**
     * Gets the price of the car.
     * @return The price of the car.
     */
    double getPrice();

    /**
     * Calculates the tax for the car.
     * @return The tax amount for the car.
     */
    double taxCalculator();
}

/**
 * Represents a Tesla car implementing the Car interface.
 */
class Tesla implements Car {
    private String brand;
    private double price;

    /**
     * Constructs a Tesla object with the specified brand and price.
     * @param brand The brand of the Tesla car.
     * @param price The price of the Tesla car.
     */
    public Tesla(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBrand() {
        return brand;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double taxCalculator() {
        return 0.2 * getPrice(); // Tesla tax calculation
    }
}

/**
 * Represents a BMW car implementing the Car interface.
 */
class BMW implements Car {
    private String brand;
    private double price;

    /**
     * Constructs a BMW object with the specified brand and price.
     * @param brand The brand of the BMW car.
     * @param price The price of the BMW car.
     */
    public BMW(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBrand() {
        return brand;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double taxCalculator() {
        return 0.3 * getPrice(); // BMW tax calculation
    }
}

/**
 * Represents a Printer utility class to print car details.
 */
class Printer {

    /**
     * Prints the details of a car.
     * @param car The car object whose details are to be printed.
     */
    public void print(Car car) {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Tax: $" + car.taxCalculator());
    }
}

/**
 * OCP class demonstrating the use of Car, Tesla, BMW, and Printer classes.
 */
public class OCP {

    public static void main(String[] args) {
        // Creating an array of cars
        Car[] cars = new Car[2];
        cars[0] = new Tesla("Tesla", 25000);
        cars[1] = new BMW("BMW", 35000);

        // Create a Printer instance
        Printer printer = new Printer();

        // Print details of each car using the Printer class
        for (Car car : cars) {
            printer.print(car);
        }
    }
}
/**
 * The Open-Closed Principle (OCP) states that objects or entities should be open for extension,
 * but closed for modification. In this example, we have a Car interface that
 * allows new car types to be added. The Tesla and BMW classes provide specific
 * implementations of car types, and the Printer class allows new car types to be 
 * printed without modifying this class, adhering to the OCP.
 */
