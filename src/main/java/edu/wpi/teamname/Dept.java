package edu.wpi.teamname;

import java.util.List;

public class Dept {

    private String deptName;
    private List<Course> courses;

    public Dept(String deptName, List<Course> courses) {
        this.deptName = deptName;
        this.courses = courses;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getDeptName() {
        return deptName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int countCourses() {
        return courses.size();
    }

    public int countStudentsInDeptCourses() {
        int accumulator=0;
        for (Course c:courses){
            accumulator+=c.getStudents().size();
        }
        return accumulator;

    }
}
