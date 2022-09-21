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
        final int amountOfRounds = 3;
        String[][] gameQuestions = new String[amountOfRounds][2];

        switch (game) {
            case choiceGreet:
                return -1;
            case choiceEven:
                for (int i = 0; i < amountOfRounds; i++) {
                    gameQuestions[i] = Even.getQuestion();
                }
                return gameWork(Even.getTask(), gameQuestions);
            case choiceCalc:
                for (int i = 0; i < amountOfRounds; i++) {
                    gameQuestions[i] = Calculator.getQuestion();
                }
                return gameWork(Calculator.getTask(), gameQuestions);
            case choiceGCD:
                for (int i = 0; i < amountOfRounds; i++) {
                    gameQuestions[i] = GCD.getQuestion();
                }
                return gameWork(GCD.getTask(), gameQuestions);
            case choiceProgression:
                for (int i = 0; i < amountOfRounds; i++) {
                    gameQuestions[i] = Progression.getQuestion();
                }
                return gameWork(Progression.getTask(), gameQuestions);
            case choicePrime:
                for (int i = 0; i < amountOfRounds; i++) {
                    gameQuestions[i] = Prime.getQuestion();
                }
                return gameWork(Prime.getTask(), gameQuestions);
            default:
                return -1;
        }
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
