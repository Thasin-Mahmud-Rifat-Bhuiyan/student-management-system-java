public abstract class StudentOperations {
    public abstract void addStudent(Student student);

    public abstract boolean deleteStudent(String id);

    public abstract boolean updateStudent(String id, String newName, double newMarks);

    public abstract Student searchById(String id);

    public abstract Student searchByName(String name);

    public abstract void displayAll();

    public abstract double calculateAverage();
}