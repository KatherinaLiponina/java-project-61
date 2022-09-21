package hexlet.code.games;

public final class Prime {
    public static String getTask() {
        final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return task;
    }
    public static String[][] getRound(int numberOfRounds) {
        final int numberLimit = 100;
        String[][] questions = new String[numberOfRounds][2];
        for (int i = 0; i < numberOfRounds; i++) {
            int number = (int) (Math.random() * numberLimit);
            questions[i][0] = Integer.toString(number);
            if (isPrime(number)) {
                questions[i][1] = "yes";
            } else {
                questions[i][1] = "no";
            }
        }
        return questions;
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
