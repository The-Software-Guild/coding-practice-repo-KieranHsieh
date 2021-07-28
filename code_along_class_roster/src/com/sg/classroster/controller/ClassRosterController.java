package com.sg.classroster.controller;

import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoException;
import com.sg.classroster.dto.Student;
import com.sg.classroster.ui.ClassRosterView;

import java.util.List;

public class ClassRosterController {
    private ClassRosterView view;
    private ClassRosterDao dao;
    public ClassRosterController(ClassRosterView view, ClassRosterDao dao) {
        this.view = view;
        this.dao = dao;
    }
    public void run() {
        boolean keepGoing = true;
        try {
            while (keepGoing) {
                int selection = getMenuSelection();
                switch (selection) {
                    case 1:
                        displayStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        getSingleStudent();
                        break;
                    case 4:
                        removeSingleStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommandMessage();
                }
            }
            exitMessage();
        }
        catch(ClassRosterDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void exitMessage() {
        view.displayExitBanner();
    }
    private void unknownCommandMessage() {
        view.displayUnknownCommandBanner();
    }
    private void removeSingleStudent() throws ClassRosterDaoException {
        view.displayRemoveStudentBanner();
        String id = view.getStudentIdChoice();
        Student result = dao.removeStudent(id);
        view.displayRemoveResult(result);
    }
    private void getSingleStudent() throws ClassRosterDaoException {
        view.displayGetStudentBanner();
        String id = view.getStudentIdChoice();
        Student student = dao.getStudent(id);
        view.displayStudent(student);
    }
    private void displayStudents() throws ClassRosterDaoException {
        view.displayDisplayAllBanner();
        List<Student> students = dao.getAllStudents();
        view.displayAllStudents(students);
    }
    private void createStudent() throws ClassRosterDaoException {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
}
