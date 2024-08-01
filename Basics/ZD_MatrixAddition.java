//  Program to add two 2x3 matrices

public class ZD_MatrixAddition {

    public static void main(String[] args) {

        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] mat2 = {
            {2, 6, 13},
            {3, 7, 1}
        };
        int[][] result = new int[2][3];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("The result of the matrix addition is:");
        for (int[] result1 : result) {
            for (int j = 0; j < result1.length; j++) {
                System.out.print(result1[j] + " ");
            }
            System.out.println();
        }
    }
}
