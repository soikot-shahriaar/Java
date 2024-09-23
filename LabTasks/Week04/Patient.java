/* Task 06
Implement the design of the Patient class so that the following output is produced: 

Patient p1 = new Patient("Thomas", 23); 
p1.addSymptom("Headache"); 
Patient p2 = new Patient("Carol", 20); 
p2.addSymptom("Vomiting", "Coughing"); 
Patient p3 = new Patient("Mike", 25); 
p3.addSymptom("Fever", "Headache", "Coughing"); 
System.out.println("=========================");
p1.printPatientDetail(); 
System.out.println("========================="); 
p2.printPatientDetail(); 
System.out.println("========================="); 
p3.printPatientDetail(); 
 */

public class Patient {

    String name;
    int age;
    String symptoms;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.symptoms = "";
    }

    public void addSymptom(String symptom1) {
        this.symptoms = symptom1;
    }

    public void addSymptom(String symptom1, String symptom2) {
        this.symptoms = symptom1 + ", " + symptom2;
    }

    public void addSymptom(String symptom1, String symptom2, String symptom3) {
        this.symptoms = symptom1 + ", " + symptom2 + ", " + symptom3;
    }

    public void printPatientDetail() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Symptoms: " + symptoms);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("Thomas", 23);
        p1.addSymptom("Headache");
        Patient p2 = new Patient("Carol", 20);
        p2.addSymptom("Vomiting", "Coughing");
        Patient p3 = new Patient("Mike", 25);
        p3.addSymptom("Fever", "Headache", "Coughing");

        System.out.println("=========================");
        p1.printPatientDetail();
        System.out.println("=========================");
        p2.printPatientDetail();
        System.out.println("=========================");
        p3.printPatientDetail();
    }
}
