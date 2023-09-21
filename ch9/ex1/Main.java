package ch9.ex1;

public class Main {
    public static void main(String[] args) {
        Marketer marketer = new Marketer();
        System.out.println("Salary: $" + marketer.getSalary());
        marketer.advertise();
    }
}