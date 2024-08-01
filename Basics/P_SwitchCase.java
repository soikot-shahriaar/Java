// Use of the switch statement with a String variable to print different messages based on the value of the variable.

public class P_SwitchCase {

    public static void main(String[] args) {
        
        String person = "Alice";

        switch (person) {
            case "Alice" ->
                System.out.println("Hello Alice!");
            case "Bob" ->
                System.out.println("Hello Bob!");
            case "Charlie" ->
                System.out.println("Hello Charlie!");
            default ->
                System.out.println("Hello Stranger!");
        }
        System.out.println("Have a great day!");
    }
}
