package io.github.pratham877.student_management_system.student.service;


import io.github.pratham877.student_management_system.student.pojofile.Student;
import io.github.pratham877.student_management_system.student.exception.StudentNotFoundException;
import io.github.pratham877.student_management_system.student.exception.StudentValidationException;
import io.github.pratham877.student_management_system.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("databaseStudentService")
public class DataBaseStudentService implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public DataBaseStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student addStudent(Student student) {
        if (student==null){
            throw new StudentValidationException("Student must not be null");
        }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        if (students.isEmpty()){
            throw new StudentNotFoundException("No Student is found in the list");
        }
        return students;
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException("Student with id" + id + "not found"));
    }

    @Override
    public Student getStudentByName(String name) {
     return studentRepository.findByName(name).orElseThrow(()-> new StudentNotFoundException ("Product with name"+name+"not found"));
    }


    @Override
    public Student updateStudentEmail(long id, String newEmail) {
        if (newEmail==null || newEmail.isEmpty()){
            throw new StudentValidationException("Email must not be null or empty");
        }
        Student student = getStudentById(id);
        if (student!=null){
            student.setEmail(newEmail);
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudentPassword(long id, String newPassword) {
        if (newPassword==null || newPassword.isEmpty()){
            throw new StudentValidationException("Password must not be null or empty");
        }
        Student student = getStudentById(id);
        if (student!=null){
            student.setPassword(newPassword);
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudentPhone(long id, String newPhone) {
        if (newPhone==null || newPhone.isEmpty()){
            throw new StudentValidationException("Phone must not be null or empty");
        }
        Student student = getStudentById(id);
        if (student!=null){
            student.setPhone(newPhone);
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudentAddress(long id, String newAddress) {
        if (newAddress==null || newAddress.isEmpty()){
            throw new StudentValidationException("Address must not be null or empty");
        }
        Student student = getStudentById(id);
        if (student!=null){
            student.setAddress(newAddress);
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public Student updateStudentAge(long id, int newAge) {
        if (newAge <=0){
            throw new StudentValidationException("Age must be greater than 0");
        }
        Student student = getStudentById(id);
        if (student!=null){
            student.setAge(newAge);
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public boolean deleteStudent(long id) {
        if (studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        }
        else {
            throw new StudentNotFoundException("Student with id" + id + "not found");
        }
    }
}
