package task2;

import java.util.ArrayList;
import task2.Student;

public class Course {
    private String title;
    private String description;
    private ArrayList<Student> students = new ArrayList<Student>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> filterYear(int _year) {
        ArrayList<Student> _students = new ArrayList<Student>();

        for (Student student : students) {
            if (student.getYear().equals(_year))
                _students.add(student);
        }

        return _students;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setYear(1);
        s1.setName("Fanni Tiia");
        Student s2 = new Student();
        s2.setYear(2);
        s2.setName("Aonghus Yair");
        Student s3 = new Student();
        s3.setYear(1);
        s3.setName("Inayat Paula");
        Student s4 = new Student();
        s4.setYear(3);
        s4.setName("Kawacatoose Finnguala");

        Course c = new Course();
        c.title = "OOP";
        c.description = "object oriented programing";
        c.students.add(s1);
        c.students.add(s2);
        c.students.add(s3);
        c.students.add(s4);

        int _year = Integer.parseInt(args[0]);
        ArrayList<Student> _students = c.filterYear(_year);
        for (Student student : _students)
            System.out.println(student);
    }
}
