package hexlet.code.games;

public final class Even {

    public static String getTask() {
        final String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        return task;
    }
    public static String[][] getRound(int numberOfRounds) {
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
