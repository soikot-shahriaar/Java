
public class ZB_ForEachLoop {

    public static void main(String[] args) {

        int[] marks = {11, 22, 33, 44, 55};

        // Displaying the Array using a for loop
        System.out.println("Printing using for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Displaying the Array in reverse order using a for loop
        System.out.println("Printing using for loop in reverse order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Displaying the Array using a for-each loop
        System.out.println("Printing using for-each loop:");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
