package io.github.pratham877.student_management_system.student;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Validated
public class StudentController {
    private final StudentService studentService;


    @Autowired
    public StudentController(@Qualifier("databaseStudentService") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
        Student newStudent = new Student();
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            return ResponseEntity.ok(student);

        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping("/ByName")
    public ResponseEntity<Student> getStudentByName(@RequestParam String name) {
        Student student = studentService.getStudentByName(name);
        if (student != null) {
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/Name")
    public ResponseEntity<Student> updateStudentName(@PathVariable @RequestParam long id, String name) {
        Student student = studentService.updateStudentName(id, name);
        if (student != null) {
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }


    @PutMapping("/{id}/Email")
    public ResponseEntity<Student> updateStudentEmail(@RequestParam @PathVariable long id, String email) {
        Student student = studentService.updateStudentEmail(id, email);
        if (student != null) {
            return ResponseEntity.ok(student);
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/Phone")
    public ResponseEntity<Student> updateStudentPhone(@RequestParam @PathVariable long id, String phone) {
        Student student = studentService.updateStudentPhone(id, phone);
        if (student != null) {
            return ResponseEntity.ok(student);

        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/Address")
    public ResponseEntity<Student> updateStudentAddress(@RequestParam @PathVariable long id, String address) {
        Student student = studentService.updateStudentAddress(id, address);
        if (student != null) {
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/Password")
    public ResponseEntity<Student> updateStudentPassword(@RequestParam @PathVariable long id, String password) {
        Student student = studentService.updateStudentPassword(id, password);
        if (student != null) {
            return ResponseEntity.ok(student);

        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/Age")
    public ResponseEntity<Student> updateStudentAge(@RequestParam @PathVariable long id, int age) {
        Student student = studentService.updateStudentAge(id, age);
        if (student != null) {
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@RequestParam @PathVariable @Positive long id) {
        boolean deleted = studentService.deleteStudent(id);
        if (deleted) {
            return ResponseEntity.ok(studentService.getStudentById(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();


    }

}