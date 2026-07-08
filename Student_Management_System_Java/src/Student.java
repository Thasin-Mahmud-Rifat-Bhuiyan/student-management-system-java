public class Student extends Person {

    private String id;
    private double marks;

    public Student(String id, String name, double marks) {
        super(name);
        this.id = id;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Name: %-20s | Marks: %.2f", id, name, marks);  //polimorphisom
    }
}
