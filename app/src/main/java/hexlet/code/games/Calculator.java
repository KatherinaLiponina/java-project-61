package hexlet.code.games;

public final class Calculator {
    public static String getTask() {
        final String task = "What is the result of expression?";
        return task;
    }

    public static String[] getQuestion() {
        final int numberLimit = 100;
        final int signAmount = 3;
        String[] question = new String[2];

        int leftNumber = (int) (Math.random() * numberLimit);
        int rightNumber = (int) (Math.random() * numberLimit);
        int sign = (int) (Math.random() * numberLimit) % signAmount;

        char charSign;
        int result;
        if (sign == 0) {
            charSign = '*';
            result = leftNumber * rightNumber;
        } else if (sign == 1) {
            charSign = '+';
            result = leftNumber + rightNumber;
        } else {
            charSign = '-';
            result = leftNumber - rightNumber;
        }

        question[0] = Integer.toString(leftNumber) + " " + charSign + " " + Integer.toString(rightNumber);
        question[1] = Integer.toString(result);
        return question;
    }

}
