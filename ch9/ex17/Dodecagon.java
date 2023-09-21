package ch9.ex17;

import ch9.ex14.Shape;

public class Dodecagon implements Shape {
    private double sideLength;

    public Dodecagon(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 3 * Math.pow(sideLength, 2) * (2 - Math.sqrt(3));
    }

    @Override
    public double getPerimeter() {
        return 12 * sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dodecagon that = (Dodecagon) obj;
        return Double.compare(that.sideLength, sideLength) == 0;
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
