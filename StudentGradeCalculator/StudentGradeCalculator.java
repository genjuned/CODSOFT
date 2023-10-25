package StudentGradeCalculator;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the student's ID: ");
        int studentID = scanner.nextInt();

        System.out.print("Enter the marks obtained in assignments (out of 100): ");
        double assignmentMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in exams (out of 100): ");
        double examMarks = scanner.nextDouble();

        System.out.print("Enter the marks obtained in the final project (out of 100): ");
        double projectMarks = scanner.nextDouble();

        double totalMarks = assignmentMarks + examMarks + projectMarks;
        double averageMarks = totalMarks / 3;

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        String grade = calculateGrade(averageMarks);
        System.out.println("Final Grade: " + grade);

        scanner.close();
    }

    private static String calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "C";
        } else if (averageMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
