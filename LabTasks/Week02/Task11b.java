// Create a while loop that finds the greatest common divisor (GCD) of two numbers

class Task11b {

    public static void main(String[] args) {
        
        int a = 56;
        int b = 98;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("The GCD is " + a);
    }
}
