package ch1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W1_Ch1_Ex13 {
    static int counter = 0;

    public static void main(String[] args) {
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        printHundredTimes();
        System.out.println("Total: " + counter);
    }

    private static void printHundredTimes() {
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
        printTenTimes();
    }

    public static void printTenTimes() {
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
        printLine();
    }

    public static void printLine() {
        System.out.println("All work and no play makes Jack a dull boy.");
        counter++;
    }
}
