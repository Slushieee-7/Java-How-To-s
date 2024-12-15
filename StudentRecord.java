import java.util.Scanner;

public class StudentRecord {
    private double quiz1;
    private double quiz2;
    private double midterm;
    private double finalExam;
    private double overallScore;
    private String letterGrade;

    public void inputScores() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score for Quiz 1 (out of 10): ");
        quiz1 = scanner.nextDouble();

        System.out.print("Enter score for Quiz 2 (out of 10): ");
        quiz2 = scanner.nextDouble();

        System.out.print("Enter score for Midterm (out of 100): ");
        midterm = scanner.nextDouble();

        System.out.print("Enter score for Final Exam (out of 100): ");
        finalExam = scanner.nextDouble();

        computeGrades();
        scanner.close();
    }

    private void computeGrades() {
        double normalizedQuizScore = ((quiz1 + quiz2) / 20) * 100; // Normalize quizzes to percent
        overallScore = (normalizedQuizScore * 0.25) + (midterm * 0.25) + (finalExam * 0.50);
        determineLetterGrade();
    }

    private void determineLetterGrade() {
        if (overallScore >= 90) {
            letterGrade = "A";
        } else if (overallScore >= 80) {
            letterGrade = "B";
        } else if (overallScore >= 70) {
            letterGrade = "C";
        } else if (overallScore >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
    }

    public void displayRecord() {
        System.out.println("Quiz 1 Score: " + quiz1);
        System.out.println("Quiz 2 Score: " + quiz2);
        System.out.println("Midterm Score: " + midterm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.printf("Overall Numeric Score: %.2f\n", overallScore);
        System.out.println("Final Letter Grade: " + letterGrade);
    }
}