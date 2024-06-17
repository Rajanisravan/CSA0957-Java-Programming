import java.util.Scanner;

class Course {
    private String courseName;
    private String courseCode;
    private int marks;

    public Course(String courseName, String courseCode, int marks) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) return "S";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }
}

class Student {
    private String name;
    private String registerNumber;
    private Course[] courses;

    public Student(String name, String registerNumber, int numberOfCourses) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.courses = new Course[numberOfCourses];
    }

    public void addCourse(int index, Course course) {
        if (index >= 0 && index < courses.length) {
            courses[index] = course;
        }
    }

    public void printGradeSheet() {
        System.out.println("Grade Sheet");
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("---------------------------------------------------");
        System.out.println("Course Code\tCourse Name\tMarks\tGrade");
        System.out.println("---------------------------------------------------");

        for (Course course : courses) {
            System.out.println(course.getCourseCode() + "\t\t" + course.getCourseName() + "\t\t" + course.getMarks() + "\t" + course.getGrade());
        }

        System.out.println("---------------------------------------------------");
    }
}

public class GradeSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student register number: ");
        String registerNumber = scanner.nextLine();

        System.out.print("Enter number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = new Student(name, registerNumber, numberOfCourses);

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print("Enter course name for course " + (i + 1) + ": ");
            String courseName = scanner.nextLine();

            System.out.print("Enter course code for course " + (i + 1) + ": ");
            String courseCode = scanner.nextLine();

            System.out.print("Enter marks obtained for course " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Course course = new Course(courseName, courseCode, marks);
            student.addCourse(i, course);
        }

        student.printGradeSheet();

        scanner.close();
    }
}
