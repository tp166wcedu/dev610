package ch8;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Constructs a new Line that contains the given two points specified by their
     * x and y coordinates.
     *
     * @param x1 the x-coordinate of the first point
     * @param y1 the y-coordinate of the first point
     * @param x2 the x-coordinate of the second point
     * @param y2 the y-coordinate of the second point
     */
    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }

    /**
     * Returns the slope of this Line. The slope is calculated using the formula
     * (y2 - y1) / (x2 - x1), where (x1, y1) are the coordinates of the first point and
     * (x2, y2) are the coordinates of the second point.
     *
     * @return The slope of the line connecting the two points.
     * @throws ArithmeticException if the slope is undefined (i.e., x1 equals x2).
     */
    public double getSlope() {
        if (p1.getX() == p2.getX()) {
            throw new ArithmeticException("Slope is undefined");
        }
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    /**
     * Returns true if the given Point is collinear with the Points of this Line.
     *
     * @param p the point to check for collinearity
     * @return true if the points are collinear, false otherwise
     */
    public boolean isCollinear(Point p) {
        double slope1 = (double) (p.getY() - p1.getY()) / (p.getX() - p1.getX());
        double slope2 = (double) (p.getY() - p2.getY()) / (p.getX() - p2.getX());
        double lineSlope = (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

        if (Double.isNaN(slope1) || Double.isNaN(slope2) || Double.isNaN(lineSlope)) {
            return (p.getX() == p1.getX() && p.getX() == p2.getX()) ||
                    (p.getY() == p1.getY() && p.getY() == p2.getY());
        }

        // rounding to 4 decimal places for accuracy
        slope1 = Math.round(slope1 * 10000.0) / 10000.0;
        slope2 = Math.round(slope2 * 10000.0) / 10000.0;
        lineSlope = Math.round(lineSlope * 10000.0) / 10000.0;

        return slope1 == slope2 && slope2 == lineSlope;
    }

    public static void main(String[] args) {
        Line line = new Line(2, 4, 4, 8);
        System.out.println("Line: " + line);
        System.out.printf("Slope: %.2f\n", line.getSlope());
        Point p3 = new Point(6, 12);
        System.out.println("p3, isCollinear: " + line.isCollinear(p3));
        Point p4 = new Point(8, 15);
        System.out.println("p4, isCollinear: " + line.isCollinear(p4));
    }
}
