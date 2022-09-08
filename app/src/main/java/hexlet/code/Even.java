package hexlet.code;

import java.util.Scanner;

public class Even {
    public static int gameProcess() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        final int amountOfRounds = 3;
        final int numberLimit = 1000;
        for (int i = 0; i < amountOfRounds; i++) {
            int number = (int) (Math.random() * numberLimit);
            System.out.println("Question: " + number);
            String answer = scanner.next();
            if (answer.equals(Even.isEven(number))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + isEven(number) + "'");
                return 0;
            }
        }
        return 1;
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
