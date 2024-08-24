// Example of how to define a class, create objects from that class, set their attributes, and call their methods in Java.

// Class // Blueprint for creating objects // User defined datatype 
class Student {

    // Fields to store the student's info
    int rollNo;
    String name;
    double percentage;

    // Method to print the details of the student
    public void printDetails() {
        System.out.print("Roll No: " + rollNo);
        System.out.println(", Name: " + name);
    }

    // Method to return the obtained percentage of the student
    public double getPercentage() {
        return percentage;
    }
}

public class B_ClassObject {

    public static void main(String[] args) {
        // Initialization  // Create new object
        Student alice = new Student();
        Student john = new Student();
        Student bob = new Student();

        // Declaration  // Set the attributes for object
        alice.rollNo = 101;
        alice.name = "Alice Johnson";
        alice.percentage = 89.5;

        bob.rollNo = 103;
        bob.name = "Bob Smith";
        bob.percentage = 76.3;

        // Print the details using method
        alice.printDetails();
        john.printDetails(); // Print default values
        bob.printDetails();

        // Get the percentage of bob using method 
        double percentage = bob.getPercentage();
        System.out.println("Bob's Obtained Percentage: " + percentage + "%");

        // Modification
        bob.name = "Bob Blinders";
        System.out.println("After Modification:");
        bob.printDetails();

        // Demonstrate that classes are passed by reference
        modifyStudent(bob);

        // Get and print bob's updated percentage
        double updatedPercentage = bob.getPercentage();
        System.out.println("Bob's Modified Obtained Percentage: " + updatedPercentage + "%");
    }

    // Method to modify the student object
    public static void modifyStudent(Student student) {
        student.percentage = 82.0;
    }
}

/*
Class:  The class is a user-defined datatype that serves as a blueprint for creating objects. 
        It defines the structure and behavior (attributes and methods) that the objects will have.
        In this code, Student is the class. 
        It contains the fields (rollNo, name, percentage) and methods (printDetails(), getPercentage()) that describe what a Student is and what it can do.

Object: An object is an instance of a class. 
        It represents a specific example of the class, with actual values assigned to the fields.
        In this code, alice and bob are the objects. 
        They are instances of the Student class, each with their own roll number, name, and percentage.
 */
