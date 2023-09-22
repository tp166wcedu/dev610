package ch10.ex19;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Point implements Comparable<Point> {
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setLocation(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point other) {
        if (this.y < other.y) {
            return -1;
        } else if (this.y > other.y) {
            return 1;
        } else {
            // y values are equal; compare x values
            // both x and y are equal
            return Integer.compare(this.x, other.x);
        }
    }

}


