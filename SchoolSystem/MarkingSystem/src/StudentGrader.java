import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrader {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to our Student Examination");

        try {
            System.out.print("Enter the number of students participating: ");
            int numStudent = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numStudent; i++) {
                System.out.print("Enter your student name please: ");
                String name = scanner.nextLine();

                System.out.print("Enter your student ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                Student student = new Student(name, id);
                students.add(student);

                System.out.println("\nPlease answer the following questions: ");

                int score = 0;
                score += Questions("What is the output of: System.out.println(2 + 3); ", "5");
                score += Questions("What keyword is used to inherit a class?: ", "extends");
                score += Questions("What data type is used to store a true or false value?: ", "boolean");
                score += Questions("What is the keyword for creating an object in Java?: ", "new");
                score += Questions("Which method is the entry point of a Java application?: ", "main");

                student.setGrade(score);
                System.out.println("Grade for " + student.name + ": " + score + "/5\n");

            }

            System.out.println("\nFinal Grades:");
            for (Student student : students) {
                student.displayInfo();
            }
        }

        catch(InputMismatchException e) {
            System.out.println("Invalid input type. Please enter valid data.");
        }
        catch (InvaildInputException e){
            System.out.println("Invalid input: " + e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("Grading process completed.");
        }
    }

    private static int Questions(String question, String correctAnswer) throws InvaildInputException {
        System.out.print(question);
        String answer = scanner.nextLine().trim().toLowerCase();
        if (answer.isEmpty()) {
            throw new InvaildInputException("Answer cannot be left empty");
        }
        return answer.equals(correctAnswer.toLowerCase()) ? 1 : 0;
    }
}