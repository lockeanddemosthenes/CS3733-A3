package edu.wpi.teamname;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + courses +
                '}';
    }

    public void listStudentCourses() {
        System.out.print(name + "'s Courses: ");
        for (Course c:courses) {
            System.out.print(c.getName() + " ");
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
