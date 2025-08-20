public class Patient extends Person {
    private int age;
    private String phoneNumber;
    private String address;
    private String gender;
    private String disease;
    private Doctor assignedDoctor;
    private Room room;
    private int daysAdmitted;

    public Patient(String id, String name, int age, String phoneNumber, String address, String gender, String disease,
            Doctor assignedDoctor, Room room, int daysAdmitted) {

        super(id, name);
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.disease = disease;
        this.assignedDoctor = assignedDoctor;
        this.room = room;
        this.daysAdmitted = daysAdmitted;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double calculateBill() {
        if (room == null) {
            System.out.println("No room assigned! Could not calculate the bill.");
            return 0.0;
        }
        return daysAdmitted * room.getDailyRate();
    }

    @Override
    public void displayDetails() {
        System.out.println("\nPatient Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor: " + assignedDoctor);
        System.out.println("Room: " + room);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Total Bill: $" + calculateBill());
    }
}
