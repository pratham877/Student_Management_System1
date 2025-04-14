package io.github.pratham877.student_management_system.academy.service;



import io.github.pratham877.student_management_system.academy.pojo_file.Academy;

import java.util.List;

/**
 * Interface defining the contract for Academy service operations.
 */
public interface AcademyService {



    // CREATE
    /**
     * Adds a new Academy record.
     *
     * @param academy The Academy object to add.
     * @return The updated list of Academy records.
     */
    Academy addAcademy(Academy academy);

    // READ
    /**
     * Retrieves all Academy records.
     *
     * @return A list of all Academy records.
     */
    List<Academy> getAllAcademies();

    /**
     * Retrieves an Academy record by department.
     *
     * @param department The department identifier.
     * @return The matching Academy record, or null if not found.
     */
    Academy getAcademyByDepartment(String department);

    // UPDATE
    /**
     * Updates the course for a given department.
     *
     * @param department The department identifier.
     * @param newCourse  The new course name.
     * @return The updated Academy record, or null if not found.
     */
    Academy updateCourse(String department, String newCourse);

    /**
     * Updates the academic year for a given department.
     *
     * @param department The department identifier.
     * @param newYear    The new academic year.
     * @return The updated Academy record, or null if not found.
     */
    Academy updateYear(String department, int newYear);

    /**
     * Updates the marks for a given department.
     *
     * @param department The department identifier.
     * @param newMarks   The new marks.
     * @return The updated Academy record, or null if not found.
     */
    Academy updateMarks(String department, float newMarks);

    /**
     * Updates the list of enrolled subjects for a given department.
     *
     * @param department   The department identifier.
     * @param newSubjects  The new list of enrolled subjects.
     * @return The updated Academy record, or null if not found.
     */
    Academy updateSubjects(String department, List<String> newSubjects);

    // DELETE
    /**
     * Deletes an Academy record by department.
     *
     * @param department The department identifier.
     * @return True if the record was deleted, false otherwise.
     */
    boolean deleteAcademy(String department);
}

