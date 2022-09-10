package hexlet.code.games;

public final class Prime implements Game {
    
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public String[] getQuestion() {
        final int numberLimit = 100;
        String[] question = new String[2];
        int number = (int) (Math.random() * numberLimit);
        question[0] = Integer.toString(number);
        question[1] = isPrime(number);
        return question;
    }
    public static String isPrime(int number) {
        for(int i = 2; i * i <= number; i++) {
            if (number % i == 0) return "no";
        }
        return "yes";
    }
}
