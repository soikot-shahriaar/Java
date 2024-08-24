/* Getters and setters are methods used to access and modify the private fields of a class in a controlled way. They provide a way to enforce encapsulation, which is a core principle of object-oriented programming. Here's a breakdown:

*** Getters ***
A getter method is used to retrieve the value of a private field.
It typically has a public access modifier so that it can be accessed from outside the class.
The method name usually starts with "get" followed by the name of the variable with the first letter capitalized.

*** Setters ***
A setter method is used to set or update the value of a private field.
It also typically has a public access modifier.
The method name usually starts with "set" followed by the name of the variable with the first letter capitalized.
Setters often include validation to control the value being set.
 */

class Person {

    // Private fields
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        if (name != null && !name.isEmpty()) { // Validation
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class D_GettersSetters {

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person();

        // Using setters to modify private fields
        person.setName("Alice");
        person.setAge(30);

        // Using getters to access private fields
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set invalid values
        person.setName("");   // Invalid name
        person.setAge(-5);    // Invalid age
    }
}
