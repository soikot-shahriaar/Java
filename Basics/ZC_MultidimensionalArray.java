
public class ZC_MultidimensionalArray {

    public static void main(String[] args) {

        // Declaring a 2-D Array
        int[][] flats;

        // Allocating memory for the 2-D array (2 rows and 3 columns)
        flats = new int[2][3];

        // Initializing the 2-D array
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array using nested for loops
        System.out.println("Printing a 2-D array:");
        for (int[] flat : flats) {
            for (int j = 0; j < flat.length; j++) {
                System.out.print(flat[j] + " ");
            }
            System.out.println(); // New line for the next row
        }
    }
}
