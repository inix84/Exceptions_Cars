public class Main {
    public static void main(String[] args) throws DiagnosisFailedExcepton {
        PassengerCar lada = new PassengerCar("Lada", "Vesta", 1.6, "Универсал", false);
        PassengerCar kia = new PassengerCar("Kia", "Rio", 1.6, "Седан", true);
        PassengerCar vw = new PassengerCar("VW", "Polo", 1.6, "Седан", true);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Solaris", 1.6, "Хетчбэк", true);
        Truck kamaz = new Truck("KAMAZ", "5490", 11.76, "свыше 12 тонн", true);
        Truck volvo = new Truck("Volvo", "FH16", 12.8,"свыше 12 тонн", false);
        Truck scania = new Truck("Scania", "R440", 12.7,"свыше 12 тонн", true);
        Truck daf = new Truck("DAF", "105 XF", 12.9,"свыше 12 тонн", true);
        Bus mersedes = new Bus("Mersedes", "Tourismo", 11.98,"40–50");
        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.3,"40–50");
        Bus daewoo = new Bus("Daewoo", "BH120F Royal Cruiser II", 11.1,"40–50");
        Bus higer = new Bus("Higer", "KLQ 6128 LQ", 9.46,"40–50");
        kia.makeDiagnostic();
        lada.makeDiagnostic();
        DriverB<PassengerCar> john = new DriverB<>("John", 5);
        DriverB<PassengerCar> mike = new DriverB<>("Mike", 5);
        DriverB<PassengerCar> alice = new DriverB<>("Alice", 5);
        DriverB<PassengerCar> jack = new DriverB<>("Jack", 5);
        DriverC<Truck> bob = new DriverC<>("Bob", 5);
        DriverC<Truck> nick = new DriverC<>("Nick", 5);
        DriverC<Truck> rachel = new DriverC<>("Rachel", 5);
        DriverC<Truck> patrick = new DriverC<>("Patrick", 5);
        DriverD<Bus> william = new DriverD<>("William", 5);
        DriverD<Bus> sarah = new DriverD<>("Sarah", 5);
        DriverD<Bus> george = new DriverD<>("George", 5);
        DriverD<Bus> joye = new DriverD<>("Joye", 5);
    }
}