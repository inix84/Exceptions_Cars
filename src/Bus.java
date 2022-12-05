import java.util.Objects;

public class Bus extends Car implements Competing {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, String capacity) {
        super(brand, model, engineVolume);
        this.capacity = Capacity.findByCapacity(capacity);
    }

    public enum Capacity {
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 25"),
        AVERAGE ("40–50"),
        LARGE("60–80"),
        ESPECIALLY_LARGE("100–120 мест");

        private final String capacity;
        public static Capacity findByCapacity(String capacity) {
            for (Capacity cap : values()) {
                if (cap.getCapacity().equals(capacity)) return cap;
            }
            return null;
        }

        public static String identifyCapacity(Bus car) {
            return car.getCapacity() != null ? car.getCapacity().capacity : "Нет информации";
        }

        Capacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    }
    public Capacity getCapacity() {
        return capacity;
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " показал лучшее время круга t");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " развил максимальную скорость v");
    }

    @Override
    protected void makeDiagnostic() throws DiagnosisFailedExcepton { //Объекты класса «Автобусы» диагностику проходить не могут.
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }

    @Override
    public String toString() {
        return super.toString() + "\nВместимость: " + Capacity.identifyCapacity(this);
    }
}