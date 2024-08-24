package subpackage;

import mainpackage.MainClass;

public class SubClass extends MainClass {
    public void testAccess() {
        // Accessing inherited members from MainClass
        System.out.println(PublicVariable); // Accessible: Public
        // System.out.println(PrivateVariable); // Not accessible: Private
        // System.out.println(DefaultVariable); // Not accessible: Default (package-private)
        System.out.println(ProtectedVariable); // Accessible: Protected (inherited)
        
        publicMethod(); // Accessible: Public
        // privateMethod(); // Not accessible: Private
        // defaultMethod(); // Not accessible: Default (package-private)
        protectedMethod(); // Accessible: Protected (inherited)
    }
}
