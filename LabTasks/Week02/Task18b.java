// Create a function that calculates and returns the area of a circle given its radius

class Task18b {

    public static void main(String[] args) {

        double radius = 6.0;
        double area = calculateAreaOfCircle(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
