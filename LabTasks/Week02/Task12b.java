// Create a for loop that prints numbers from 1 to 10, but stops when it reaches 6

class Task12b {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}
