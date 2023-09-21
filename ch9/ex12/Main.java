package ch9.ex12;

public class Main {
    public static void main(String[] args) {
        TimeSpan span1 = new TimeSpan(2, 30);
        TimeSpan span2 = new TimeSpan(2, 30);
        TimeSpan span3 = new TimeSpan(3, 45);
        TimeSpan span4 = new TimeSpan(0, 150);

        // Testing equals method
        System.out.println("Testing equals method:");
        System.out.println(span1.equals(span2));
        System.out.println(span1.equals(span3));
        System.out.println(span1.equals(span4));

        // Testing hashCode method
        System.out.println("Testing hashCode method:");
        System.out.println(span1.hashCode() == span2.hashCode());
        System.out.println(span1.hashCode() == span3.hashCode());
        System.out.println(span1.hashCode() == span4.hashCode());

        // Testing equals with non-TimeSpan objects
        System.out.println("Testing equals with non-TimeSpan objects:");
        System.out.println(span1.equals(null));
        System.out.println(span1.equals("2h 30m"));

        // Testing hashCode with different objects that are equal
        TimeSpan span5 = new TimeSpan(1, 90);
        System.out.println("Testing hashCode with different objects that are equal:");
        System.out.println(span1.equals(span5));
        System.out.println(span1.hashCode() == span5.hashCode());
    }

}
