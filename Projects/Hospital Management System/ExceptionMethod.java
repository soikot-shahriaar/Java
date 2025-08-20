public class ExceptionMethod {

    public static void validPatientId(String id) throws IdException {
        if (!id.matches("P\\d{3}")) {
            throw new IdException("Invalid Patient ID. Follow the format 'P***'.");
        }
    }

    public static void validDoctorId(String id) throws IdException {
        if (!id.matches("D\\d{3}")) {
            throw new IdException("Invalid Doctor ID. Follow the format 'D***'.");
        }
    }

    public static void validStaffId(String id) throws IdException {
        if (!id.matches("S\\d{3}")) {
            throw new IdException("Invalid Staff ID. Follow the format 'S***'.");
        }
    }

    public static void validRoomId(String id) throws IdException {
        if (!id.matches("R\\d{3}")) {
            throw new IdException("Invalid Room ID. Follow the format 'R***'.");
        }
    }

    public static void validPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length() < 10 || phoneNumber.length() > 13) {
            throw new PhoneNumberException("Phone number must be between 10 and 13 digits.");
        }

        if (!phoneNumber.matches("\\+?[0-9\\s\\-]+")) {
            throw new PhoneNumberException(
                    "Phone number can only contain digits, an optional '+' at the start, spaces, or hyphens.");
        }
    }
}

class PhoneNumberException extends Exception {
    public PhoneNumberException(String message) {
        super(message);
    }
}

class IdException extends Exception {
    public IdException(String message) {
        super(message);
    }
}
