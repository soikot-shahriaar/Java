package mainpackage;

public class MainClass {

    // Public variable: accessible from anywhere
    public String PublicVariable = "I am public";

    // Private variable: accessible only within this class
    private String PrivateVariable = "I am private";

    // Default (package-private) variable: accessible within the same package
    String DefaultVariable = "I am default (package-private)";

    // Protected variable: accessible within the same package and by subclasses
    protected String ProtectedVariable = "I am protected";

    // Public method: accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Private method: accessible only within this class
    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Default (package-private) method: accessible within the same package
    void defaultMethod() {
        System.out.println("Default (package-private) method called");
    }

    // Protected method: accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void showAccess() {
        // All variables and methods are accessible within the same class
        System.out.println(PublicVariable);
        System.out.println(PrivateVariable);
        System.out.println(DefaultVariable);
        System.out.println(ProtectedVariable);

        publicMethod();
        privateMethod();
        defaultMethod();
        protectedMethod();
    }
}
