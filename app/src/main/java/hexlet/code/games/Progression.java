package hexlet.code.games;

public final class Progression {

    public static String getTask() {
        final String task = "What number is missing in the progression?";
        return task;
    }
    public static String[] getQuestion() {
        final int numberLimit = 100;
        final int shiftLimit = 20;
        final int numbersInProgression = 10;
        int startNumber = (int) (Math.random() * numberLimit);
        int shift = (int) (Math.random() * numberLimit) % shiftLimit + 1;
        int missingNumber = (int) (Math.random() * numberLimit) % numbersInProgression;

        String[] question = new String[2];
        question[0] = progressionMaker(startNumber, shift, missingNumber, numbersInProgression);
        question[1] = Integer.toString(startNumber + shift * missingNumber);
        return question;
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
