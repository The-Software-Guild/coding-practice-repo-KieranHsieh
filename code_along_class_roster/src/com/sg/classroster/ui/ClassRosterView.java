package com.sg.classroster.ui;

import com.sg.classroster.dto.Student;
import java.util.List;

public class ClassRosterView {
    private UserIO io;
    public ClassRosterView(UserIO io) {
        this.io = io;
    }
    public void displayErrorMessage(String msg) {
        io.print("=== ERROR ===");
        io.print(msg);
    }
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a student");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices. ", 1, 5);
    }
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    public void displayRemoveStudentBanner() {
        io.print("=== Remove Student ===");
    }
    public void displayRemoveResult(Student studentRecord) {
        if(studentRecord == null) {
            io.print("Student successfully removed.");
        }
        else {
            io.print("No such student");
        }
        io.readString("Please press enter to continue.");
    }
    public void displayGetStudentBanner() {
        io.print("=== Display Student ===");
    }
    public String getStudentIdChoice() {
        return io.readString("Please enter the Student ID: ");
    }
    public void displayStudent(Student student) {
        if(student == null) {
            io.print("No such student");
        }
        else {
            String studentInfo = String.format("#%s : %s %s",
                    student.getStudentId(), student.getFirstName(), student.getLastName());
            io.print(studentInfo);
        }
        io.readString("Please press enter to continue.");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }
    public void displayAllStudents(List<Student> students) {
        for(Student s : students) {
            String studentInfo = String.format("#%s : %s %s",
                    s.getStudentId(), s.getFirstName(), s.getLastName());
            io.print(studentInfo);
        }
        io.readString("Please press enter to continue");
    }
    public void displayCreateStudentBanner() {
        io.print("=== Create Student ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString("Student successfully created. Please hit enter to continue");
    }
    public Student getNewStudentInfo() {
        String studentId = io.readString("Please enter Student ID: ");
        String firstName = io.readString("Please enter First Name: ");
        String lastName = io.readString("Please enter Last Name: ");
        String cohort = io.readString("Please enter Cohort: ");
        Student student = new Student(studentId);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setCohort(cohort);
        return student;
    }
}
