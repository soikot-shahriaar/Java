/* A constructor is a special type of method that is automatically called when an instance (object) of a class is created. 
They have the same name as the class and no return type. Its main purpose is to initialize the newly created object.
Constructors are called when an object is created using the 'new' keyword.
They can be parameterized to allow for initializing fields with specific values or be non-parameterized to provide default values. 

*** Default Constructor ***
The default constructor is not explicitly defined in the code. 
However, if we remove all constructors, Java will automatically provide a default constructor. 
Here, we simulate it by providing a constructor that initializes the object with default values.

*** Parameterized Constructor ***
The Person(String name, int age) constructor allows we to create an object with specific values for name and age.

*** Copy Constructor ***
The Person(Person other) constructor creates a new object by copying the values from another Person object. 
It’s useful when we need to duplicate an object.

*** No-Argument Constructor ***
The Person(String name) constructor allows we to create an object with only the name specified, and it defaults the age to 0.

*** Constructor Overloading ***
Overloading is shown by having multiple constructors with different parameter lists (Person(), Person(String name, int age), Person(Person other), and Person(String name)).

*** Constructor Chaining ***
Chaining occurs when one constructor calls another constructor using the this() keyword. 
This helps to reuse code and avoid duplication. For example, the no-argument constructor calls the parameterized constructor.

*** this() keyword ***
this is a reference to the current object.
It is used to differentiate between instance variables and parameters with the same name.
It allows for constructor chaining.
It can be used to pass the current object as an argument or return it from a method.
 */

class Person {

    private String name;
    private int age;

    // Default Constructor (provided by Java if no other constructors are defined)
    public Person() {
        this("Unknown", 0); // Chaining to the parameterized constructor
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor called");
    }

    // No-Argument Constructor
    public Person(String name) {
        this(name, 0); // Chaining to the parameterized constructor
        System.out.println("No-Argument Constructor called");
    }

    // Display method to show the object's state
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class E_Constructors {

    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.display(); // Output: Name: Unknown, Age: 0

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.display(); // Output: Name: Alice, Age: 25

        // Using No-Argument Constructor
        Person person3 = new Person("Bob");
        person3.display(); // Output: Name: Bob, Age: 0

        // Using Copy Constructor
        Person person4 = new Person(person2);
        person4.display(); // Output: Name: Alice, Age: 25

        // Overloading Constructor with different parameters
        Person person5 = new Person("Charlie", 30);
        person5.display(); // Output: Name: Charlie, Age: 30
    }
}
