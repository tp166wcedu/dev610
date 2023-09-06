package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex3 {
    public static void main(String[] args) {
        System.out.println(season(12, 25));
        System.out.println(season(4, 15));
        System.out.println(season(7, 4));
        System.out.println(season(10, 31));
    }

    public static String season(int month, int day) {
        if ((month == 12 && day >= 16) || (month == 1 || month == 2) || (month == 3 && day <= 15)) {
            return "winter";
        } else if (month == 3 || month == 4 || month == 5 || month == 6 && day <= 15) {
            return "spring";
        } else if (month == 6 || month == 7 || month == 8 || month == 9 && day <= 15) {
            return "summer";
        } else {
            return "fall";
        }
    }
}
