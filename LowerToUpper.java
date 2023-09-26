import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase ");
        String lowercaseString = scanner.nextLine();
        
        String uppercaseString = convertToUppercase(lowercaseString);
        
        System.out.println("Uppercase string: " + uppercaseString);
        
        scanner.close();
    }
    
    public static String convertToUppercase(String lowercaseString) {
        
        return lowercaseString.toUpperCase();
    }
}
