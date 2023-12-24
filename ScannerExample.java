import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Reading a double
        System.out.print("Enter a double: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("You entered: " + doubleNumber);

        // Reading a string
        scanner.nextLine(); // Consume the newline character left by nextInt
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);

        // Closing the Scanner
        scanner.close();
    }
}
