package ch9.ex18;

class SequentialIncrementer implements Incrementable {
    private int value = 0;

    @Override
    public void increment() {
        value++;
    }

    @Override
    public int getValue() {
        return value;
    }
}
