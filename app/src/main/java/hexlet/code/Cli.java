package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getPlayerName() {
        System.out.print("May I know your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        scanner.close();
        return playerName;
    }

}
