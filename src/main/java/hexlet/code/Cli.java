package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getPlayerName() {
        System.out.print("May I know your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        return playerName;
    }

    public static int playerChoice() {
        System.out.println("Please enter the game number and press Enter");
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
