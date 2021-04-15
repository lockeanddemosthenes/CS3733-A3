package edu.wpi.teamname;

import java.util.List;

public class Department {

    String departmentName;
    List<Course> courses;

    public Department(String departmentName, List<Course> courses) {
        this.departmentName = departmentName;
        this.courses = courses;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int countCourses() {
        return courses.size()
    }

    public int countStudentsInDepartmentCourses() {
        int accumulator=0;
        for (Course c:courses){
            accumulator+=c.getStudents.size();
        }
        return accumulator

    }
}
