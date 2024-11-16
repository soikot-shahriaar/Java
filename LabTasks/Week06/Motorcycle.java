public class Motorcycle extends Vehicle implements Rental {
    boolean hasSidecar;

    public Motorcycle(String name, double baseRate, boolean hasSidecar) {
        super(name, baseRate);
        this.hasSidecar = hasSidecar;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }

    public String toString() {
        return "Motorcycle{name='" + name + "', baseRate=" + baseRate + ", hasSidecar=" + hasSidecar + "}";
    }

    public void display() {
        System.out.println("Motorcycle");
    }
}
