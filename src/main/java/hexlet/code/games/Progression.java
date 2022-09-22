package hexlet.code.games;

public final class Progression {

    public static String getTask() {
        final String task = "What number is missing in the progression?";
        return task;
    }
    public static String[][] getRound(int numberOfRounds) {
        final int numberLimit = 100;
        final int shiftLimit = 20;
        final int numbersInProgression = 10;
        String[][] questions = new String[numberOfRounds][2];
        for (int i = 0; i < numberOfRounds; i++) {
            int startNumber = (int) (Math.random() * numberLimit);
            int shift = (int) (Math.random() * numberLimit) % shiftLimit + 1;
            int missingNumber = (int) (Math.random() * numberLimit) % numbersInProgression;

            questions[i][0] = progressionMaker(startNumber, shift, missingNumber, numbersInProgression);
            questions[i][1] = Integer.toString(startNumber + shift * missingNumber);
        }
        return questions;
    }

    public static String progressionMaker(int startNumber, int shift, int missingNumber, int numbersInProgression) {
        StringBuilder questConstructor = new StringBuilder();
        for (int i = 0; i < numbersInProgression; i++) {
            if (i != missingNumber) {
                questConstructor.append(Integer.toString(startNumber + shift * i) + " ");
            } else {
                questConstructor.append(".. ");
            }
        }
        return questConstructor.toString();
    }
}
