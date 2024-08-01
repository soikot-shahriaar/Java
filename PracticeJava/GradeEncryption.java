// Java program to encrypt a grade by adding 39 to it. Decrypt it to show the correct grade.

public class GradeEncryption {

    public static void main(String[] args) {
        
        char originalGrade = 'A';
        int shiftValue = 39;

        // Encoding the character by shifting its ASCII value
        char encodedGrade = (char) (originalGrade + shiftValue); 
        System.out.println("Encoded grade: " + encodedGrade);

        // Decoding the character by shifting back the ASCII value
        char decodedGrade = (char) (encodedGrade - shiftValue); 
        System.out.println("Decoded grade: " + decodedGrade);
    }
}
