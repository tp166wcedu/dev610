package ch9.ex5_6_7_8;

public class StudentAdvanceTicket extends AdvanceTicket {

    public StudentAdvanceTicket(int number, int daysInAdvance) {
        super(number, daysInAdvance);
    }

    @Override
    protected void setPrice() {
        super.setPrice();
        this.price /= 2;
    }

    @Override
    public String toString() {
        return super.toString() + " (ID required)";
    }

}

