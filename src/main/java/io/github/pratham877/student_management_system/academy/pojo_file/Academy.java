package io.github.pratham877.student_management_system.academy.pojo_file;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table
public class Academy {
    @Id
    private String deparments;
    @Column(nullable = false)
    private String courses;
    private int year;
    @Column(nullable = false)
    private float marks;
    @Column(nullable = false)
    private String enrolledSubjects;

    public Academy() {
    }

    public Academy(String deparments, String courses, int year, float marks, String enrolledSubjects) {
        this.deparments = deparments;
        this.courses = courses;
        this.year = year;
        this.marks = marks;
        this.enrolledSubjects = enrolledSubjects;
    }

    public String getDeparments() {
        return deparments;
    }

    public void setDeparments(String deparments) {
        this.deparments = deparments;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
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
        return year == academy.year && Float.compare(marks, academy.marks) == 0 && Objects.equals(deparments, academy.deparments) && Objects.equals(courses, academy.courses) && Objects.equals(enrolledSubjects, academy.enrolledSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deparments, courses, year, marks, enrolledSubjects);
    }

    @Override
    public String toString() {
        return "Academy{" +
                "department='" + deparments + '\'' +
                ", course='" + courses + '\'' +
                ", year=" + year +
                ", marks=" + marks +
                ", enrolledSubjects=" + enrolledSubjects + '}';}
}

