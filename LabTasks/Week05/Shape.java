/* Task 02
Design a class Shape for the given code below. 
• Write a class Shape. 
• Write the required constructor that takes 3 parameters and initialize the instance variables accordingly. 
• Write a method area() that prints the area. 

Hint: the area method can calculate only for the shapes: Triangle, Rectangle, Rhombus, and Square. 
So, you have to use conditions inside this method For this task, assume that 
- for a triangle, the arguments passed are the base and height 
- for a rhombus, the arguments passed are the diagonals 
- for a square or rectangle, the arguments passed are the sides.

Output:
Area: 125.0
==========================
Area: 100.0
==========================
Area: 225.0
==========================
Area: 450.0
==========================
Area: Shape unknown  
*/

public class Shape {

    String name;
    float a, b;

    public Shape(String name, float a, float b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void area() {
        if (name == "Triangle") {
            System.out.println("Area: " + (a * b) / 2);
        } else if (name == "Square") {
            System.out.println("Area: " + (a * a));
        } else if (name == "Rectangle") {
            System.out.println("Area: " + (a * b));
        } else if (name == "Rhombus") {
            System.out.println("Area: " + (a * b) / 2);
        } else {
            System.out.println("Area: Shape unknown");
        }
    }

    public static void main(String[] args) {
        Shape triangle = new Shape("Triangle", 10, 25);
        triangle.area();
        System.out.println("==========================");
        Shape square = new Shape("Square", 10, 10);
        square.area();
        System.out.println("==========================");
        Shape rhombus = new Shape("Rhombus", 18, 25);
        rhombus.area();
        System.out.println("==========================");
        Shape rectangle = new Shape("Rectangle", 15, 30);
        rectangle.area();
        System.out.println("==========================");
        Shape trapezium = new Shape("Trapezium", 15, 30);
        trapezium.area();
    }
}
