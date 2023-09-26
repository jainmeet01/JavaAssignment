
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

    
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        scanner.close();

       
        if (num1 > num2) {
            System.out.println("The maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The maximum number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}


