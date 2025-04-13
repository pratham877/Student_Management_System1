package io.github.pratham877.student_management_system.student.service;

import io.github.pratham877.student_management_system.student.pojofile.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(long id);

    Student getStudentByName(String name);

    Student updateStudentEmail(long id, String newEmail);

    Student updateStudentPassword(long id, String newPassword);

    Student updateStudentPhone(long id, String newPhone);

    Student updateStudentAddress(long id, String newAddress);

    Student updateStudentAge(long id, int newAge);

    boolean deleteStudent(long id);
}
