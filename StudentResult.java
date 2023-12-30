import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Take inputs for each subject
        System.out.print("Enter marks for Maths: ");
        int Subject1 = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int Subject2 = scanner.nextInt();

        System.out.print("Enter marks for Bio: ");
        int Subject3 = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int Subject4 = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int Subject5 = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the student passed or failed
        if (Subject1 >= 35 && Subject2 >= 35 && Subject3 >= 35 && Subject4 >= 35 && Subject5 >= 35) {
            System.out.println(" Passed.");
        } else {
            System.out.println("Failed.");
        }
    }
}
