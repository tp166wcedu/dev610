package ch9.ex5_6_7_8;

public class WalkupTicket extends Ticket {

    public WalkupTicket(int number) {
        super(number);
    }

    @Override
    protected void setPrice() {
        this.price = 50.0;
    }
}
