package edu.wpi.teamname;

import java.util.List;

public class College {
    String name;
    List<Department> depts;

    public College(String name, List<Department> depts) {
        this.name = name;
        this.depts = depts;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepts() {
        return depts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepts(List<Department> depts) {
        this.depts = depts;
    }

    public int countCourses() {
        int accumulator = 0;
        for (Department d : depts) {
            accumulator += d.countCourses();
        }
        return accumulator;
    }

    public int countStudentsInCourses() {
        int accumulator = 0;
        for (Department d : depts) {
            accumulator += d.countStudentsInDepartmentCourses();
        }
        return accumulator;
    }
}

