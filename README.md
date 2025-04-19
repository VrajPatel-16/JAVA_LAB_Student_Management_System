# Student Management System

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
  - [Main Class](#main-class)
  - [StudentOperations Class](#studentoperations-class)
  - [Student Class](#student-class)
  - [Custom Exceptions](#custom-exceptions)



---

## Overview
This **Student Management System** allows users to perform basic operations such as **adding, updating, deleting**, and **searching students** by their **PRN (Permanent Registration Number)**, **Name**, or **Position**.  
The program is written in **Java** and handles various exceptions like invalid menu choices and student-not-found errors.

The program includes the following main classes:
- **Main**: Presents a menu to the user and handles input.
- **StudentOperations**: Methods for managing student records.
- **Student**: Represents individual students with basic information.

---

## Features
- **Add Student**: Add a new student by providing their Name and PRN.
- **Display All Students**: Show details of all students.
- **Search by PRN**: Locate a student using their unique PRN.
- **Search by Name**: Find students by their name (case-insensitive).
- **Search by Position**: Find a student by their position in the list (1-based index).
- **Update Student**: Change the student's name using their PRN.
- **Delete Student**: Remove a student from the system using their PRN.
- **Exit**: Terminate the program.

---

## Classes and Methods

### Main Class
Handles the main logic of the program by presenting a menu and processing user input.

#### Method
- `main(String[] args)`:  
  Entry point of the program. Displays the menu and invokes methods based on user selection.

---

### StudentOperations Class
Manages student records.

#### Methods
- `addStudent(Student student)`:  
  Adds a new student to the system.

- `displayAllStudents()`:  
  Displays all students.

- `searchByPrn(String prn)`:  
  Searches for a student by PRN.

- `searchByName(String name)`:  
  Searches for students by name (case-insensitive).

- `searchByPosition(int position)`:  
  Retrieves a student based on list position (1-based).

- `updateStudent(String prn, String newName)`:  
  Updates a student's name by PRN.

- `deleteStudent(String prn)`:  
  Deletes a student using their PRN.

---

### Student Class
Represents a student.

#### Constructor
- `Student(String name, String prn)`:  
  Initializes a student with a name and PRN.

#### Methods
- `String getName()`:  
  Returns the student's name.

- `String getPrn()`:  
  Returns the student's PRN.

- `void displayDetails()`:  
  Prints the student's name and PRN.

---

### Custom Exceptions
The program defines and handles custom exceptions:

- `InvalidChoiceException`:  
  Thrown when the user selects an invalid menu option.

- `DuplicateStudentException`:  
  Thrown when trying to add a student with a PRN that already exists.

- `StudentNotFoundException`:  
  Thrown when no student is found with the provided details.

- `IndexOutOfBoundsException`:  
  Thrown when an invalid position is used during a search.

---


