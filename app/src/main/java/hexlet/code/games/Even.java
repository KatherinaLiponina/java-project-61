package hexlet.code.games;
import hexlet.code.Engine;

public final class Even {

    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.NUMBEROFROUNDS));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        String[][] question = new String[numberOfRounds][2];
        final int limit = 1000;
        final int startNumber = 1;
        for (int i = 0; i < numberOfRounds; i++) {
            int number = Utils.generateRandomNumber(startNumber, limit);
            question[i][1] = Utils.makeVerdikt(isEven(number));
            question[i][0] = Integer.toString(number);
        }
        return question;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
