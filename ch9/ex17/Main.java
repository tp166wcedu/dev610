package ch9.ex17;

public class Main {
    public static void main(String[] args) {
        Dodecagon dodecagon1 = new Dodecagon(5.0);
        Dodecagon dodecagon2 = new Dodecagon(7.0);
        Dodecagon dodecagon3 = new Dodecagon(5.0);

        System.out.println("Dodecagon 1 - Area: " + dodecagon1.getArea() + ", Perimeter: " + dodecagon1.getPerimeter());
        System.out.println("Dodecagon 2 - Area: " + dodecagon2.getArea() + ", Perimeter: " + dodecagon2.getPerimeter());
        System.out.println("Dodecagon 3 - Area: " + dodecagon3.getArea() + ", Perimeter: " + dodecagon3.getPerimeter());

        System.out.println("Dodecagon 1 equals Dodecagon 2: " + dodecagon1.equals(dodecagon2));
        System.out.println("Dodecagon 1 equals Dodecagon 3: " + dodecagon1.equals(dodecagon3));

        dodecagon3.setSideLength(3.0);
        System.out.println("Dodecagon 3 (new side length) - Area: " + dodecagon3.getArea() + ", Perimeter: " + dodecagon3.getPerimeter());
    }
}
