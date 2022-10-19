package hexlet.code.games;

public final class Utils {
    public static int generateRandomNumber(int startNumber, int endNumber) {
        return (int) (Math.random() * (endNumber - startNumber)) + startNumber;
    }

    public static String makeVerdikt(boolean result) {
        return result ? "yes" : "no";
    }
}
