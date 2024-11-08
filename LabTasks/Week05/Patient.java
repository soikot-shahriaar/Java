/* Task 01
Implement the design of the Patient class so that the following output is produced. 
Hint: For BMI, the formula is BMI = weight/height^2, where weight is in kg and height in meters.

Output:
Name: A
Age: 55
Weight: 63.0
Height: 158.0
BMI: 0.002523634033007531
====================     
Name: B
Age: 53
Weight: 61.0
Height: 149.0
BMI: 0.002747623980901761
*/

public class Patient {

    public String name;
    public int age;
    public double weight, height;

    public Patient(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printDetails() {

        double bmi = weight / (height * height);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Height: " + this.height);
        System.out.println("BMI: " + bmi);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("A", 55, 63.0, 158.0);
        p1.printDetails();
        System.out.println("====================");
        Patient p2 = new Patient("B", 53, 61.0, 149.0);
        p2.printDetails();
    }
}
