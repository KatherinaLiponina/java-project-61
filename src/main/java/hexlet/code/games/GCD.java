package hexlet.code.games;
import hexlet.code.Engine;

public final class GCD {

    public static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void startGCDGame(int numberOfRounds) {
        Engine.gameWork(TASK, getRound(numberOfRounds));
    }

    public static String[][] getRound(int numberOfRounds) {
        final int numberLimit = 100;
        String[][] questions = new String[numberOfRounds][2];
        for (int i = 0; i < numberOfRounds; i++) {
            int firstNumber = (int) (Math.random() * numberLimit) + 1;
            int secondNumber = (int) (Math.random() * numberLimit) + 1;

            questions[i][0] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            questions[i][1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        return questions;
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
