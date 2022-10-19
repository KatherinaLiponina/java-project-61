/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;
import java.util.Scanner;
import static hexlet.code.games.Even.startEvenGame;
import static hexlet.code.games.GCD.startGCDGame;
import static hexlet.code.games.Calculator.startCalculatorGame;
import static hexlet.code.games.Prime.startPrimeGame;
import static hexlet.code.games.Progression.startProgressionGame;

public class App {

    static final int CHOICEGREET = 1;
    static final int CHOICEEVEN = 2;
    static final int CHOICECALC = 3;
    static final int CHOICEGCD = 4;
    static final int CHOICEPROGRESSION = 5;
    static final int CHOICEPRIME = 6;
    public static void main(String[] args) {
        int game = getPlayerChoice();
        switch (game) {
            case CHOICEGREET:
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                Scanner scanner = new Scanner(System.in);
                String player = scanner.next();
                System.out.println("Hello, " + player + "!");
                break;
            case CHOICEEVEN:
                startEvenGame();
                break;
            case CHOICECALC:
                startCalculatorGame();
                break;
            case CHOICEGCD:
                startGCDGame();
                break;
            case CHOICEPROGRESSION:
                startProgressionGame();
                break;
            case CHOICEPRIME:
                startPrimeGame();
                break;
            default:
                break;
        }
        return;
    }

    public static int getPlayerChoice() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
