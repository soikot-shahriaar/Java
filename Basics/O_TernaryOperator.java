/*
The ternary (conditional) operator in Java is a shorthand way to write simple if-else statements. 
Syntax:  result = (condition) ? value1 : value2;
 */

public class O_TernaryOperator {

    public static void main(String[] args) {

        int number = 15;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is: " + result);
    }
}
