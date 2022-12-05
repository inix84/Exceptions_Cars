import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public final void startMotion() {
        System.out.println("Автомобиль начинает движение");
    }

    public final void endMotion() {
        System.out.println("Автомобиль завершает движение");
    }

    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        if (brand == null || brand.isEmpty()
                || brand.isBlank()) this.brand = "default";
        else this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if (model == null ||
                model.isEmpty() ||
                model.isBlank()) this.model = "default";
        else this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;
    }

    protected abstract void makeDiagnostic() throws DiagnosisFailedExcepton; //Добавьте в класс Car метод «Пройти диагностику».

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 &&
                Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "\nМарка: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Объем двигателя: " + getEngineVolume();
    }
}