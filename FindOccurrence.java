import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the character to find: ");
        char targetChar = scanner.next().charAt(0);
        
        int firstOccurrence = findFirstOccurrence(inputString, targetChar);
        
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + targetChar + "' is at index " + firstOccurrence);
        } else {
            System.out.println("'" + targetChar + "' not found in the string.");
        }
        
        scanner.close();
    }
    
    public static int findFirstOccurrence(String inputString, char targetChar) {
       
        for (int i = 0; i < inputString.length(); i++) {
            
            if (inputString.charAt(i) == targetChar) {
               
                return i;
            }
        }
        
       
        return -1;
    }
}
