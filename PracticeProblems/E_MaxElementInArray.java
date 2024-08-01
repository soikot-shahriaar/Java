// Practice Problem: Find the Maximum Element in an Array

public class E_MaxElementInArray {

    public static void main(String[] args) {
        
        int[] arr = {9, 11, 333, 55, 2222, 666, 77};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}
