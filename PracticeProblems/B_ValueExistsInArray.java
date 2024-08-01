// Practice Problem: Check if a specific float value exists in an array.

public class B_ValueExistsInArray {

    public static void main(String[] args) {
        
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
