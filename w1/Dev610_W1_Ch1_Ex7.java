package w1;

import static w1.Dev610_W1_Ch1_Ex1.printBorder;
import static w1.Dev610_W1_Ch1_Ex1.printMessage;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex7 {
    public static void main(String[] args) {
        String message = "Victory is mine!";
        // String message = "Victory  sdf s is  sdfsdf mine!";
        int repetitions = 5;

        // Print the top border once
        printBorder(message, "/");
        for (int i = 0; i < repetitions; i++) {
            printMessage(message);
            printBorder(message, "\\");
        }
    }
}
