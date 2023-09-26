import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");

        String m = scanner.nextLine();
        
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        
        
        for (int i = 0; i < m.length(); i++) {
            char ch = m.charAt(i);
            
            
            if (Character.isLetter(ch)) {

                alphabetCount++;
            }
           
            else if (Character.isDigit(ch)) {

                digitCount++;
            }
            
            else {
                
                specialCharCount++;
            }
        }
        
        System.out.println("Total Alphabets: " + alphabetCount);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Special Characters: " + specialCharCount);
        
        scanner.close();
    }
}

