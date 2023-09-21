package ch9.ex15;

import ch9.ex14.Shape;

public class Octagon implements Shape {
    private double sideLength;

    public Octagon(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter() {
        return 8 * sideLength;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Octagon octagon = (Octagon) obj;
        return Double.compare(octagon.sideLength, sideLength) == 0;
    }
}

