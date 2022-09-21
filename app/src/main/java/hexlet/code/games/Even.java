package hexlet.code.games;

public final class Even {

    public static String getTask() {
        final String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        return task;
    }
    public static String[] getQuestion() {
        final int numberLimit = 1000;
        String[] question = new String[2];
        int number = (int) (Math.random() * numberLimit);
        question[0] = Integer.toString(number);
        if (isEven(number)) {
            question[1] = "yes";
        } else {
            question[1] = "no";
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
