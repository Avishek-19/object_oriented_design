import java.util.ArrayList;

/**
 * Class responsible for managing car data.
 */
class Car {
    private String brand; // Brand of the car
    private String model; // Model of the car
    private double price; // Price of the car

    /**
     * Constructor to initialize car data.
     * @param brand The brand of the car.
     * @param model The model of the car.
     * @param price The price of the car.
     */
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    /**
     * Getter method for retrieving the car's brand.
     * @return The brand of the car.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Getter method for retrieving the car's model.
     * @return The model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Getter method for retrieving the car's price.
     * @return The price of the car.
     */
    public double getPrice() {
        return price;
    }
}

/**
 * Class responsible for calculating car taxes.
 */
class CarTaxCalculator {
    /**
     * Method to calculate tax based on car price.
     * @param car The car for which tax is calculated.
     * @return The calculated tax amount.
     */
    public double calculateTax(Car car) {
        return car.getPrice() * 0.2; // For example, 20% of car price
    }
}

/**
 * Class responsible for printing car information.
 */
class CarPrinter {
    /**
     * Method to print car details.
     * @param car The car whose details are printed.
     */
    public void printCarDetails(Car car) {
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Price: " + car.getPrice() + " Dollar");
    }
}

public class SRP {
    public static void main(String[] args) {
        // Creating an ArrayList to hold multiple cars
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "XM SUV", 159000));
        cars.add(new Car("Tesla", "Model S", 80000));
        cars.add(new Car("Ford", "Mustang", 60000));

        CarTaxCalculator taxCalculator = new CarTaxCalculator();
        CarPrinter carPrinter = new CarPrinter();

        // Calculating tax and printing car details for each car
        for (Car car : cars) {
            double tax = taxCalculator.calculateTax(car);
            carPrinter.printCarDetails(car);
            System.out.println("Tax: " + tax + " Dollar\n");
        }
    }
}
/**
 * The SRP states that a class should have only one reason to change.
 * In this example, we have separate classes for managing car data,
 * calculating car taxes, and printing car information, adhering to SRP.
 */
