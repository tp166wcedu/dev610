package ch9.ex2;


public class Main {
    public static void main(String[] args) {
        Janitor janitor = new Janitor();
        System.out.printf("Salary: $%,.2f\n", janitor.getSalary());
        System.out.println("Working Hours: " + janitor.getHours() + " hours/week");
        System.out.println("Vacation Days: " + janitor.getVacationDays() + " days");
        janitor.clean();
    }
}