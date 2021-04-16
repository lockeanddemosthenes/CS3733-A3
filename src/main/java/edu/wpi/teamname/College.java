package edu.wpi.teamname;

import java.util.List;

public class College {
  private String name;
  private List<Dept> depts;

  public College(String name, List<Dept> depts) {
    this.name = name;
    this.depts = depts;
  }

  public String getName() {
    return name;
  }

  public List<Dept> getDepts() {
    return depts;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDepts(List<Dept> depts) {
    this.depts = depts;
  }

  public int countCourses() {
    int accumulator = 0;
    for (Dept d : depts) {
      accumulator += d.countCourses();
    }
    return accumulator;
  }

  public int countStudentsInCourses() {
    int accumulator = 0;
    for (Dept d : depts) {
      accumulator += d.countStudentsInDeptCourses();
    }
    return accumulator;
  }
}
