package ch9.ex16;


import ch9.ex14.Shape;

public class Hexagon implements Shape {
    private double sideLength;

    public Hexagon(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.sideLength = sideLength;
    }

    public double getArea() {
        return (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
    }

    public double getPerimeter() {
        return 6 * sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hexagon hexagon = (Hexagon) obj;
        return Double.compare(hexagon.sideLength, sideLength) == 0;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.sideLength = sideLength;
    }
}

