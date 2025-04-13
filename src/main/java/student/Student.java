package student;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="StudentTable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column(nullable = false)
    private String fullName;


    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phone;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String Address;

    public Student() {
    }


    public Student(String fullName, int age, String phone,  String email, String password, String Address) {
        this.fullName = fullName;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return id == student.id && age == student.age && Objects.equals(fullName, student.fullName) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email) && Objects.equals(password, student.password) && Objects.equals(Address, student.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, age, phone, email, password, Address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
