package mainpackage;

import subpackage.SubClass;

public class Main {
    public static void main(String[] args) {
        MainClass mainObj = new MainClass();
        SubClass subObj = new SubClass();
        
        // Accessing members of MainClass using its object
        System.out.println(mainObj.PublicVariable); // Accessible: Public
        // System.out.println(mainObj.PrivateVariable); // Not accessible: Private
        System.out.println(mainObj.DefaultVariable); // Accessible: Default (package-private)
        // System.out.println(mainObj.ProtectedVariable); // Accessible: Protected (within the same package)
        
        mainObj.publicMethod(); // Accessible: Public
        // mainObj.privateMethod(); // Not accessible: Private
        mainObj.defaultMethod(); // Accessible: Default (package-private)
        // mainObj.protectedMethod(); // Accessible: Protected (within the same package)
        
        // Accessing members of MainClass through SubClass
        subObj.testAccess();
    }
}
