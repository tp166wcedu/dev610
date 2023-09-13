package ch4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex5 {
    public static void main(String[] args) {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);

        printRangeV2(2, 7);
        printRangeV2(19, 11);
        printRangeV2(5, 5);
    }

    public static void printRange(int start, int end) {
        System.out.print("[");
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i);
                if (i < end) {
                    System.out.print(", ");
                }
            }
        } else if (start > end) {
            for (int i = start; i >= end; i--) {
                System.out.print(i);
                if (i > end) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.print(start);
        }
        System.out.println("]");
    }

    public static void printRangeV2(int start, int end) {
        System.out.print("[");
        for (int i = start; i != end; i += (start < end ? 1 : -1)) {
            System.out.print(i + ", ");
        }
        System.out.println(end + "]");
    }

}
