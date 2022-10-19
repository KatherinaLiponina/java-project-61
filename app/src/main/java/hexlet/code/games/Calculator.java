package hexlet.code.games;
import hexlet.code.Engine;

public final class Calculator {

    public static final String TASK = "What is the result of the expression?";
    private static final char[] OPERANDS = {'*', '+', '-'};

    public static void startCalculatorGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.NUMBEROFROUNDS));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        final int numberLimit = 100;
        final int signAmount = 3;
        final int startNumber = 0;
        String[][] questions = new String[numberOfRounds][2];

        for (int i = 0; i < numberOfRounds; i++) {
            int leftNumber = Utils.generateRandomNumber(startNumber, numberLimit);
            int rightNumber = Utils.generateRandomNumber(startNumber, numberLimit);
            int sign = Utils.generateRandomNumber(startNumber, signAmount - 1);

            questions[i][0] = generateQuestionString(leftNumber, sign, rightNumber);
            questions[i][1] = Integer.toString(solveEquation(leftNumber, sign, rightNumber));
        }
        return questions;
    }

    public static int solveEquation(int left, int operand, int right) {
        int result = 0;
        switch (OPERANDS[operand]) {
            case '*':
                result = left * right;
                break;
            case '+':
                result = left + right;
                break;
            case '-':
                result = left - right;
                break;
            default:
                throw new Error("Unknown operator: " + OPERANDS[operand]);
        }
        return result;
    }

    public static String generateQuestionString(int left, int operand, int right) {
        String question = Integer.toString(left) + " " + OPERANDS[operand] + " " + Integer.toString(right);
        return question;
    }
}
