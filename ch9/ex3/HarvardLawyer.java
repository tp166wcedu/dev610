package ch9.ex3;

/**
 * DEV 610 | Professor: Ghani Zahid
 *
 * @author Tanh Tran Minh Tin Pham, B203114
 */
public class HarvardLawyer extends Lawyer {

    public HarvardLawyer() {
        super();
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.20;
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    @Override
    public String getVacationForm() {
        return super.getVacationForm().repeat(4);
    }
}

