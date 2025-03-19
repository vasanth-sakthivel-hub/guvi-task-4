import java.util.Scanner;

class WeekdayFinder {
    public static void main(String[] args) {

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter a day position (0 for Sunday, 1 for Monday, ... 6 for Saturday): ");
            int index = scanner.nextInt();


            System.out.println("The day is: " + weekdays[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid index between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 0 and 6.");
        } finally {
            scanner.close();
        }
    }
}
