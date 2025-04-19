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