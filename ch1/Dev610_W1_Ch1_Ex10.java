package ch1;

import org.jetbrains.annotations.Nullable;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex10 {
    public static void main(String[] args) {
        pyramidPattern();
        dividerPattern();
        middlePattern(null, null);
        dividerPattern();
        middlePattern("United", "States");
        dividerPattern();
        middlePattern(null, null);
        dividerPattern();
        pyramidPattern();
    }

    private static void pyramidPattern() {
        System.out.println("   /\\       /\\   ");
        System.out.println("  /  \\     /  \\  ");
        System.out.println(" /    \\   /    \\ ");
    }

    private static void middlePattern(@Nullable String topMsg, @Nullable String bottomMsg) {
        if (topMsg == null && bottomMsg == null) {
            System.out.println("|      | |      |");
            System.out.println("|      | |      |");
        } else {
            // Additional validation needed for making sure str length is 6
            // Otherwise, patterns need to be adapted to the str length
            System.out.printf("|%s| |%s|\n", topMsg, topMsg);
            System.out.printf("|%s| |%s|\n", bottomMsg, bottomMsg);
        }
    }

    private static void dividerPattern() {
        System.out.println("+------+ +------+");
    }
}
