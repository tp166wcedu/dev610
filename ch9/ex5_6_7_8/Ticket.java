package ch9.ex5_6_7_8;

public abstract class Ticket {
    protected int number;
    protected double price;

    public Ticket(int number) {
        this.number = number;
        setPrice();
    }

    protected abstract void setPrice();

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Price: " + price;
    }
}
