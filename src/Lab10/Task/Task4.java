package OOP_CUI_Class_Work.src.Lab10.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        // Input degree of difficulty
        System.out.print("Enter the degree of difficulty (1.2 - 3.8): ");
        double degreeOfDifficulty = scanner.nextDouble();

        if (degreeOfDifficulty < 1.2 || degreeOfDifficulty > 3.8) {
            System.out.println("Invalid degree of difficulty! Must be between 1.2 and 3.8.");
            return;
        }

        // Input 7 judges' scores
        System.out.println("Enter 7 judges' scores (0 - 10):");
        for (int i = 0; i < 7; i++) {
            double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("Invalid score! Scores must be between 0 and 10.");
                return;
            }
            scores.add(score);
        }

        // Remove highest and lowest scores
        double maxScore = Collections.max(scores);
        double minScore = Collections.min(scores);
        scores.remove(scores.indexOf(maxScore));
        scores.remove(scores.indexOf(minScore));

        // Sum remaining scores
        double total = 0;
        for (double s : scores) {
            total += s;
        }

        // Calculate final score
        double finalScore = total * degreeOfDifficulty * 0.6;

        // Output result
        System.out.printf("Final score for the dive: %.2f%n", finalScore);
    }
}
