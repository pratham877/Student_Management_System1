package io.github.pratham877.student_management_system.student.pojofile;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Objects;

@Entity
@Table(name="StudentTable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Student Name Is Required ")
    @Size(min = 5,max = 30,message = "Student Name Must  Be Between 5 and 30 Characters ")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "Student Age Is Required")
    @Column(nullable = false)
    private int age;

    @NotNull(message = "Student Phone_no Is Required")
    @Size(min = 10,max = 10,message = "Please Write Your Correct PhoneNo. Here")
    @Column(nullable = false)
    private String phone;


    @Column(nullable = false)
    @Email(message = "Your Email Is Wrong Please Re-Write Your Correct Email ")
    @NotBlank(message = "Student Email Is Required")
    private String email;

    @NotBlank(message = "Student Password Is Required")
    @Min(value = 8,message = "Password Should Be Strong And Minimum 8 letters")
    @Column(nullable = false)
    private String password;


    @NotBlank(message = "Student Address Is Required")
    @Column(nullable = false)
    private String Address;

    public Student() {
    }


    public Student(String name, int age, String phone, String email, String password, String Address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.Address = Address;
    }

    public long getId() {
        return id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String fullName) {
        this.name = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email) && Objects.equals(password, student.password) && Objects.equals(Address, student.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, phone, email, password, Address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
