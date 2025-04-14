package io.github.pratham877.student_management_system.academy.repository;

import io.github.pratham877.student_management_system.academy.pojo_file.Academy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyRepository extends JpaRepository<Academy, String> {



}
