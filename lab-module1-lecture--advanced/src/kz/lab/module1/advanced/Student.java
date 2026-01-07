package kz.lab.module1.advanced;

import java.util.Objects;

public final class Student {
    final private int id;
    final private String name;
    final private String phone;

    public Student(int id, String name, String phone) {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("phone must not be blank");
        }
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int id() { return id; };
    public String name() { return name; }
    public String phone() { return phone; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }
}
