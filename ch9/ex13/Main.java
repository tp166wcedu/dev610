package ch9.ex13;

public class Main {
    public static void main(String[] args) {
        Cash cash1 = new Cash(100.0);
        Cash cash2 = new Cash(100.0);
        Cash cash3 = new Cash(200.0);

        System.out.println("Comparing cash1 and cash2: " + cash1.equals(cash2));
        System.out.println("Comparing cash1 and cash3: " + cash1.equals(cash3));
        System.out.println("Comparing cash2 and cash3: " + cash2.equals(cash3));
    }
}

