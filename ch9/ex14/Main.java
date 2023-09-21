package ch9.ex14;

public class Main {
    public static void main(String[] args) {
        // Testing Rectangle class
        Rectangle rect1 = new Rectangle(5.0, 6.0);
        Rectangle rect2 = new Rectangle(5.0, 6.0);
        Rectangle rect3 = new Rectangle(5.0, 7.0);
        System.out.println(rect1.equals(rect2));
        System.out.println(rect1.equals(rect3));

        // Testing Circle class
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(6.0);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));

        // Testing Triangle class
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
        Triangle triangle3 = new Triangle(3.0, 4.0, 6.0);
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.equals(triangle3));
    }
}

