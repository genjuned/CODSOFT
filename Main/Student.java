package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class RegistrationSystem {
    private List<Student> students;

    public RegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RegistrationSystem registrationSystem = new RegistrationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add a student, 2 to display students, or 3 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            if (choice == 1) {
                System.out.println("Enter student name:");
                String name = scanner.nextLine();
                System.out.println("Enter student ID:");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume the newline
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
