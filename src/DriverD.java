import java.util.Objects;
public class DriverD<D extends Bus> extends Driver{
    private final char category = 'B';
    public DriverD(String name, int experience) {
        super(name, experience);
    }

    /*public void setCategory(char category) {
        if (category=='\u0000') {
            throw new IllegalArgumentException("необходимо указать категорию прав!");
        }
        this.category = category;
    }*/

    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет автобусом " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }
    public void startMotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автобуса " + car.getBrand() + " " + car.getModel());
    }
    public void endNotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автобуса " + car.getBrand() + " " + car.getModel());
    }
    public void refueling(D car) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + car.getBrand() + " " + car.getModel());
    }
    public char getCategory() {
        return category;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD<?> driverD = (DriverD<?>) o;
        return category == driverD.category;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
    @Override
    public String toString() {
        return "DriverD{" +
                "category=" + category +
                '}';
    }
}