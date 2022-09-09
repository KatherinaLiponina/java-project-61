package hexlet.code.games;

public class Even implements Game{

    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String[] getQuestion() {
        final int numberLimit = 1000;
        String[] question = new String[2];
        int number = (int) (Math.random() * numberLimit);
        question[0] = Integer.toString(number);
        question[1] = isEven(number);
        return question;
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
