package io.github.pratham877.student_management_system.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByName(String name);

    Optional<Student> findByEmail(String email);

    Optional<Student> findByAge(int age);
}
