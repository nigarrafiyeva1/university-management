import java.util.ArrayList;

class Course{
    String name;

    Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student {
    int id;
    ArrayList<Course> courses = new ArrayList<>();

    Student(int id) {
        this.id = id;
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Courses: " + courses;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(18082);
        student.addCourse(new Course("PP1"));
        student.addCourse(new Course("Math"));
        student.addCourse(new Course("PP2"));

        System.out.println(student);
    }
}

