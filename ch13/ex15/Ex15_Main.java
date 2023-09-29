package ch13.ex15;

import java.util.ArrayList;
import java.util.List;

public class Ex15_Main {
    public static void main(String[] args) {
        List<Dev610_W5_Ch13_Ex15_Point> points = new ArrayList<>();
        points.add(new Dev610_W5_Ch13_Ex15_Point(3, 4));
        points.add(new Dev610_W5_Ch13_Ex15_Point(1, 2));
        points.add(new Dev610_W5_Ch13_Ex15_Point(5, 6));
        points.sort(new PointDistanceComparator());

        for (Dev610_W5_Ch13_Ex15_Point point : points) {
            System.out.println(point);
        }
    }
}
