package ch13.ex15;


import java.util.Comparator;

public class PointDistanceComparator implements Comparator<Dev610_W5_Ch13_Ex15_Point> {

    @Override
    public int compare(Dev610_W5_Ch13_Ex15_Point point1, Dev610_W5_Ch13_Ex15_Point point2) {
        double distance1 = Math.sqrt(Math.pow(point1.getX(), 2) + Math.pow(point1.getY(), 2));
        double distance2 = Math.sqrt(Math.pow(point2.getX(), 2) + Math.pow(point2.getY(), 2));
        return Double.compare(distance1, distance2);
    }

}

