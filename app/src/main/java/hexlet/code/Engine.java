package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public final class Engine {
    public static String greetPlayer() {
        System.out.println("Welcome to the Brain Games!");
        String playerName = Cli.getPlayerName();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

    public static int getPlayersChoice() {
        return Cli.playerChoice();
    }

    public static void gameEnd(int result, String playerName) {
        if (result == 0) { //success
            System.out.println("Congratulations, " + playerName);
        } else if (result == 1) { //fail
            System.out.println("Let's try again, " + playerName);
        }
    }

    public static int gameDistrubute(int game) {
        final int choiceGreet = 1;
        final int choiceEven = 2;
        final int choiceCalc = 3;
        final int choiceGCD = 4;
        final int choiceProgression = 5;
        final int choicePrime = 6;
        final int numberOfRounds = 3;
        int result;

        switch (game) {
            case choiceGreet:
                return -1;
            case choiceEven:
                result = gameWork(Even.getTask(), Even.getRound(numberOfRounds));
                break;
            case choiceCalc:
                result = gameWork(Calculator.getTask(), Calculator.getRound(numberOfRounds));
                break;
            case choiceGCD:
                result = gameWork(GCD.getTask(), GCD.getRound(numberOfRounds));
                break;
            case choiceProgression:
                result = gameWork(Progression.getTask(), Progression.getRound(numberOfRounds));
                break;
            case choicePrime:
                result = gameWork(Prime.getTask(), Prime.getRound(numberOfRounds));
                break;
            default:
                return -1;
        }
        return result;
    }

    public static int gameWork(String gameTask, String[][] questions) {
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
                return 1;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        return 0;
    }
}
