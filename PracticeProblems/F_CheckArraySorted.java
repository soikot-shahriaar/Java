// Practice Problem: Check if the Array is Sorted in ascending order.

public class F_CheckArraySorted {

    public static void main(String[] args) {

        boolean isSorted = true;
        int[] arr = {11, 22, 333, 44, 55, 33, 666};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }
}
