import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalSystem hospital = new HospitalSystem();

        hospital.addDoctor(new Doctor("D001", "Dr. Anika Tasnim", "Medicine Specialist"));
        hospital.addDoctor(new Doctor("D002", "Dr. Shahriar Hasan", "Cardiology"));
        hospital.addDoctor(new Doctor("D003", "Dr. Abhi Debnath", "General Surgery"));
        hospital.addDoctor(new Doctor("D004", "Dr. Sabrina Mim", "Psychiatry"));
        hospital.addDoctor(new Doctor("D005", "Dr. Fahim Khan", "Pediatrics"));
        hospital.addDoctor(new Doctor("D006", "Dr. Maria Rahman", "Orthopedics"));
        hospital.addDoctor(new Doctor("D007", "Dr. Nusrat Jahan", "Dermatology"));
        hospital.addDoctor(new Doctor("D008", "Dr. Tanvir Ahmed", "Oncology"));
        hospital.addDoctor(new Doctor("D009", "Dr. Sejuti Khan", "Endocrinology"));
        hospital.addDoctor(new Doctor("D010", "Dr. Arif Hossain", "Pulmonology"));

        hospital.addStaff(new Staff("S001", "Rahim", "Cleaner"));
        hospital.addStaff(new Staff("S002", "Karim", "Nurse"));
        hospital.addStaff(new Staff("S003", "Salam", "Ward Boy"));
        hospital.addStaff(new Staff("S004", "Jamil", "Receptionist"));
        hospital.addStaff(new Staff("S005", "Anwar", "Security Guard"));
        hospital.addStaff(new Staff("S006", "Sadia", "Lab Technician"));
        hospital.addStaff(new Staff("S007", "Mokhles", "Pharmacist"));
        hospital.addStaff(new Staff("S008", "Nasrin", "Lab Assistant"));
        hospital.addStaff(new Staff("S009", "Aslam", "Electrician"));
        hospital.addStaff(new Staff("S010", "Shahana", "Dietitian"));

        hospital.addRoom(new Room("R001", "General Ward", 20.0));
        hospital.addRoom(new Room("R002", "General Ward (Cabin)", 30.0));
        hospital.addRoom(new Room("R003", "General Ward (VIP)", 60.0));
        hospital.addRoom(new Room("R004", "ICU", 300.0));
        hospital.addRoom(new Room("R005", "Operation Theater", 200.0));
        hospital.addRoom(new Room("R006", "Maternity Ward", 150.0));
        hospital.addRoom(new Room("R007", "Pediatric Ward", 120.0));
        hospital.addRoom(new Room("R008", "Emergency Room", 250.0));
        hospital.addRoom(new Room("R009", "Cardiology Department", 220.0));
        hospital.addRoom(new Room("R010", "Oncology Ward", 300.0));

        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("\n======================================");
            System.out.println("|     HOSPITAL MANAGEMENT SYSTEM     |");
            System.out.println("======================================");
            System.out.println("|        [1] - Patient Menu          |");
            System.out.println("|        [2] - Doctor Menu           |");
            System.out.println("|        [3] - Admin Menu            |");
            System.out.println("|        [4] - Exit                  |");
            System.out.println("======================================");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patientMenu(scanner, hospital);
                    break;
                case 2:
                    doctorMenu(scanner, hospital);
                    break;
                case 3:
                    adminMenu(scanner, hospital);
                    break;
                case 4:
                    mainMenu = false;
                    System.out.println("\nThanks for using our system. Stay Healthy!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
        scanner.close();
    }

    private static void patientMenu(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("Enter Patient ID (P***): ");
            String patientId = scanner.next();
            ExceptionMethod.validPatientId(patientId);

            Patient patient = hospital.getPatientById(patientId);

            if (patient != null) {
                patient.displayDetails();
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void doctorMenu(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("Enter Doctor ID (D***): ");
            String doctorId = scanner.next();
            ExceptionMethod.validDoctorId(doctorId);

            Doctor doctor = hospital.getDoctorById(doctorId);

            if (doctor != null) {
                doctor.displayDetails();

                List<Patient> assignedPatients = doctor.listPatients();
                if (assignedPatients != null && !assignedPatients.isEmpty()) {
                    System.out.println("\nAssigned Patients:");
                    for (Patient patient : assignedPatients) {
                        System.out.println("Name: " + patient.getName() + " (" + patient.getId() + ")");
                    }
                } else {
                    System.out.println("No patients assigned to this doctor!");
                }
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void adminMenu(Scanner scanner, HospitalSystem hospital) {
        boolean adminLoop = true;
        while (adminLoop) {
            System.out.println("\n====================================");
            System.out.println("|           ADMIN MENU             |");
            System.out.println("====================================");
            System.out.println("|  [1] View All Doctors            |");
            System.out.println("|  [2] View All Patients           |");
            System.out.println("|  [3] View All Staff              |");
            System.out.println("|  [4] View All Rooms              |");
            System.out.println("|----------------------------------|");
            System.out.println("|  [5] Admit New Patient           |");
            System.out.println("|  [6] Assign Doctor for Patient   |");
            System.out.println("|  [7] Assign Room for Patient     |");
            System.out.println("|  [8] Assign Staff to Room        |");
            System.out.println("|----------------------------------|");
            System.out.println("|  [9] Back                        |");
            System.out.println("====================================");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hospital.displayAllDoctors();
                    break;
                case 2:
                    hospital.displayAllPatients();
                    break;
                case 3:
                    hospital.displayAllStaff();
                    break;
                case 4:
                    hospital.displayAllRooms();
                    break;
                case 5:
                    admitNewPatient(scanner, hospital);
                    break;
                case 6:
                    assignDoctorToPatient(scanner, hospital);
                    break;
                case 7:
                    assignRoomToPatient(scanner, hospital);
                    break;
                case 8:
                    assignRoomToStaff(scanner, hospital);
                    break;
                case 9:
                    adminLoop = false;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    private static void admitNewPatient(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("Enter Patient ID (P***): ");
            String patientId = scanner.next();
            ExceptionMethod.validPatientId(patientId);

            scanner.nextLine();
            System.out.print("Enter Patient Name: ");
            String patientName = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.next();
            ExceptionMethod.validPhoneNumber(phoneNumber);

            scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Enter Disease: ");
            String disease = scanner.nextLine();

            System.out.print("Enter Days Admitted: ");
            int daysAdmitted = scanner.nextInt();

            Patient newPatient = new Patient(patientId, patientName, age, phoneNumber,
                    address, gender, disease, null, null, daysAdmitted);

            hospital.admitPatient(newPatient);
            System.out.println("\nPatient admitted successfully!");

            System.out.println("\nAssigning Doctor for the Patient...");
            assignDoctor(scanner, hospital, newPatient);

            System.out.println("\nAssigning Room for the patient...");
            assignRoom(scanner, hospital, newPatient);

        } catch (IdException | PhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void assignDoctor(Scanner scanner, HospitalSystem hospital, Patient patient) {
        try {
            System.out.println("\nList of Doctors:");
            hospital.displayAllDoctors();

            System.out.print("\nEnter Doctor ID (D***): ");
            String doctorId = scanner.next();
            ExceptionMethod.validDoctorId(doctorId);

            Doctor selectedDoctor = hospital.getDoctorById(doctorId);

            if (selectedDoctor != null) {
                patient.setAssignedDoctor(selectedDoctor);
                selectedDoctor.addPatient(patient);

                System.out.println("Doctor " + selectedDoctor.getName() + " assigned for Patient " + patient.getName());
            } else {
                System.out.println("No Doctor found for this ID!");
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void assignRoom(Scanner scanner, HospitalSystem hospital, Patient patient) {
        try {
            System.out.println("\nList of Rooms:");
            hospital.displayAllRooms();

            System.out.print("\nEnter Room Number to assign: ");
            String roomId = scanner.next();
            ExceptionMethod.validRoomId(roomId);

            Room selectedRoom = hospital.getRoomById(roomId);
            if (selectedRoom != null) {
                patient.setRoom(selectedRoom);
                System.out.println("Patient " + patient.getName() + " assigned to " + selectedRoom.getRoomType());
            } else {
                System.out.println("Room not found! No room assigned.");
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void assignDoctorToPatient(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("\nEnter Patient ID (P***): ");
            String patientId = scanner.next();
            ExceptionMethod.validPatientId(patientId);

            Patient patient = hospital.getPatientById(patientId);
            if (patient != null) {
                System.out.println("\nAssigning a doctor to the patient...");
                assignDoctor(scanner, hospital, patient);
            } else {
                System.out.println("Patient not found!");
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void assignRoomToPatient(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("\nEnter Patient ID (P***): ");
            String patientId = scanner.next();
            ExceptionMethod.validPatientId(patientId);

            Patient patient = hospital.getPatientById(patientId);
            if (patient != null) {
                System.out.println("\nAssigning room for the patient...");
                assignRoom(scanner, hospital, patient);
            } else {
                System.out.println("Patient not found!");
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void assignRoomToStaff(Scanner scanner, HospitalSystem hospital) {
        try {
            System.out.print("\nEnter Staff ID (S***): ");
            String staffId = scanner.next();
            ExceptionMethod.validStaffId(staffId);

            Staff staff = hospital.getStaffById(staffId);

            System.out.println("\nAssigning a room for the staff...");
            System.out.println("\nList of Rooms:");
            hospital.displayAllRooms();

            System.out.print("\nEnter Room ID to assign: ");
            String roomId = scanner.next();
            ExceptionMethod.validRoomId(roomId);

            Room assignedRoom = hospital.getRoomById(roomId);
            if (assignedRoom != null) {
                staff.setAssignedRoom(assignedRoom);
                System.out.println("Staff " + staff.getName() + " assigned to " + assignedRoom.getRoomType());
            } else {
                System.out.println("Room not found! No room assigned to staff.");
            }
        } catch (IdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
