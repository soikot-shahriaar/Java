import java.util.*;

public class Room {
    private String roomNumber;
    private String roomType;
    private double dailyRate;
    private List<Patient> patients;

    public Room(String roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.patients = new ArrayList<>();
    }

    public String getId() {
        return roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void displayDetails() {
        System.out.println("Room [Number: " + roomNumber + ", Type: " + roomType + ", Rate: $" + dailyRate + "/day]");
    }

    @Override
    public String toString() {
        return roomNumber + " (" + roomType + "), Rate: $" + dailyRate + "/day]";
    }
}
