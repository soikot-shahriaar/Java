
public class M_StringMethods {

    public static void main(String[] args) {
        
        String name = "Soikot Shahriar";

        // 1. length()
        System.out.println("Length: " + name.length());

        // 2. toLowerCase()
        System.out.println("Lowercase: " + name.toLowerCase());

        // 3. toUpperCase()
        System.out.println("Uppercase: " + name.toUpperCase());

        // 4. trim() (note: no leading/trailing spaces in the original string, adding some for demonstration)
        String nameWithSpaces = "  Soikot Shahriar  ";
        System.out.println("Trimmed: '" + nameWithSpaces.trim() + "'");

        // 5. substring(int start)
        System.out.println("Substring from index 7: " + name.substring(7));

        // 6. substring(int start, int end)
        System.out.println("Substring from index 7 to 13: " + name.substring(7, 13));

        // 7. replace('r', 'p')
        System.out.println("Replace 'r' with 'p': " + name.replace('r', 'X'));

        // 8. startsWith("So")
        System.out.println("Starts with 'So': " + name.startsWith("So"));

        // 9. endsWith("ar")
        System.out.println("Ends with 'ar': " + name.endsWith("ar"));

        // 10. charAt(2)
        System.out.println("Character at index 2: " + name.charAt(2));

        // 11. indexOf("S")
        System.out.println("Index of 'S': " + name.indexOf("S"));

        // 12. lastIndexOf("a")
        System.out.println("Last index of 'a': " + name.lastIndexOf("a"));

        // 13. equals("Soikot Shahriar")
        System.out.println("Equals 'Soikot Shahriar': " + name.equals("Soikot Shahriar"));

        // 14. equalsIgnoreCase("soikot shahriar")
        System.out.println("Equals ignoring case 'soikot shahriar': " + name.equalsIgnoreCase("soikot shahriar"));
    }
}

/*
1. length() - Returns the length of the string.
2. toLowerCase() - Converts the string to lowercase.
3. toUpperCase() - Converts the string to uppercase.
4. trim() - Removes leading and trailing spaces.
5. substring(int start) - Returns the substring starting from the specified index to the end.
6. substring(int start, int end) - Returns the substring from the start index to the end index (end index is exclusive).
7. replace('r', 'p') - Replaces all occurrences of 'r' with 'p'.
8. startsWith("So") - Checks if the string starts with the specified prefix.
9. endsWith("ar") - Checks if the string ends with the specified suffix.
10. charAt(int index) - Returns the character at the specified index.
11. indexOf("S") - Returns the index of the first occurrence of the specified character.
12. lastIndexOf("a") - Returns the index of the last occurrence of the specified character.
13. equals("Soikot Shahriar") - Checks if the string is equal to the specified string (case-sensitive).
14. equalsIgnoreCase("soikot shahriar") - Checks if the string is equal to the specified string, ignoring case differences.
 */
