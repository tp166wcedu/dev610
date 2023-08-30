package w2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch2_Ex9 {
    public static void main(String[] args) {
        // firstApproach();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 40; j++) {
                switch (i) {
                    case 1, 4 -> System.out.print("-");
                    case 2 -> printPattern(j);
                    case 3 -> printNumbers(j);
                }
            }
            System.out.println();
        }
    }

    private static void printPattern(int position) {
        String pattern = "_-∧-";
        System.out.print(pattern.charAt((position - 1) % 4));
    }

    private static void printNumbers(int position) {
        String numbers = "11223344556677889900";
        System.out.print(numbers.charAt((position - 1) % 20));
    }

    private static void firstApproach() {
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print("_-∧-");
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            System.out.print("11223344556677889900");
        }
        System.out.println();

        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
