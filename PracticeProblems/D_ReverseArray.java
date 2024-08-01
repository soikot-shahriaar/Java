// Practice Problem: Reverse the elements of an Array

public class D_ReverseArray {

    public static void main(String[] args) {
        
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        System.out.print("The reversed array is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
