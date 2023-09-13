package ch1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex1 {
    public static void main(String[] args) {
        String message = "Victory is mine!";
        // String message = "Victory  sdf s is  sdfsdf mine!";
        printBorder(message, "/");
        printMessage(message);
        printBorder(message, "\\");
    }

    public static void printBorder(String message, String character) {
        // Add 6 for the space and the vertical bars || on both sides
        int totalLength = message.length() + 6;
        for (int i = 0; i < totalLength; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    public static void printMessage(String message) {
        System.out.println("|| " + message + " ||");
    }
}
