package ch7;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Dev610_W3_Ch7_Ex12 {

    public static void main(String[] args) {
        int[] bids = {200, 300, 250, 1, 950, 40};
        System.out.println(priceIsRight(bids, 280));
        int[] bids02 = {200, 300, 250, 1, 950, 40};
        System.out.println(priceIsRight(bids02, 0));
    }

    public static int priceIsRight(int[] bids, int correctPrice) {
        int closestBid = -1;
        for (int bid : bids) {
            if (bid <= correctPrice) {
                if (closestBid == -1 || (correctPrice - bid < correctPrice - closestBid)) {
                    closestBid = bid;
                }
            }
        }
        return closestBid;
    }

}

