import java.util.ArrayList;

public class StudentManager extends StudentOperations {

    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }

    @Override
    public boolean deleteStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                System.out.println("✅ Student deleted successfully!");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateStudent(String id, String newName, double newMarks) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(newName);
                s.setMarks(newMarks);
                System.out.println("✅ Student updated successfully!");
                return true;
            }
        }
        return false;
    }

    @Override
    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id))
                return s;
        }
        return null;
    }

    @Override
    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name))
                return s;
        }
        return null;
    }

    @Override
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    STUDENT RECORDS");
        System.out.println("=".repeat(60));

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("=".repeat(60));
        System.out.println("Total Students: " + students.size());
        System.out.println("=".repeat(60) + "\n");
    }

    @Override
    public double calculateAverage() {
        if (students.isEmpty())
            return 0;

        double sum = 0;
        for (Student s : students) {
            sum += s.getMarks();
        }
        return sum / students.size();
    }
}