// Create a program that determines shipping cost based on weight and distance: less than 5 kg, more than 5 kg but less than 20 kg, and more than 20 kg.

class Task09b {

    public static void main(String[] args) {
        double weight = 15.0; // weight in kg
        int distance = 100; // distance in km
        double cost;

        if (weight < 5) {
            cost = distance * 0.5;
        } else if (weight >= 5 && weight < 20) {
            cost = distance * 1.0;
        } else {
            cost = distance * 1.5;
        }

        System.out.println("The shipping cost is: $" + cost);
    }
}
