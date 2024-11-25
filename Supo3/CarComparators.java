import java.util.Comparator;

class ManufacturerComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c1.getManufacturer().compareTo(c2.getManufacturer());
    }
}

class AgeComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
}