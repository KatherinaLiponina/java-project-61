package hexlet.code.games;
import hexlet.code.Engine;

public final class Even {

    public static final String TASK = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startEvenGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.getNumberOfRounds()));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        String[][] question = new String[numberOfRounds][2];
        final int limit = 1000;
        for (int i = 0; i < numberOfRounds; i++) {
            int number = (int) (Math.random() * limit) + 1;
            if (isEven(number)) {
                question[i][1] = "yes";
            } else {
                question[i][1] = "no";
            }
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
