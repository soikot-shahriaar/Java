// Practice Problem: Calculate the sum of all elements in an array.

public class A_SumOfArray {

    public static void main(String[] args) {

        int[] numbers = {44, 777, 66, 99, 1111};

        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println("The sum of all the elements is: " + sum);
    }
}
