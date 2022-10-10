package hexlet.code.games;
import hexlet.code.Engine;

public final class Progression {

    public static final String TASK = "What number is missing in the progression?";

    public static void startProgressionGame() {
        Engine.playGame(TASK, generateQuestionAnswerPairs(Engine.NUMBEROFROUNDS));
    }

    public static String[][] generateQuestionAnswerPairs(int numberOfRounds) {
        final int numberLimit = 100;
        final int shiftLimit = 20;
        final int numbersInProgression = 10;
        String[][] questions = new String[numberOfRounds][2];
        for (int i = 0; i < numberOfRounds; i++) {
            int startNumber = (int) (Math.random() * numberLimit);
            int shift = (int) (Math.random() * numberLimit) % shiftLimit + 1;
            int missingNumber = (int) (Math.random() * numberLimit) % numbersInProgression;

            String[] fullProgression = generateProgression(startNumber, shift, numbersInProgression);
            StringBuilder questConstructor = new StringBuilder();
            for (int j = 0; j < numbersInProgression; j++) {
                if (j != missingNumber) {
                    questConstructor.append(fullProgression[j] + " ");
                } else {
                    questConstructor.append(".. ");
                }
            }
            questions[i][0] = questConstructor.toString();
            questions[i][1] = Integer.toString(startNumber + shift * missingNumber);
        }
        return questions;
    }

    public static String[] generateProgression(int startNumber, int shift, int numbersInProgression) {
        String[] progression = new String[numbersInProgression];
        for (int i = 0; i < numbersInProgression; i++) {
            progression[i] = Integer.toString(startNumber + shift * i);
        }
        return progression;
    }
}
