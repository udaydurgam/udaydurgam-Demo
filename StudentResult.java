import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();

            if (marks < 35)
                System.out.println("Failed");
            else
                System.out.println("Passed");
            // You can perform further processing or store the marks as needed
        }

        // Closing the scanner
        scanner.close();
    }
}
