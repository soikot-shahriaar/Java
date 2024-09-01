// Create a while loop that prints numbers from 1 to 10 but skips numbers divisible by 5

class Task13b {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            if (i % 5 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
