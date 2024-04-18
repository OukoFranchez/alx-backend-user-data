import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Initialize score counter

        // Questions and their corresponding correct answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?",
            "What is the tallest mammal on Earth?"
        };
        char[] answers = {'C', 'D', 'A', 'B', 'A'}; // Correct answers

        // Present questions and get user input
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("A. Option A");
            System.out.println("B. Option B");
            System.out.println("C. Option C");
            System.out.println("D. Option D");
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            // Compare user's answer with correct answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        // Calculate and display score
        double percentageScore = (double) score / questions.length * 100;
        System.out.println("Your final score: " + percentageScore + "%");

        scanner.close();
    }
}
