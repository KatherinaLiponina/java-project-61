package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static String greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        String playerName = Cli.getPlayerName();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

    public static void gameEnd(int result, String playerName) {
        if (result == 0) { //success
            System.out.println("Congratulations, " + playerName + "!");
        } else if (result == 1) { //fail
            System.out.println("Let's try again, " + playerName + "!");
        }
    }

    public static void gameWork(String gameTask, String[][] questions) {
        final int success = 0;
        final int defeat = 1;
        String playerName = greetPlayer();
        System.out.println(gameTask);
        Scanner scanner = new Scanner(System.in);
        final int amountOfRounds = 3;
        for (int i = 0; i < amountOfRounds; i++) {
            System.out.println("Question: " + questions[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(questions[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questions[i][1] + "'");
                scanner.close();
                gameEnd(defeat, playerName);
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        gameEnd(success, playerName);
        return;
    }
}
