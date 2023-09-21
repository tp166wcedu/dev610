package ch9.ex2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Employee {
    private double salary;
    private int hours;
    private int vacationDays;

    public Employee() {
        this.salary = 40000;
        this.hours = 40;
        this.vacationDays = 10;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getHours() {
        return this.hours;
    }

    public int getVacationDays() {
        return this.vacationDays;
    }

}

