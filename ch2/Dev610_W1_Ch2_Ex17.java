package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex17 {
    public static void main(String[] args) {
        printPattern(4);
        System.out.println();
        printPattern(6);
        System.out.println();
        printPattern(8);
        System.out.println();
        printPattern(10);
    }

    public static void printPattern(int height) {
        int width = height * 3 + height - 2;
        int exclamationCount = width;
        int slashCount = 0;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= slashCount; j++) {
                System.out.print("\\");
            }
            for (int j = 1; j <= exclamationCount; j++) {
                System.out.print("!");
            }
            for (int j = 1; j <= slashCount; j++) {
                System.out.print("/");
            }
            System.out.println();

            exclamationCount -= 4;
            slashCount += 2;
        }
    }
}

// height 4 width 14: 6 \ 2 ! 6 /
// height = 1 | width = 14 | we have 14 ! and 0 \ and 0 /
// height = 2 | width = 14 | we have 10 ! and 2 \ and 2 /
// height = 3 | width = 14 | we have 6 ! and 4 \ and 4 /
// height = 4 | width = 14 | we have 2 ! and 6 \ and 6 /

// height 6 width 22: 10 \ 2 ! 10 /
// height = 1 | width = 22 | we have 22 ! and 0 \ and 0 /
// height = 2 | width = 22 | we have 18 ! and 2 \ and 2 /
// height = 3 | width = 22 | we have 14 ! and 4 \ and 4 /
// height = 4 | width = 22 | we have 10 ! and 6 \ and 6 /
// height = 5 | width = 22 | we have 6 ! and 8 \ and 8 /
// height = 6 | width = 22 | we have 2 ! and 10 \ and 10 /

// height 8 width 30: 14 \ 2 ! 14 /
// height = 1 | width = 30 | we have 30 ! and 0 \ and 0 /
// height = 2 | width = 30 | we have 26 ! and 2 \ and 2 /
// height = 3 | width = 30 | we have 22 ! and 4 \ and 4 /
// height = 4 | width = 30 | we have 18 ! and 6 \ and 6 /
// height = 5 | width = 30 | we have 14 ! and 8 \ and 8 /
// height = 6 | width = 30 | we have 10 ! and 10 \ and 10 /
// height = 7 | width = 30 | we have 6 ! and 12 \ and 12 /
// height = 8 | width = 30 | we have 2 ! and 14 \ and 14 /