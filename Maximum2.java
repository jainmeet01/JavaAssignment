import java.util.Scanner;

public class Maximum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        System.out.println("The maximum number between " + num1 + " and " + num2 + " is " + max);

        scanner.close();
    }
}
