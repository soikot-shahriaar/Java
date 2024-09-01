// Write a function that takes a string and an integer (name and age) and prints a greeting message.

class Task19a {

    public static void main(String[] args) {

        String name = "Shahriar";
        int age = 24;

        printGreeting(name, age);
    }

    public static void printGreeting(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
