package ch8;

/**
 * The Rectangle class represents a rectangular two-dimensional region defined by its top-left coordinates (x, y), width, and height.
 */
public class Rectangle {
    /**
     * The x-coordinate of the top-left corner of the rectangle
     */
    private int x;

    /**
     * The y-coordinate of the top-left corner of the rectangle
     */
    private int y;
    private int width;
    private int height;

    /**
     * Constructs a new Rectangle with the specified parameters.
     *
     * @param x      the x-coordinate of the top-left corner of the rectangle
     * @param y      the y-coordinate of the top-left corner of the rectangle
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     * @throws IllegalArgumentException if width or height is negative
     */
    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be non-negative");
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Ex14

    /**
     * Constructs a new Rectangle with the top-left corner specified by the given Point and the specified width and height.
     *
     * @param p      The Point specifying the top-left corner of the rectangle.
     * @param width  The width of the rectangle. Must be non-negative.
     * @param height The height of the rectangle. Must be non-negative.
     * @throws IllegalArgumentException if width or height is negative.
     */
    public Rectangle(Point p, int width, int height) {
        this(p.x, p.y, width, height);
    }

    /**
     * Returns the height of this Rectangle.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns the width of this Rectangle.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the x-coordinate of this Rectangle.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this Rectangle.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    // Ex15

    /**
     * Checks whether the given point specified by the x and y coordinates lies inside the rectangle.
     *
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @return true if the point lies inside the rectangle, false otherwise.
     */
    public boolean contains(int x, int y) {
        return x >= this.x && x <= this.x + this.width && y >= this.y && y <= this.y + this.height;
    }

    // Ex15

    /**
     * Checks whether the given point lies inside the rectangle.
     *
     * @param p The point to check.
     * @return true if the point lies inside the rectangle, false otherwise.
     */
    public boolean contains(Point p) {
        return contains(p.x, p.y);
    }

    // Ex16

    /**
     * Creates a new rectangle that encompasses both this rectangle and another rectangle.
     *
     * @param rect The other rectangle.
     * @return A new rectangle that is the union of the two rectangles.
     */
    public Rectangle union(Rectangle rect) {
        int newX = Math.min(this.x, rect.x);
        int newY = Math.min(this.y, rect.y);
        int newWidth = Math.max(this.x + this.width, rect.x + rect.width) - newX;
        int newHeight = Math.max(this.y + this.height, rect.y + rect.height) - newY;

        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    // Ex17

    /**
     * Creates a new rectangle that represents the intersection of this rectangle and another rectangle.
     *
     * @param rect The other rectangle.
     * @return A new rectangle that is the intersection of the two rectangles. If there is no intersection, returns a rectangle with width and height both equal to 0.
     */
    public Rectangle intersection(Rectangle rect) {
        int newX = Math.max(this.x, rect.x);
        int newY = Math.max(this.y, rect.y);
        int newWidth = Math.min(this.x + this.width, rect.x + rect.width) - newX;
        int newHeight = Math.min(this.y + this.height, rect.y + rect.height) - newY;

        if (newWidth < 0 || newHeight < 0) {
            newWidth = 0;
            newHeight = 0;
        }

        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    /**
     * Returns a String representation of this Rectangle.
     *
     * @return a string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }

    public static void main(String[] args) {
        try {
            // Creating Point class instances to be used in the tests
            Point p1 = new Point(3, 4);
            Point p2 = new Point(5, 6);

            // Creating Rectangle class instances to be used in the tests
            Rectangle rect1 = new Rectangle(0, 0, 4, 4);
            Rectangle rect2 = new Rectangle(2, 2, 4, 4);
            Rectangle rect3 = new Rectangle(5, 5, 2, 2);
            Rectangle rect4 = new Rectangle(p1, 2, 2);

            // Test cases for the contains method
            System.out.println("Contains method:");
            System.out.println(rect1.contains(2, 2));
            System.out.println(rect1.contains(p1));
            System.out.println(rect1.contains(5, 5));

            // Test cases for the union method
            System.out.println("Union method:");
            System.out.println(rect1.union(rect2));
            System.out.println(rect2.union(rect3));

            // Test cases for the intersection method
            System.out.println("Intersection method:");
            System.out.println(rect1.intersection(rect2));
            System.out.println(rect2.intersection(rect3));
            // Test case for the intersection method where the rectangles do not intersect
            System.out.println("Intersection method (no intersection):");
            Rectangle rect5 = new Rectangle(10, 10, 2, 2);
            System.out.println(rect1.intersection(rect5));

            // prevTestCases();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static void prevTestCases() {
        // Creating a new Rectangle object with valid parameters
        Rectangle rect1 = new Rectangle(1, 2, 3, 4);
        System.out.println("Rectangle 1: " + rect1.toString());

        // Testing the getter methods
        System.out.println("Rectangle 1 width: " + rect1.getWidth());
        System.out.println("Rectangle 1 height: " + rect1.getHeight());
        System.out.println("Rectangle 1 x-coordinate: " + rect1.getX());
        System.out.println("Rectangle 1 y-coordinate: " + rect1.getY());

        // Creating a new Rectangle object with a negative width, which should throw an exception
        try {
            Rectangle rect2 = new Rectangle(1, 2, -3, 4);
            System.out.println("Rectangle 2: " + rect2.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Rectangle 2: " + e.getMessage());
        }

        // Creating a new Rectangle object with a negative height, which should throw an exception
        try {
            Rectangle rect3 = new Rectangle(1, 2, 3, -4);
            System.out.println("Rectangle 3: " + rect3.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Rectangle 3: " + e.getMessage());
        }
    }
}

