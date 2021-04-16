package edu.wpi.teamname;

import java.util.ArrayList;
import java.util.List;

public class Course {
  protected String name;
  protected List<Student> students;

  public Course(String courseName) {
    this.name = courseName;
    students = new ArrayList<Student>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return "Course{" + "courseName='" + name + '\'' + '}';
  }

  public void listCourseStudents() {
    System.out.print(name + "'s students: ");
    for (Student s : students) {
      System.out.print(s.getName() + " ");
    }
    System.out.println();
  }

  public void addStudent(Student student) {
    students.add(student);
  }
}
