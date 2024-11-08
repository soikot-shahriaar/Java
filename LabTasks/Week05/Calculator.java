/* Task 03
Implement the design of the Calculator class so that the following output is produced:

Output:
Calculator is ready!
==================   
Returned value: 30.0 
10.0 + 20.0 = 30.0   
==================   
Returned value: 20.0 
30.0 - 10.0 = 20.0   
==================   
Returned value: 100.0
20.0 * 5.0 = 100.0   
==================   
Returned value: 6.25
100.0 / 16.0 = 6.25
*/

public class Calculator {
    double x, y, z;
    char c;

    public Calculator() {
        System.out.println("Calculator is ready!");
    }

    public double calculate(double x, double y, char c) {
        this.x = x;
        this.y = y;
        this.c = c;

        if (c == '+') {
            return z = x + y;
        }
        if (c == '-') {
            return z = x - y;
        }
        if (c == '*') {
            return z = x * y;
        }
        if (c == '/') {
            return z = x / y;
        }
        return z;
    }

    public void showCalculation() {
        if (c == '+') {
            z = x + y;
            System.out.println(x + " + " + y + " = " + z);
        }
        if (c == '-') {
            z = x - y;
            System.out.println(x + " - " + y + " = " + z);
        }
        if (c == '*') {
            z = x * y;
            System.out.println(x + " * " + y + " = " + z);
        }
        if (c == '/') {
            z = x / y;
            System.out.println(x + " / " + y + " = " + z);
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("==================");
        double val = c1.calculate(10, 20, '+');
        System.out.println("Returned value: " + val);
        c1.showCalculation();

        System.out.println("==================");
        val = c1.calculate(val, 10, '-');
        System.out.println("Returned value: " + val);
        c1.showCalculation();

        System.out.println("==================");
        val = c1.calculate(val, 5, '*');
        System.out.println("Returned value: " + val);
        c1.showCalculation();

        System.out.println("==================");
        val = c1.calculate(val, 16, '/');
        System.out.println("Returned value: " + val);
        c1.showCalculation();
    }
}

