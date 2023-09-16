package ch8;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Point {
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

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Ex1
    public int manhattanDistance(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    // Ex2
    public boolean isVertical(Point other) {
        return this.x == other.x;
    }

    // Ex3
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("The x-coordinates are identical, slope is undefined");
        }
        return (double) (other.y - this.y) / (other.x - this.x);
    }

    // Ex4
    public boolean isCollinear(Point p1, Point p2) {
        // Special case where x-coordinates or y-coordinates are equal
        if ((x == p1.x && x == p2.x) || (y == p1.y && y == p2.y)) {
            return true;
        }

        double slope1, slope2, slope3;
        try {
            slope1 = Math.round(10000.0 * (p1.y - y) / (p1.x - x)) / 10000.0;
        } catch (ArithmeticException e) {
            slope1 = Double.POSITIVE_INFINITY;
        }

        try {
            slope2 = Math.round(10000.0 * (p2.y - y) / (p2.x - x)) / 10000.0;
        } catch (ArithmeticException e) {
            slope2 = Double.POSITIVE_INFINITY;
        }

        try {
            slope3 = Math.round(10000.0 * (p2.y - p1.y) / (p2.x - p1.x)) / 10000.0;
        } catch (ArithmeticException e) {
            slope3 = Double.POSITIVE_INFINITY;
        }

        // check if all slopes are equal
        return slope1 == slope2 && slope2 == slope3;
    }

    public static void main(String[] args) {
        // prevTestCases();
        Point p3 = new Point(2, 3);
        Point p4 = new Point(4, 6);
        Point p5 = new Point(6, 9);
        System.out.println("Point 3: " + p3);
        System.out.println("Point 4: " + p4);
        System.out.println("Point 5: " + p5);
        System.out.println("Are points 3, 4, and 5 collinear? " + p3.isCollinear(p4, p5));
    }

    private static void prevTestCases() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 5);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Manhattan distance: " + p1.manhattanDistance(p2));
        System.out.println("isVertical: " + p1.isVertical(p2));
        System.out.printf("slope: %.2f\n", p1.slope(p2));
    }
}


