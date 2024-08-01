// Practice Problem: Calculate the average of all elements in a float array.

public class C_AverageOfArray {

    public static void main(String[] args) {
        
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        float average = sum / marks.length;
        System.out.println("The average of the elements is: " + average);
    }
}
