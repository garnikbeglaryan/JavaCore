package education;

public class StudentStorage {

    Student[] students = new Student[10];
    int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }


    private void extend() {
        Student[] result = new Student[students.length + 10];
        System.arraycopy(students, 0, result, 0, students.length + 10);
        students = result;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i] + " ");
        }
    }


    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }

        }
        return null;
    }


    public Student getByLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
        return null;
    }


    public void deleteByStudent(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                delete(i);
            }
        }
    }


    private void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];
        }
        size--;
    }
}
