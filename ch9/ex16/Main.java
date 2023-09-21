package ch9.ex16;

public class Main {
    public static void main(String[] args) {
        Hexagon hex1 = new Hexagon(5);
        Hexagon hex2 = new Hexagon(5);
        Hexagon hex3 = new Hexagon(7);

        System.out.println("Area of hex1: " + hex1.getArea());
        System.out.println("Perimeter of hex1: " + hex1.getPerimeter());
        System.out.println("hex1 equals hex2? " + hex1.equals(hex2));
        System.out.println("hex1 equals hex3? " + hex1.equals(hex3));
        hex3.setSideLength(5);
        System.out.println("hex1 equals hex3? " + hex1.equals(hex3));
    }
}


