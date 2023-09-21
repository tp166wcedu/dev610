package ch9.ex1;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class Marketer extends Employee {

    public Marketer() {
        super();
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }

}
