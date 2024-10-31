public class Student extends User {
    private int grade;

    public Student(String name, int id) {
        super(name, id);
        this.grade = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}
