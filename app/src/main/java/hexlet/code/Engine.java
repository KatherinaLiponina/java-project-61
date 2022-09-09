package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Game;

public class Engine {
    Game specifiedGame;
    Engine(Game game) {
        specifiedGame = game;
    }
    public int gameProcess() {
        System.out.println(specifiedGame.getTask());
        Scanner scanner = new Scanner(System.in);
        final int amountOfRounds = 3;
        for (int i = 0; i < amountOfRounds; i++) {
            String[] roundData = specifiedGame.getQuestion();
            System.out.println("Question: " + roundData[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(roundData[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + roundData[1] + "'");
                scanner.close();
                return 1;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        return 0;
    }
}