package education;

import java.util.Objects;

public class Lesson {

    private String name;
    private String duration;
    private String lecturerName;
    private int price;
    private Student student;

    Lesson(String name, String duration, String lecturerName, int price, Student student) {
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
        this.student = student;
    }

    Lesson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return price == lesson.price && Objects.equals(name, lesson.name) && Objects.equals(duration, lesson.duration) && Objects.equals(lecturerName, lesson.lecturerName) && Objects.equals(student, lesson.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, lecturerName, price, student);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                ", student=" + student +
                '}';
    }
}

