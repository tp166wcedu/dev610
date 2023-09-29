package ch12;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W5_Ch12_Ex20 {

    public static void main(String[] args) {
        waysToClimb(3);
        System.out.println();
        waysToClimb(4);
    }

    public static void waysToClimb(int stairs) {
        waysToClimb(stairs, "");
    }

    private static void waysToClimb(int remainingStairs, String path) {
        if (remainingStairs == 0) {
            System.out.println(formatOutput(path));
            return;
        }

        if (remainingStairs >= 1) {
            waysToClimb(remainingStairs - 1, path + "1");
        }

        if (remainingStairs >= 2) {
            waysToClimb(remainingStairs - 2, path + "2");
        }
    }

    private static String formatOutput(String path) {
        StringBuilder formatted = new StringBuilder("[");
        for (char step : path.toCharArray()) {
            formatted.append(step).append(", ");
        }
        if (formatted.length() > 1) {
            formatted.setLength(formatted.length() - 2);
        }
        formatted.append("]");
        return formatted.toString();
    }

}

