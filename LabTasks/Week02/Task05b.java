// Create a double variable with a fractional part and cast it to an int, displaying the original and casted values.

class Task05b {

    public static void main(String[] args) {

        double fractionalNum = 100.57;
        int wholeNum = (int) fractionalNum;

        System.out.println("Orginal value: " + fractionalNum);
        System.out.println("Casted value: " + (fractionalNum - wholeNum));
    }
}
