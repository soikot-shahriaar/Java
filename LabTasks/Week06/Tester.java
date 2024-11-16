public class Tester {
    
    public static void main(String[] args) {
        Vehicle myCar = new Car("Sedan", 50.0, 5);
        Vehicle myMotorcycle = new Motorcycle("Sport", 30.0, false);

        System.out.println("Car Rental Cost for 3 days: $" + myCar.calculateRental(3));
        System.out.println("Motorcycle Rental Cost for 3 days: $" + myMotorcycle.calculateRental(3));

        System.out.println("Car Details: " + myCar);
        System.out.println("Motorcycle Details: " + myMotorcycle);
    }
}
