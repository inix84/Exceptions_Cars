import java.util.Objects;
public class Truck extends Car implements Competing {
    private Tonnage tonnage;
    private boolean serviceability;
    public Truck(String brand, String model, double engineVolume, String tonnage, boolean serviceability) {
        super(brand, model, engineVolume);
        this.tonnage = Tonnage.findByBTonnage(tonnage);
        this.serviceability = serviceability;
    }
    public enum Tonnage {
        N1 ("до 3,5 тонн"),
        N2 ("с 3,5 до 12 тонн"),
        N3 ("свыше 12 тонн");
        public static Tonnage findByBTonnage(String tonnage) {
            for (Tonnage tonn : values()) {
                if (tonn.getTonnage().equals(tonnage)) return tonn;
            }
            return null;
        }
        public static String identifyTonnage(Truck car) {
            return car.getTonnage() != null ? car.getTonnage().tonnage : "Нет информации";
        }
        private final String tonnage;
        Tonnage(String tonnage) {
            this.tonnage = tonnage;
        }
        public String getTonnage() {
            return tonnage;
        }
    }
    public Tonnage getTonnage() {
        return tonnage;
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " ушел на пит-стоп");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " показал лучшее время круга t");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " развил максимальную скорость v");
    }
    @Override
    protected void makeDiagnostic() throws DiagnosisFailedExcepton { //Переопределите данный метод для классов «Грузовые автомобили»
        if (serviceability == true) System.out.println("Диагностика пройдена");
        else throw new DiagnosisFailedExcepton("Автомобиль " + getBrand() + " " + getModel() +
                " неисправен. Диагностика не пройдена");//сли метод «Пройти диагностику» возвращает false
        // для объекта класса «Грузовые автомобили», то программа выбрасывает ошибку.
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return tonnage == truck.tonnage;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tonnage);
    }
    @Override
    public String toString() {
        return super.toString() + "\nКатегория: " + Tonnage.identifyTonnage(this);
    }
}