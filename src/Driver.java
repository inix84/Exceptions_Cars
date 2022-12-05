import java.util.Objects;
public abstract class Driver {
    private String name;
    private int experience;
    public Driver(String name, int experience) {
        setName(name);
        setExperience(experience);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) this.name = "default";
        else this.name = name;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        if (experience < 0) this.experience = 0;
        else this.experience = experience;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience && Objects.equals(name, driver.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }
    @Override
    public String toString() {
        return "DriverB{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
