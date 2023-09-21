package ch9.ex5_6_7_8;

public class AdvanceTicket extends Ticket {
    private int daysInAdvance;

    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        this.daysInAdvance = daysInAdvance;
        setPrice();
    }

    @Override
    protected void setPrice() {
        if (daysInAdvance >= 10) {
            this.price = 30.0;
        } else {
            this.price = 40.0;
        }
    }
}
