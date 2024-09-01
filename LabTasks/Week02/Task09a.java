// Write a program that checks the age and height of a person to determine if they can ride a roller coaster.

class Task09a {

    public static void main(String[] args) {
        int age = 12;
        int height = 140; // height in cm

        if (age >= 10 && height >= 120) {
            System.out.println("You can ride the roller coaster.");
        } else {
            System.out.println("Sorry! you can not ride the roller coaster.");
        }
    }
}
