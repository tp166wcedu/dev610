package ch8;

// Represents a time span of elapsed hours and minutes.
// Second implementation using a single field for total minutes.
// Class invariant: totalMinutes >= 0

public class TimeSpan {
    private int totalMinutes;

    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += 60 * hours + minutes;
    }

    // Ex5
    // Adds the given time span to this time span.
    public void add(TimeSpan span) {
        this.totalMinutes += span.totalMinutes;
    }

    // Ex6
    public void subtract(TimeSpan span) {
        this.totalMinutes -= span.totalMinutes;
        if (this.totalMinutes < 0) {
            this.totalMinutes = 0;
        }
    }

    // Ex7
    public void scale(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException();
        }
        this.totalMinutes *= factor;
    }

    // Returns a string for this time span, such as "6h 15m".
    public String toString() {
        return (totalMinutes / 60) + "h " +
                (totalMinutes % 60) + "m";
    }

    public static void main(String[] args) {
        // Creating two TimeSpan objects with different hours and minutes
        TimeSpan timeSpan1 = new TimeSpan(2, 30);
        TimeSpan timeSpan2 = new TimeSpan(3, 45);

        // Printing initial time spans
        System.out.println("Initial time spans:");
        System.out.println("TimeSpan1: " + timeSpan1);
        System.out.println("TimeSpan2: " + timeSpan2);

        // Adding a new time interval to timeSpan1
        timeSpan1.add(1, 20);
        System.out.println("\nAfter adding 1 hour and 20 minutes to TimeSpan1:");
        System.out.println("TimeSpan1: " + timeSpan1);

        // Adding timeSpan2 to timeSpan1
        timeSpan1.add(timeSpan2);
        System.out.println("\nAfter adding TimeSpan2 to TimeSpan1:");
        System.out.println("TimeSpan1: " + timeSpan1);

        // Testing toString method
        System.out.println("\nTesting toString method:");
        System.out.println("TimeSpan1: " + timeSpan1);
        System.out.println("TimeSpan2: " + timeSpan2);

        // Subtracting timeSpan2 from timeSpan1
        timeSpan1.subtract(timeSpan2);
        System.out.println("\nAfter subtracting TimeSpan2 from TimeSpan1:");
        System.out.println("TimeSpan1: " + timeSpan1);

        // Scaling timeSpan2 by a factor of 2
        timeSpan2.scale(2);
        System.out.println("\nAfter scaling TimeSpan2 by a factor of 2:");
        System.out.println("TimeSpan2: " + timeSpan2);
    }
}

