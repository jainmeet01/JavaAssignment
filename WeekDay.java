import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a week number (1-7): ");
        int weekNumber = scanner.nextInt();

        String day;

        if (weekNumber >= 1 && weekNumber <= 7) {
            switch (weekNumber) {
                case 1:
                    day = "Sunday";
                    break;
                case 2:
                    day = "Monday";
                    break;
                case 3:
                    day = "Tuesday";
                    break;
                case 4:
                    day = "Wednesday";
                    break;
                case 5:
                    day = "Thursday";
                    break;
                case 6:
                    day = "Friday";
                    break;
                case 7:
                    day = "Saturday";
                    break;
                default:
                    day = "Invalid day";
                    break;
            }

            System.out.println("Weekday for week number " + weekNumber + " is " + day);
        } else {
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
