package io.github.pratham877.student_management_system.academy.service;


import io.github.pratham877.student_management_system.academy.pojo_file.Academy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory service class to manage Academy records.
 */
@Service
public class InMemAcademyService {

    private final List<Academy> academyList;

    public InMemAcademyService() {
        academyList = new ArrayList<>();
    }

    // CREATE
    public List<Academy> addAcademy(Academy academy) {
        academyList.add(academy);
        return academyList;
    }

    // READ
    public List<Academy> getAllAcademies() {
        return academyList;
    }

    public Academy getAcademyByDepartment(String department) {
        for (Academy academy : academyList) {
            if (academy.getDeparment().equalsIgnoreCase(department)) {
                return academy;
            }
        }
        return null;
    }

    // UPDATE
    public Academy updateCourse(String department, String newCourse) {
        Academy academy = getAcademyByDepartment(department);
        if (academy != null) {
            academy.setBranch(newCourse);
        }
        return academy;
    }

    public Academy updateYear(String department, int newYear) {
        Academy academy = getAcademyByDepartment(department);
        if (academy != null) {
            academy.setYear(newYear);
        }
        return academy;
    }

    public Academy updateMarks(String department, float newMarks) {
        Academy academy = getAcademyByDepartment(department);
        if (academy != null) {
            academy.setMarks(newMarks);
        }
        return academy;
    }

    public Academy updateSubjects(String department, String newSubjects) {
        Academy academy = getAcademyByDepartment(department);
        if (academy != null) {
            academy.setEnrolledSubjects(newSubjects);
        }
        return academy;
    }

    // DELETE
    public boolean deleteAcademy(String department) {
        Academy academy = getAcademyByDepartment(department);
        if (academy != null) {
            academyList.remove(academy);
            return true;
        }
        return false;
    }
}

