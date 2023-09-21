package ch9.ex2;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Janitor extends Employee {

    public Janitor() {
        super();
    }

    @Override
    public double getSalary() {
        return super.getSalary() - 10000;
    }

    @Override
    public int getHours() {
        return super.getHours() * 2;
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }

}