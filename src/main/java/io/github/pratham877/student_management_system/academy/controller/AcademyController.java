package io.github.pratham877.student_management_system.academy.controller;

import io.github.pratham877.student_management_system.academy.pojo_file.Academy;
import io.github.pratham877.student_management_system.academy.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Academy entities.
 */
@RestController
@RequestMapping("/api/academies")
@Validated
public class AcademyController {

    private final AcademyService academyService;

    @Autowired
    public AcademyController(@Qualifier("databaseAcademyService") AcademyService academyService) {
        this.academyService = academyService;
    }

    /**
     * Creates a new Academy record.
     *
     * @param academy The Academy object to create.
     * @return The created Academy object.
     */
    @PostMapping
    public Academy addAcademy(@Validated @RequestBody Academy academy) {
        academyService.addAcademy(academy);
        return academy;
    }

    /**
     * Retrieves all Academy records.
     *
     * @return A list of all Academy records.
     */
    @GetMapping
    public List<Academy> getAllAcademies() {
        return academyService.getAllAcademies();
    }

    /**
     * Retrieves an Academy record by department.
     *
     * @param department The department identifier.
     * @return The matching Academy record.
     */
    @GetMapping("/{department}")
    public Academy getAcademyByDepartment(@PathVariable String department) {
        return academyService.getAcademyByDepartment(department);
    }

    /**
     * Updates the course for a given department.
     *
     * @param department The department identifier.
     * @param newCourse  The new course name.
     * @return The updated Academy record.
     */
    @PutMapping("/{department}/course")
    public Academy updateCourse(@PathVariable String department, @RequestBody String newCourse) {
        return academyService.updateCourse(department, newCourse);
    }

    /**
     * Updates the academic year for a given department.
     *
     * @param department The department identifier.
     * @param newYear    The new academic year.
     * @return The updated Academy record.
     */
    @PutMapping("/{department}/year")
    public Academy updateYear(@PathVariable String department, @RequestBody int newYear) {
        return academyService.updateYear(department, newYear);
    }

    /**
     * Updates the marks for a given department.
     *
     * @param department The department identifier.
     * @param newMarks   The new marks.
     * @return The updated Academy record.
     */
    @PutMapping("/{department}/marks")
    public Academy updateMarks(@PathVariable String department, @RequestBody float newMarks) {
        return academyService.updateMarks(department, newMarks);
    }

    /**
     * Updates the list of enrolled subjects for a given department.
     *
     * @param department   The department identifier.
     * @param newSubjects  The new list of enrolled subjects.
     * @return The updated Academy record.
     */
    @PutMapping("/{department}/subjects")
    public Academy updateSubjects(@PathVariable String department, @RequestBody List<String> newSubjects) {
        return academyService.updateSubjects(department, newSubjects);
    }

    /**
     * Deletes an Academy record by department.
     *
     * @param department The department identifier.
     * @return True if the record was deleted, false otherwise.
     */
    @DeleteMapping("/{department}")
    public boolean deleteAcademy(@PathVariable String department) {
        return academyService.deleteAcademy(department);
    }
}