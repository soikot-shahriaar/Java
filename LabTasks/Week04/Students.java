/* Task 05
Design the Students class in such a way so that the following code provides the expected output. 

1. Write the constructor with appropriate default value for arguments. 
2. Write the dailyEffort() method with appropriate arguments. 
3. Write the System.out.printlnDetails() method. 
For System.out.println the following suggestions check the following instructions. 
    * If hour <= 2 System.out.println 'Suggestion: Should give more effort!' 
    * If hour <= 4 System.out.println 'Suggestion: Keep up the good work!' 
    * Else System.out.println 'Suggestion: Excellent! Now motivate others.' 
 */

public class Students {

    String name;
    int id;
    String department;
    int hours;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "CSE";
    }

    public Students(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void dailyEffort(int hours) {
        this.hours = hours;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Daily Effort: " + hours + " hour(s)");

        if (hours <= 2) {
            System.out.println("Suggestion: Should give more effort!");
        } else if (hours <= 4) {
            System.out.println("Suggestion: Keep up the good work!");
        } else {
            System.out.println("Suggestion: Excellent! Now motivate others.");
        }
    }

    public static void main(String[] args) {
        
        Students harry = new Students("Harry Potter", 123);
        harry.dailyEffort(3);
        harry.printDetails();
        System.out.println("========================");

        Students john = new Students("John Wick", 456, "BBA");
        john.dailyEffort(2);
        john.printDetails();
        System.out.println("========================");

        Students naruto = new Students("Naruto Uzumaki", 777, "Ninja");
        naruto.dailyEffort(6);
        naruto.printDetails();
    }
}
