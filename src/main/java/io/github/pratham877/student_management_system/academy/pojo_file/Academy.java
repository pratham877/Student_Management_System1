package io.github.pratham877.student_management_system.academy.pojo_file;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table
public class Academy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String deparment;
    @Column(nullable = false)
    private String branch;
    private int year;
    @Column(nullable = false)
    private float marks;
    @Column(nullable = false)
    private String enrolledSubjects;

    public Academy() {
    }

    public Academy(String deparment, String branch, int year, float marks, String enrolledSubjects) {
        this.deparment = deparment;
        this.branch = branch;
        this.year = year;
        this.marks = marks;
        this.enrolledSubjects = enrolledSubjects;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparments) {
        this.deparment = deparments;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String courses) {
        this.branch = courses;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(String enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Academy academy = (Academy) o;
        return year == academy.year && Float.compare(marks, academy.marks) == 0 && Objects.equals(deparment, academy.deparment) && Objects.equals(branch, academy.branch) && Objects.equals(enrolledSubjects, academy.enrolledSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deparment, branch, year, marks, enrolledSubjects);
    }

    @Override
    public String toString() {
        return "Academy{" +
                "department='" + deparment + '\'' +
                ", course='" + branch + '\'' +
                ", year=" + year +
                ", marks=" + marks +
                ", enrolledSubjects=" + enrolledSubjects + '}';}
}

