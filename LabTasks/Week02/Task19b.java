// Create a function that takes two float parameters (base and height) and calculates the area of a triangle.

class Task19b {

    public static void main(String[] args) {

        float base = 10.0f;
        float height = 5.0f;

        float area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }

    public static float calculateTriangleArea(float base, float height) {
        return (base * height) / 2;
    }
}
