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
     // Method to search for a student by PRN (unique ID) and display their details if found.
     public void searchByPRN(long prn) {
         try {
             for (Student student : students) {
                 if (student.getPRN() == prn) {
                     student.display();
                     return;
                 }
             }
             throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
         } catch (StudentNotFoundException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
     // Method to search for a student by name (case insensitive) and displays their details if found.
     public void searchByName(String name) {
         try {
             for (Student student : students) {
                 if (student.getName().equalsIgnoreCase(name)) {
                     student.display();
                     return;
                 }
             }
             throw new StudentNotFoundException("Student with name '" + name + "' not found.");
         } catch (StudentNotFoundException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
	 // Method to search for a student based on their position in the list (1-based index).
     public void searchByPosition(int position) {
         try {
             if (position > 0 && position <= students.size()) {
                 students.get(position - 1).display();
             } else {
                 throw new IndexOutOfBoundsException("Invalid position.");
             }
         } catch (IndexOutOfBoundsException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
     // Method to update a student's name based on their PRN.
     public void updateStudent(long prn, String newName) {
         try {
             for (Student student : students) {
                 if (student.getPRN() == prn) {
                     student.setName(newName);
                     System.out.println("Student details updated successfully.");
                     return;
                 }
             }
             throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
         } catch (StudentNotFoundException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
	// Method to delete a student from the list based on their PRN.
     public void deleteStudent(long prn) {
         try {
             for (Student student : students) {
                 if (student.getPRN() == prn) {
                     students.remove(student);
                     System.out.println("Student removed successfully.");
                     return;
                 }
             }
             throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
         } catch (StudentNotFoundException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }