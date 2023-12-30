import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Take inputs for each subject
        System.out.print("Enter marks for Maths: ");
        int Maths = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int English = scanner.nextInt();

        System.out.print("Enter marks for Bio: ");
        int Bio = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int Science = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int Physics = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the student passed or failed
        if (Maths >= 35 && Bio >= 35 && Physics >= 35 && Science >= 35 && English >= 35) {
            System.out.println(" Passed.");
        } else {
            System.out.println("Failed.");

            if (Maths < 35) {
                System.out.println("Student Failed in Maths With Exam Result Marks as" + Maths);
            }
            if (Science < 35) {
                System.out.println("Student Failed in Science With Exam Result Marks as" + Science);
            }
            if (Bio < 35) {
                System.out.println("Student Failed in Science With Exam Result Marks as" + Bio);
            }
            if (Physics < 35) {
                System.out.println("Student Failed in Physics With Exam Result Marks as" + Physics);
            }
            if (English < 35) {
                System.out.println("Student Failed in English With Exam Result Marks as" + English);
            }
        }
    }
}
