**Student Grading System**

Project Overview
The Student Grading System is a console-based Java application that simulates a simple grading system for students. This application allows users to enter details for multiple students and answer programming questions on behalf of each. The system calculates grades based on correct answers and displays each student's results. This project demonstrates fundamental OOP concepts in Java, including classes, inheritance, polymorphism, and exception handling.
Key Features
1.	Multiple Classes and Inheritance:
a.	The project includes a superclass (Person) and subclasses (Student and Teacher) to demonstrate inheritance.
b.	Polymorphism is achieved by overriding methods in the subclasses.
2.	Exception Handling:
a.	Handles invalid input errors and empty answer submissions with custom exceptions and standard Java exceptions.
3.	Interactive Console-Based Interface:
a.	Allows users to input student data, answer questions, and receive meaningful feedback based on performance.

**Classes**
•	Person: A superclass representing common attributes of a person (e.g., name and ID).
•	Student: A subclass of Person with additional attributes and methods specific to students, including the ability to store and display grades.
•	Teacher: Another subclass of Person that provides grading capabilities.
•	InvalidInputException: A custom exception to handle specific invalid input cases, such as empty answers.
•	GradingSystem: The main class responsible for executing the grading application, handling user input, displaying questions, and calculating grades.

**How to Run the Project**
1.	Prerequisites:
a.	Make sure Java is installed on your machine (Java JDK 8 or higher).
2.	Compilation and Execution:
a.	Open a terminal or command prompt in the project directory.
b.	Compile the classes with:
javac *.java
c.	Run the application with:
java GradingSystem

4.	Usage:
a.	You will be prompted to enter the number of students.

b.	For each student:

i.	Enter the student's name and ID.

ii.	Answer the five Java-related programming questions.

iii.	At the end, each student's grade will be displayed.

