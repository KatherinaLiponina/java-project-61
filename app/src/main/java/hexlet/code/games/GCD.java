package hexlet.code.games;
import hexlet.code.Engine;

public final class GCD {

    public static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void startGCDGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.NUMBEROFROUNDS));
    }

    private static final int NUMBERLIMIT = 100;
    private static final int PAIR = 2;
    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        final int startNumber = 1;
        String[][] questions = new String[numberOfRounds][PAIR];
        for (int i = 0; i < numberOfRounds; i++) {
            int firstNumber = Utils.generateRandomNumber(startNumber, NUMBERLIMIT);
            int secondNumber = Utils.generateRandomNumber(startNumber, NUMBERLIMIT);

            questions[i][0] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            questions[i][1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        return questions;
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
