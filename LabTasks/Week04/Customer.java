/* Task 01
Write a class called Customer with the required constructor and methods to get the following output. 

1. Create a class called Customer. 
2. Create the required constructor. 
3. Create a method called greet that works if no arguments are passed or if one argument is passed.
4. Create a method called purchase that can take as many arguments as the user 
wants to give. 
 */

public class Customer {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    public void purchase(String n1, String n2, String n3) {
        System.out.println(name + ", you purchased 3 item(s): " + "\n" + n1 + "\n" + n2 + "\n" + n3);
    }

    public void purchase(String n1) {
        System.out.println(name + ", you purchased 1 item(s): " + "\n" + n1);
    }

    public static void main(String[] args) {
        Customer customer_1 = new Customer("Sam");
        customer_1.greet();
        customer_1.purchase("chips", "chocolate", "orange juice");
        System.out.println("-----------------------------");
        Customer customer_2 = new Customer("David");
        customer_2.greet("David");
        customer_2.purchase("orange juice");
    }

    public String getName() {
        return name;
    }
}
