// Product
interface Car {
    void drive();
}

// Concrete Products
class SUV implements Car {
    public void drive() {
        System.out.println("Driving an SUV");
    }
}

class Sedan implements Car {
    public void drive() {
        System.out.println("Driving a Sedan");
    }
}

// Creator
abstract class CarFactory {

    // Factory Method
    public abstract Car createCar();

    public void testDrive() {
        Car car = createCar();
        car.drive();
    }
}

// Concrete creators
class SUVFactory extends CarFactory {
    public Car createCar() {
        return new SUV();
    }
}

class SedanFactory extends CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        CarFactory suvFactory = new SUVFactory();
        suvFactory.testDrive();

        CarFactory sedanFactory = new SedanFactory();
        sedanFactory.testDrive();
    }
}