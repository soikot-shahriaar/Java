import java.util.*;

public class Doctor extends Person {
    private String specialty;
    private List<Patient> patients;

    public Doctor(String id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> listPatients() {
        return patients;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor [ID: " + getId() + ", Name: " + getName() +
                ", Specialty: " + specialty + ", Total Patients: " + patients.size() + "]");
    }

    @Override
    public String toString() {
        return getName() + " (" + specialty + ")";
    }
}
