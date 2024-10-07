//Write a Java program to create a class called &quot;School&quot; with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes. Use arrays for add and removal.


import java.util.Arrays;

public class School {
    private String[] students;
    private String[] teachers;
    private String[] classes;
    private int studentCount;
    private int teacherCount;
    private int classCount;

    public School(int studentCapacity, int teacherCapacity, int classCapacity) {
        students = new String[studentCapacity];
        teachers = new String[teacherCapacity];
        classes = new String[classCapacity];
        studentCount = 0;
        teacherCount = 0;
        classCount = 0;
    }

    public void addStudent(String studentName) {
        if (studentCount < students.length) {
            students[studentCount++] = studentName;
            System.out.println("Student added"+studentName);
        } else {
            System.out.println("Student capacity full. Cannot add student");
            
        }
    }

    public void removeStudent(String studentName) {

        int index = findStudent(studentName);
        if (index != -1) {
            students[index] = students[--studentCount];
            students[studentCount] = null;
            System.out.println("Student removed"+studentName);
        }else{
            System.out.println("Student not found");
        }
    }

    public void addTeacher(String teacherName) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount++] = teacherName;
            System.out.println("Teacher added"+teacherName);
        } else {
            System.out.println("Teacher capacity full. Cannot add teacher");
        }
    }

    public void removeTeacher(String teacherName) {
        int index = findTeacher(teacherName);
        if (index != -1) {
            teachers[index] = teachers[--teacherCount];
            teachers[teacherCount] = null;
            System.out.println("Teacher removed"+teacherName);
        }else{
            System.out.println("Teacher not found");
        }
    }

    public void addClass(String className) {
        if (classCount < classes.length) {
            classes[classCount++] = className;
            System.out.println("Class added"+className);
        } else {
            System.out.println("Class capacity full. Cannot add class");
        }
    }

    public int findStudent(String studentName) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(studentName)) {
                return i;
            }
        }
        return -1;
    }

    public int findTeacher(String teacherName) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equals(teacherName)) {
                return i;
            }
        }
        return -1;
    }
    
    public void displayStudents(){
        System.out.println("Students: "+Arrays.toString(students));
    }

    public void displayTeachers(){
        System.out.println("Teachers: "+Arrays.toString(teachers));
    }

    public void displayClasses(){
        System.out.println("Classes: "+Arrays.toString(classes));
    }

    public static void main(String[] args) {
        School school = new School(5, 3, 4);
        
        school.addStudent(": Alice");
        school.addStudent(": Bob");
        school.addStudent(": Charlie");

        school.addTeacher(": Mr. Smith");
        school.addTeacher(": Ms. Johnson");

        school.addClass(": Math 101");
        school.addClass(": Science 102");

        school.displayStudents();
        school.displayTeachers();
        school.displayClasses();

        school.removeStudent(": Bob");
        
        school.removeTeacher(": Ms. Johnson");

        school.displayStudents();
        school.displayTeachers();
        school.displayClasses();

    }

}