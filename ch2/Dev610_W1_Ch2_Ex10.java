package ch2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 60; j++) {
                switch (i) {
                    case 1 -> {
                        if (j % 10 == 0) {
                            System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    case 2 -> System.out.print(j % 10);
                }
            }
            System.out.println();
        }
    }
}
