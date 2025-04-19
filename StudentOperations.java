import java.util.ArrayList;
 
 // This class handles all student-related operations like adding, searching, updating, and deleting students.
 public class StudentOperations {
     ArrayList<Student> students; // List to store Student objects
 
     // Constructor: Initializes an empty list of students.
     public StudentOperations() {
         this.students = new ArrayList<>();
     }
 
     // Custom Exception for duplicate student PRNs
     public static class DuplicateStudentException extends Exception {
         public DuplicateStudentException(String message) {
             super(message);
         }
     }
     // Custom Exception for when a student is not found
     public static class StudentNotFoundException extends Exception {
         public StudentNotFoundException(String message) {
             super(message);
         }
     }
     // Adds a new student to the list.
     public void addStudent(Student student) {
         try {
             for (Student s : students) {
                 if (s.getPRN() == student.getPRN()) {
                     throw new DuplicateStudentException("Student with PRN " + student.getPRN() + " already exists.");
                 }
             }
             students.add(student);
             System.out.println("Student added successfully.");
         } catch (DuplicateStudentException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
     // Displays details of all students in the list.
     public void displayStudents() {
         if (students.isEmpty()) {
             System.out.println("No students to display.");
         }
         for (Student student : students) {
             student.display();
         }
     }