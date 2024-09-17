/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

import java.util.ArrayList;

public class StudentList {
    private final ArrayList<Student> studentList;

    // Constructor
    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Update a student by ID
    public void updateStudentById(String id, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, updatedStudent);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete a student by ID
    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    // Display all students
    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println("-------------------");
        }
    }

    // Find the student with the highest GPA
    public Student findTopStudent() {
        if (studentList.isEmpty()) return null;

        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}
