package w4;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W2_Ch4_Ex12 {
    public static void main(String[] args) {
        System.out.println(getGrade(59));
        System.out.println(getGrade(61));
        System.out.println(getGrade(63));
        System.out.println(getGrade(64));
        System.out.println(getGrade(65));
        System.out.println(getGrade(75));
        System.out.println(getGrade(85));
        System.out.println(getGrade(95));
        System.out.println(getGrade(101));
    }

    public static double getGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score < 60) {
            return 0.0;
        } else if (score <= 62) {
            return 0.7;
        } else if (score == 63) {
            return 0.8;
        } else if (score == 64) {
            return 0.9;
        } else if (score >= 95) {
            return 4.0;
        } else {
            return 1.0 + (score - 65) * 0.1;
        }
    }

}
