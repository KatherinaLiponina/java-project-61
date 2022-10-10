package hexlet.code.games;
import hexlet.code.Engine;

public final class Calculator {

    public static final String TASK = "What is the result of the expression?";

    public static void startCalculatorGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.NUMBEROFROUNDS));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        final int numberLimit = 100;
        final int signAmount = 3;
        String[][] questions = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int leftNumber = (int) (Math.random() * numberLimit);
            int rightNumber = (int) (Math.random() * numberLimit);
            int sign = (int) (Math.random() * numberLimit) % signAmount;

            questions[i][0] = generateQuestionString(leftNumber, sign, rightNumber);
            questions[i][1] = Integer.toString(solveEquation(leftNumber, sign, rightNumber));
        }
        return questions;
    }

    public static int solveEquation(int left, int operand, int right) {
        int result = 0;
        switch (operand) {
            case 0:
                result = left * right;
                break;
            case 1:
                result = left + right;
                break;
            case 2:
                result = left - right;
                break;
            default:
                result = -1;
        }
        return result;
    }

    public static String generateQuestionString(int left, int operand, int right) {
        String question = Integer.toString(left) + " ";
        question += (operand == 0) ? "*" : (operand == 1) ? "+" : "-";
        question += " " + Integer.toString(right);
        return question;
    }
}
