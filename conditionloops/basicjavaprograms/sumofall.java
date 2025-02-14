import java.util.Scanner;

public class sumofall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum. Type 'x' to stop.");

        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = scanner.next();  // Read input as a string

            // Check if the input is 'x' to terminate
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                // Convert input to an integer and add to sum
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }

        // Print the sum of all entered numbers
        System.out.println("Sum of all numbers: " + sum);

        scanner.close();
    }
}