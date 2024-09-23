/* Task 03
Analyze the given code below to write Cat class to get the output as shown. 

Cat c1 = new Cat()
Cat c2 = new Cat("Black")
Cat c3 = new Cat("Brown", "jumping")
Cat c4 = new Cat("Red", "purring")
c1.print()
c2.print()
c3.print()
c4.print()
c1.changeColor("Blue")
c3.changeColor("Purple")
c1.print()
c3.print()

Output:
White cat is sitting 
Black cat is sitting 
Brown cat is jumping 
Red cat is purring 
Blue cat is sitting 
Purple cat is jumping 

Hint: Remember, the constructor is a special method. Here, you have to 
deal with constructor overloading which is similar to method overloading. 
*/

public class Cat {

    String color;
    String action;

    public Cat(String color, String action) {
        this.color = color;
        this.action = action;
    }

    public Cat() {
        this.color = "White";
        this.action = "sitting";
    }

    public Cat(String color) {
        this.color = color;
        this.action = "sitting";
    }

    public void print() {
        System.out.println(color + " cat is " + action);
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown", "jumping");
        Cat c4 = new Cat("Red", "purring");

        c1.print();
        c2.print();
        c3.print();
        c4.print();

        c1.changeColor("Blue");
        c3.changeColor("Purple");

        c1.print();
        c3.print();  
    }
}
 