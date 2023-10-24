package Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();
        Scanner S = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a student, 2 to display students, or 3 to exit:");
            int choice = S.nextInt();
            S.nextLine(); // consume the newline

            if (choice == 1) {
                System.out.println("Enter student name:");
                String name = S.nextLine();
                System.out.println("Enter student ID:");
                int id = S.nextInt();
                S.nextLine(); // consume the newline
                Student student = new Student(name, id);
                registrationSystem.addStudent(student);
                System.out.println("Student added successfully.");
            } else if (choice == 2) {
                registrationSystem.displayStudents();
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
