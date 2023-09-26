import java.util.Scanner;

public class FindAllOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String i= scanner.nextLine();

       
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        
        searchCharacter(i, searchChar);

        scanner.close();
    }

    public static void searchCharacter(String i, char searchChar) {
       
        int index = -1;

        
        while (true) {
            
            index = i.indexOf(searchChar, index + 1);

           
            if (index == -1) {
                break;
            }

            // Print the index of the occurrence
            System.out.println("Found '" + searchChar + "' at index: " + index);
        }
    }
}
