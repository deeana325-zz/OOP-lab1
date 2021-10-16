package task3;

import task2.Student;

public class Equals {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ana");
        s1.setYear(2);
        Student s2 = new Student();
        s2.setName("Ana");
        s2.setYear(2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
