package education;

import java.util.Scanner;

public class LessonStudentTest {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();


    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email" + "\u001B[0m");
    }


    public static void main(String[] args) {

//        studentStorage.add(new Student("poxos", "poxosyan", 22, "poxos@mail.ru", "0987776655", "cragravorum"));
//        studentStorage.add(new Student("petros", "petrosyan", 23, "petros@mail.ru", "097665544", "matem"));
//        studentStorage.add(new Student("martiros", "martirosyan", 25, "martiros@mail.ru", "094558800", "english"));
        boolean isRun = true;

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("please choose by email");
        System.out.println("------------");
        studentStorage.print();
        System.out.println("------------");
        String email = scanner.nextLine();
        studentStorage.deleteByStudent(email);
    }

    private static void deleteLessonByName() {
        System.out.println("please choose by name");
        System.out.println("----------");
        lessonStorage.print();
        System.out.println("----------");
        String name = scanner.nextLine();
        lessonStorage.deleteBylesson(name);
    }

    private static void printStudentByLesson() {
        System.out.println("please choose by Lesson");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            studentStorage.printByLesson(lessonName);
        } else {
            System.err.println("Lesson does not exists");
        }
    }

    private static void addStudent() {

        System.out.println("please input lesson name");
        String lessonByNname = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonByNname);
        if (lesson != null) {
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input surname");
            String surname = scanner.nextLine();
            System.out.println("please input age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input email");
            String email = scanner.nextLine();
            System.out.println("please input phone");
            String phone = scanner.nextLine();


            Student student = new Student(name, surname, age, email, phone, lesson);

            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. Author with this email already exists");
            } else {
                studentStorage.add(student);
                System.out.println("Student was aded");
            }
        } else {
            System.err.println("Lesson does not exists");
        }
    }


    private static void addLesson() {

        System.out.println("please input name");
        String name = scanner.nextLine();
        if (lessonStorage.getByName(name) == null) {
            System.out.println("please input duration");
            String duration = scanner.nextLine();
            System.out.println("please input lecturerName");
            String lecturerName = scanner.nextLine();
            System.out.println("please input price");
            int price = Integer.parseInt(scanner.nextLine());

            lessonStorage.add(new Lesson(name, duration, lecturerName, price));
            System.out.println("Lesson was aded");

        } else {
            System.err.println("Invalid name! lesson with this name alreade exists");
            addLesson();
        }
    }
}


