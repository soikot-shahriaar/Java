/* Task 04
Design the Programmer class in such a way so that the following code provides the expected output:

Hint: Write the constructor with appropriate printing and multiple arguments. 
Write the addExp() method with appropriate printing and argument. Write the printDetails() method also.

Output:
Horray! A new Programmer is born
Name: Ethen Hunt
Language: Java
Experience: 10 years.
--------------------------      
Horray! A new Programmer is born
Name: James Bond
Language: C++
Experience: 7 years.
--------------------------      
Horray! A new Programmer is born
Name: Jon Snow
Language: Python
Experience: 4 years.
Updating experience of Jon Snow
Name: Jon Snow
Language: Python
Experience: 9 years.
*/

public class Programmer {
    String name;
    String lang;
    int year;

    public Programmer(String name, String lang, int year) {
        this.name = name;
        this.lang = lang;
        this.year = year;
        System.out.println("Horray! A new Programmer is born");
    }

    public void printDetails() {

        System.out.println("Name: " + name);
        System.out.println("Language: " + lang);
        System.out.println("Experience: " + year + " years.");
    }

    public void addExp(int years) {
        year += years;
        System.out.println("Updating experience of Jon Snow");

    }

    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ethen Hunt", "Java", 10);
        p1.printDetails();
        System.out.println("--------------------------");
        Programmer p2 = new Programmer("James Bond", "C++", 7);
        p2.printDetails();
        System.out.println("--------------------------");
        Programmer p3 = new Programmer("Jon Snow", "Python", 4);
        p3.printDetails();
        p3.addExp(5);
        p3.printDetails();
    }
}
