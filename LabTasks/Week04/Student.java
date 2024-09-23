/* Task 04
Write the Student class to calculate and print quiz scores with constructor and method overloading.

Driver Code:
Student s1 = new Student(); 
s1.quizcalc(10); 
System.out.println("--------------------------------"); 
s1.printDetail(); 
Student s2 = new Student("Harry"); 
s2.quizcalc(10, 8); 
System.out.println("--------------------------------"); 
s2.printDetail(); 
Student s3 = new Student("Hermione"); 
s3.quizcalc(10, 9, 10); 
System.out.println("--------------------------------"); 
s3.printDetail();

Output:
--------------------------------
Hello default student
Your average quiz score is 3.3333333333333335 
--------------------------------
Hello Harry
Your average quiz score is 6.0
--------------------------------
Hello Hermione
Your average quiz score is 9.666666666666666
 */

public class Student {

    String name;
    double averageScore;

    public Student() {
        this.name = "default student";
        this.averageScore = 0.0;
    }

    public Student(String name) {
        this.name = name;
        this.averageScore = 0.0;
    }

    public void quizcalc(double score1) {
        this.averageScore = score1 / 3;
    }

    public void quizcalc(double score1, double score2) {
        this.averageScore = (score1 + score2) / 3;
    }

    public void quizcalc(double score1, double score2, double score3) {
        this.averageScore = (score1 + score2 + score3) / 3;
    }

    public void printDetail() {
        System.out.println("Hello " + this.name);
        System.out.println("Your average quiz score is " + this.averageScore);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.quizcalc(10);
        System.out.println("--------------------------------");
        s1.printDetail();

        Student s2 = new Student("Harry");
        s2.quizcalc(10, 8);
        System.out.println("--------------------------------");
        s2.printDetail();

        Student s3 = new Student("Hermione");
        s3.quizcalc(10, 9, 10);
        System.out.println("--------------------------------");
        s3.printDetail();
    }
}
