package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ClassRosterDaoFileImpl implements ClassRosterDao {
    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";
    private HashMap<String, Student> students = new HashMap<>();
    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterDaoException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterDaoException {
        loadRoster();
        return new ArrayList<>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterDaoException {
        loadRoster();
        Student ret = students.remove(studentId);
        writeRoster();
        return ret;
    }
    private void loadRoster() throws ClassRosterDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        }
        catch(FileNotFoundException e) {
            throw new ClassRosterDaoException("-_- could not load roster data into memory.", e);
        }
        String curLine;
        Student curStudent;
        while(scanner.hasNextLine()) {
            curLine = scanner.nextLine();
            curStudent = unmarshallStudent(curLine);
            students.put(curStudent.getStudentId(), curStudent);
        }
        scanner.close();
    }
    private void writeRoster() throws ClassRosterDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        }
        catch(IOException e) {
            throw new ClassRosterDaoException(("Could not save student data"), e);
        }
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for(Student s : studentList) {
            studentAsText = marshallStudent(s);
            out.println(studentAsText);
            out.flush();
        }
        out.close();
    }
    private String marshallStudent(Student student) {
        return student.getStudentId() + DELIMITER +
                student.getFirstName() + DELIMITER +
                student.getLastName() + DELIMITER +
                student.getCohort();
    }
    private Student unmarshallStudent(String strStudent) {
        String[] studentTokens = strStudent.split(DELIMITER);
        String studentId = studentTokens[0];
        Student studentFromFile = new Student(studentId);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]);
        return studentFromFile;
    }
}
