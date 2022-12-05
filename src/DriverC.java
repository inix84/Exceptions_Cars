import java.util.Objects;
public class DriverC<D extends Truck> extends Driver {
    private final char category = 'B';

    public DriverC(String name, int experience) {
        super(name, experience);
    }
    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет грузовиком " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }
    public void startMotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ грузовика " + car.getBrand() + " " + car.getModel());
    }
    public void endNotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ грузовика " + car.getBrand() + " " + car.getModel());
    }
    public void refueling(D car) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + car.getBrand() + " " + car.getModel());
    }
    public char getCategory() {
        return category;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverC<?> driverC = (DriverC<?>) o;
        return category == driverC.category;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
    @Override
    public String toString() {
        return "DriverC{" +
                "category=" + category +
                '}';
    }
}