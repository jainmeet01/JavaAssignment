import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        String toggledString = toggleCase(inputString);

       
        System.out.println("Toggled Case String: " + toggledString);

        scanner.close();
    }

    public static String toggleCase(String inputString) {
       
        StringBuilder resultBuilder = new StringBuilder();

       
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

           
            if (Character.isLowerCase(currentChar)) {
                
                resultBuilder.append(Character.toUpperCase(currentChar));
            } else if (Character.isUpperCase(currentChar)) {
              
                resultBuilder.append(Character.toLowerCase(currentChar));
            } else {
               
                resultBuilder.append(currentChar);
            }
        }

        
        return resultBuilder.toString();
    }
}
