import java.util.Scanner;

public class Main {

    private static void displayMenu() {
        System.out.println("\n" + "-".repeat(60));
        System.out.println("                      MAIN MENU");
        System.out.println("-".repeat(60));
        System.out.println("  1. Add Student");
        System.out.println("  2. Delete Student");
        System.out.println("  3. Update Student");
        System.out.println("  4. Search by ID");
        System.out.println("  5. Search by Name");
        System.out.println("  6. Display All Students");
        System.out.println("  7. Show Average Marks");
        System.out.println("  8. Exit");
        System.out.println("-".repeat(60));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1 -> {
                    System.out.println("📝 ADD NEW STUDENT");
                    System.out.println("-".repeat(40));

                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Marks: ");
                    double marks = sc.nextDouble();

                    sm.addStudent(new Student(id, name, marks));
                    System.out.println();
                }

                case 2 -> {
                    System.out.println("🗑️  DELETE STUDENT");
                    System.out.println("-".repeat(40));

                    System.out.print("Enter Student ID to delete: ");
                    String id = sc.nextLine();

                    if (sm.deleteStudent(id))
                        System.out.println("Deleted successfully!");
                    else
                        System.out.println("Student not found!");
                }

                case 3 -> {
                    System.out.println("✏️  UPDATE STUDENT");
                    System.out.println("-".repeat(40));

                    System.out.print("Enter Student ID to update: ");
                    String id = sc.nextLine();

                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double marks = sc.nextDouble();

                    if (sm.updateStudent(id, name, marks))
                        System.out.println("Updated successfully!");
                    else
                        System.out.println("Student not found!");
                }

                case 4 -> {
                    System.out.println("🔍 SEARCH BY ID");
                    System.out.println("-".repeat(40));

                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();

                    Student s = sm.searchById(id);
                    System.out.println(s != null ? s : "Student not found!");
                }

                case 5 -> {
                    System.out.println("🔍 SEARCH BY NAME");
                    System.out.println("-".repeat(40));

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    Student s = sm.searchByName(name);
                    System.out.println(s != null ? s : "Student not found!");
                }

                case 6 -> sm.displayAll();

                case 7 -> {
                    System.out.println("📊 AVERAGE MARKS");
                    System.out.println("-".repeat(40));

                    double avg = sm.calculateAverage();
                    System.out.println("Average Marks = " + avg);
                }

                case 8 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}