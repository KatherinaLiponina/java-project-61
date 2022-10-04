package hexlet.code.games;
import hexlet.code.Engine;

public final class Calculator {

    public static final String TASK = "What is the result of the expression?";

    public static void startCalculatorGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.getNumberOfRounds()));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        final int numberLimit = 100;
        final int signAmount = 3;
        String[][] questions = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int leftNumber = (int) (Math.random() * numberLimit);
            int rightNumber = (int) (Math.random() * numberLimit);
            int sign = (int) (Math.random() * numberLimit) % signAmount;

            char charSign;
            int result;
            if (sign == 0) {
                charSign = '*';
                result = leftNumber * rightNumber;
            } else if (sign == 1) {
                charSign = '+';
                result = leftNumber + rightNumber;
            } else {
                charSign = '-';
                result = leftNumber - rightNumber;
            }
            questions[i][0] = Integer.toString(leftNumber) + " " + charSign + " " + Integer.toString(rightNumber);
            questions[i][1] = Integer.toString(result);
        }
        return questions;
    }

}
