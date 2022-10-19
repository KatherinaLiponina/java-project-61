package hexlet.code;

import java.util.Scanner;

public final class Engine {

    public static final int NUMBEROFROUNDS = 3;

    public static void playGame(String gameTask, String[][] questions) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameTask);

        for (int i = 0; i < NUMBEROFROUNDS; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(questions[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questions[i][1] + "'");
                scanner.close();
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        System.out.println("Congratulations, " + playerName + "!");
        return;
    }
}
