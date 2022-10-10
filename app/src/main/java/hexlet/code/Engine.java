package hexlet.code;

import java.util.Scanner;

public final class Engine {

    public static final int NUMBEROFROUNDS = 3;
    private static final int SUCCESS = 0;
    private static final int DEFEAT = 1;

    private static String greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        String playerName = Cli.getPlayerName();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

    private static void finishGame(int result, String playerName) {
        if (result == 0) { //success
            System.out.println("Congratulations, " + playerName + "!");
        } else if (result == 1) { //fail
            System.out.println("Let's try again, " + playerName + "!");
        }
    }

    public static void playGame(String gameTask, String[][] questions) {
        String playerName = greetPlayer();
        System.out.println(gameTask);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUMBEROFROUNDS; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(questions[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questions[i][1] + "'");
                scanner.close();
                finishGame(DEFEAT, playerName);
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        finishGame(SUCCESS, playerName);
        return;
    }
}
