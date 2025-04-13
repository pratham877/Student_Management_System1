package io.github.pratham877.student_management_system.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataBaseStudentService {

    private  StudentRepository studentRepository;

    @Autowired
    public DataBaseStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> addStudents(Student students) {

    }
}
