import java.security.SecureRandom;

public class SixDigitPassword {

    public static void main(String[] args) {
        int passwordLength = 8;

        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated 8-digit Password: " + generatedPassword);
    }

    public static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomDigit = random.nextInt(10); 
            password.append(randomDigit);
        }

        return password.toString();
    }
}
