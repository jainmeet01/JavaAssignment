import java.util.Scanner;

public class ReversedString {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String n = scanner.nextLine();
        
        String r = reverse(n);
        
        System.out.println("Reversed string: " + r);
        
        scanner.close();
    }
    
}




