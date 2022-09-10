package hexlet.code.games;

public final class Progression implements Game {

    public String getTask() {
        return "What number is missing in the progression?";
    }
    public String[] getQuestion() {
        final int numberLimit = 100;
        final int shiftLimit = 20;
        final int numbersInProgression = 10;
        int startNumber = (int) (Math.random() * numberLimit);
        int shift = (int) (Math.random() * numberLimit) % shiftLimit + 1;
        int missingNumber = (int) (Math.random() * numberLimit) % numbersInProgression;
        
        String[] question = new String[2];
        StringBuilder questConstructor = new StringBuilder();
        for (int i = 0; i < numbersInProgression; i++) {
            if (i != missingNumber) {
                questConstructor.append(Integer.toString(startNumber + shift * i) + " ");
            } else {
                questConstructor.append(".. ");
            }
        }
        question[0] = questConstructor.toString();
        question[1] = Integer.toString(startNumber + shift * missingNumber);
        return question;
    }
}
