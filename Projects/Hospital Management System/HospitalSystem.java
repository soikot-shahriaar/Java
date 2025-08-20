import java.util.*;

public class HospitalSystem {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);
        if (patient.getAssignedDoctor() != null) {
            patient.getAssignedDoctor().addPatient(patient);
        }
    }

    public List<Staff> getStaff() {
        return staffMembers;
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available!");
        } else {
            for (Doctor doctor : doctors) {
                doctor.displayDetails();
            }
        }
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available!");
        } else {
            for (Patient patient : patients) {
                patient.displayDetails();
            }
        }
    }

    public void displayAllStaff() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff available!");
        } else {
            for (Staff staff : staffMembers) {
                staff.displayDetails();
            }
        }
    }

    public void displayAllRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available!");
        } else {
            for (Room room : rooms) {
                room.displayDetails();
            }
        }
    }

    public Doctor getDoctorById(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                return doctor;
            }
        }
        System.out.println("Doctor ID " + doctorId + " not found!");
        return null;
    }

    public Patient getPatientById(String patientId) {
        for (Patient patient : patients) {
            if (patient.getId().equals(patientId)) {
                return patient;
            }
        }
        System.out.println("Patient ID " + patientId + " not found!");
        return null;
    }

    public Staff getStaffById(String staffId) {
        for (Staff staff : staffMembers) {
            if (staff.getId().equals(staffId)) {
                return staff;
            }
        }
        System.out.println("Staff ID " + staffId + " not found!");
        return null;
    }

    public Room getRoomById(String roomId) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomId)) {
                return room;
            }
        }
        System.out.println("Room No." + roomId + "not found.");
        return null;
    }
}
