package ch9.ex15;

public class Main {
    public static void main(String[] args) {
        Octagon octagon1 = new Octagon(5.0);
        Octagon octagon2 = new Octagon(7.0);

        System.out.println("Octagon1 - Area: " + octagon1.getArea() + ", Perimeter: " + octagon1.getPerimeter());
        System.out.println("Octagon2 - Area: " + octagon2.getArea() + ", Perimeter: " + octagon2.getPerimeter());
        System.out.println("Are octagon1 and octagon2 equal? " + octagon1.equals(octagon2));
        octagon2.setSideLength(5.0);
        System.out.println("Are octagon1 and octagon2 equal? " + octagon1.equals(octagon2));
        try {
            Octagon octagon3 = new Octagon(-3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create octagon with negative side length: " + e.getMessage());
        }
    }
}

