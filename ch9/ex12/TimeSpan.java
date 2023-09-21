package ch9.ex12;

// Represents a time span of elapsed hours and minutes.
// Second implementation using a single field for total minutes.
// Class invariant: totalMinutes >= 0

import java.util.Objects;

public class TimeSpan {
    private int totalMinutes;

    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += 60 * hours + minutes;
    }

    public void add(TimeSpan span) {
        this.totalMinutes += span.totalMinutes;
    }

    public void subtract(TimeSpan span) {
        this.totalMinutes -= span.totalMinutes;
        if (this.totalMinutes < 0) {
            this.totalMinutes = 0;
        }
    }

    public void scale(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException();
        }
        this.totalMinutes *= factor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeSpan other = (TimeSpan) obj;
        return totalMinutes == other.totalMinutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMinutes);
    }

    public String toString() {
        return (totalMinutes / 60) + "h " +
                (totalMinutes % 60) + "m";
    }

}

