package w3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch3_Ex4 {
    public static void main(String[] args) {
        printSquare(3, 7);
        System.out.println();
        printSquare(1, 7);
        System.out.println();
        printSquare(7, 1);
    }

    public static void printSquare(int min, int max) {
        if (max < min) {
            System.out.println("Invalid inputs. max < min.");
            return;
        }
        for (int row = min; row <= max; row++) {
            int number = row;
            for (int col = min; col <= max; col++) {
                System.out.print(number);

                number++;
                if (number > max) {
                    number = min;
                }
            }
            System.out.println();
        }
    }
}
