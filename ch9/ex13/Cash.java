package ch9.ex13;

import java.util.Objects;

public class Cash implements Asset {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getMarketValue() {
        return amount;
    }

    public double getProfit() {
        return 0.0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cash cash = (Cash) obj;
        return Double.compare(cash.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

}
