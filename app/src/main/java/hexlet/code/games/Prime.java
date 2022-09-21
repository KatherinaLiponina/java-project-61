package hexlet.code.games;

public final class Prime {
    public static String getTask() {
        final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return task;
    }
    public static String[] getQuestion() {
        final int numberLimit = 100;
        String[] question = new String[2];
        int number = (int) (Math.random() * numberLimit);
        question[0] = Integer.toString(number);
        if (isPrime(number)) {
            question[1] = "yes";
        } else {
            question[1] = "no";
        }
        return question;
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
