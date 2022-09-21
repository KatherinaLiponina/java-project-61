package hexlet.code.games;

public final class GCD {
    public static String getTask() {
        final String task = "Find the greatest common divisor of given numbers.";
        return task;
    }
    public static String[] getQuestion() {
        final int numberLimit = 100;
        String[] question = new String[2];
        int firstNumber = (int) (Math.random() * numberLimit) + 1;
        int secondNumber = (int) (Math.random() * numberLimit) + 1;

        question[0] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
        question[1] = Integer.toString(gcd(firstNumber, secondNumber));

        return question;
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
