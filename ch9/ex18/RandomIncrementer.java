package ch9.ex18;

import java.util.Random;

class RandomIncrementer implements Incrementable {
    private int value;
    private Random random = new Random();

    public RandomIncrementer() {
        value = random.nextInt();
    }

    @Override
    public void increment() {
        value = random.nextInt();
    }

    @Override
    public int getValue() {
        return value;
    }
}
