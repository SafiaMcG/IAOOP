import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Car {

    private String manufacturer;
    private int age;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }

    public void output() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Age: " + age);
    }

    public Car(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<Car> clist = new ArrayList<Car>();
        clist.add(new Car("Ford", 12));
        clist.add(new Car("BMW", 9));
        clist.add(new Car("Toyota", 1));
        clist.add(new Car("Honda", 12));
        clist.add(new Car("Honda", 2));
        clist.add(new Car("Hyundai", 19));
        clist.add(new Car("Renault", 3));

        Collections.sort(clist, new ManufacturerComparator().thenComparing(new AgeComparator()));
        for (Car car : clist) {
            car.output();
        }
    }
}