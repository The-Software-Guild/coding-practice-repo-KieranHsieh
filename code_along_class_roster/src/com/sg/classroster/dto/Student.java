package com.sg.classroster.dto;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private String cohort;

    public Student(String studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getStudentId() {
        return this.studentId;
    }
    public String getCohort() {
        return this.cohort;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}
