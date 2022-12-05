import java.util.Objects;
public class DriverB<D extends PassengerCar> extends Driver {
    private final char category = 'B';
    public DriverB(String name, int experience) {
        super(name, experience);
    }
    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }
    public char getCategory() {
        return category;
    }
    public void startMotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автомобиля " + car.getBrand() + " " + car.getModel());
    }
    public void endNotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автомобиля " + car.getBrand() + " " + car.getModel());
    }
    public void refueling(D car) {
        System.out.println("Водитель " + getName() + " заправляет автомобиль " + car.getBrand() + " " + car.getModel());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverB<?> driverB = (DriverB<?>) o;
        return category == driverB.category;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
    @Override
    public String toString() {
        return "DriverB{" +
                "category=" + category +
                '}';
    }
}