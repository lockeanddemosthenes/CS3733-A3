package edu.wpi.teamname;

import java.util.ArrayList;

public class University {
  public static void main(String[] args) {
    Student student1 = new Student("Student1");
    Student student2 = new Student("Student2");
    Student student3 = new Student("Student3");
    Student student4 = new Student("Student4");
    Student student5 = new Student("Student5");
    Student student6 = new Student("Student6");
    Student student7 = new Student("Student7");
    Student student8 = new Student("Student8");
    Student student9 = new Student("Student9");
    Student student10 = new Student("Student10");
    Student student11 = new Student("Student11");
    Student student12 = new Student("Student12");
    Student student13 = new Student("Student13");
    Student student14 = new Student("Student14");
    Student student15 = new Student("Student15");
    Course course1 = new Course("Course1");
    Course course2 = new Course("Course2");
    Course course3 = new Course("Course3");
    Course course4 = new Course("Course4");
    Course course5 = new Course("Course5");

    course1.addStudent(student1);
    course1.addStudent(student2);
    course1.addStudent(student3);
    course1.addStudent(student4);
    course1.addStudent(student5);
    course1.addStudent(student6);

    course2.addStudent(student2);
    course2.addStudent(student3);
    course2.addStudent(student4);
    course2.addStudent(student5);
    course2.addStudent(student6);
    course2.addStudent(student7);

    course3.addStudent(student3);
    course3.addStudent(student4);
    course3.addStudent(student5);
    course3.addStudent(student6);
    course3.addStudent(student7);
    course3.addStudent(student8);

    course4.addStudent(student4);
    course4.addStudent(student5);
    course4.addStudent(student6);
    course4.addStudent(student7);
    course4.addStudent(student8);
    course4.addStudent(student9);

    course5.addStudent(student5);
    course5.addStudent(student6);
    course5.addStudent(student7);
    course5.addStudent(student8);
    course5.addStudent(student9);
    course5.addStudent(student10);

    student11.addCourse(course2);
    student11.addCourse(course3);

    student12.addCourse(course4);
    student12.addCourse(course5);
    student13.addCourse(course1);
    student13.addCourse(course2);

    ArrayList<Course> dept1Courses = new ArrayList<>();
    dept1Courses.add(course1);
    dept1Courses.add(course2);
    dept1Courses.add(course3);
    Dept dept1 = new Dept("dept 1", dept1Courses);

    ArrayList<Course> dept2Courses = new ArrayList<>();
    dept2Courses.add(course4);
    dept2Courses.add(course5);
    Dept dept2 = new Dept("dept 2", dept2Courses);

    ArrayList<Dept> collegeDept = new ArrayList<>();
    collegeDept.add(dept1);
    collegeDept.add(dept2);
    College college = new College("college!", collegeDept);

    System.out.println("Department 1 enrollments: " + dept1.countStudentsInDeptCourses());
    System.out.println("Department 2 enrollments: " + dept2.countStudentsInDeptCourses());
    System.out.println("College enrollments: " + college.countStudentsInCourses());

    System.out.println("Department 1 total courses: " + dept1.countCourses());
    System.out.println("Department 2 total courses: " + dept2.countCourses());
    System.out.println("Total courses in college: " + college.countCourses());

    System.out.println(student11.getName() + " is enrolled in " + student11.getCourses());
    System.out.println(student12.getName() + " is enrolled in " + student12.getCourses());
    course1.listCourseStudents();

    course2.listCourseStudents();
  }
}
