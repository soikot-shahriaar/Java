public class Car extends Vehicle implements Rental {
    int seatCapacity;

    public Car(String name, double baseRate, int seatCapacity) {
        super(name, baseRate);
        this.seatCapacity = seatCapacity;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }

    public String toString() {
        return "Car{name='" + name + "', baseRate=" + baseRate + ", seatCapcity=" + seatCapacity + "}";
    }

    public void display() {
        System.out.println("Car");
    }
}
