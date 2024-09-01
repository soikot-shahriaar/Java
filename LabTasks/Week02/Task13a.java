// Write a for loop that prints all numbers from 1 to 10 except 4 and 7

class Task13a {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
