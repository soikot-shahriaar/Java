abstract class Vehicle {
    String name;
    double baseRate;

    public Vehicle(String name, double baseRate) {
        this.name = name;
        this.baseRate = baseRate;
    }

    public abstract void display();

    public double calculateRental(int i) {
        return i;
    }
}
