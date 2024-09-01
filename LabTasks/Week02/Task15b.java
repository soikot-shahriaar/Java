// Write a program that initializes an array of characters (a string) and changes a specific character, then prints the original and modified string.

class Task15b {

    public static void main(String[] args) {

        char[] original = {'s', 'o', 'i', 'k', 'o', 't'};
        String originalString = new String(original);

        System.out.println("Original string: " + originalString);

        original[1] = 'a';
        String modifiedString = new String(original);

        System.out.println("Modified string: " + modifiedString);
    }
}
