package ch9.ex18;

public class Main {
    public static void main(String[] args) {
        Incrementable seqInc = new SequentialIncrementer();
        Incrementable randInc = new RandomIncrementer();

        seqInc.increment();
        System.out.println("Sequential Incremented Value: " + seqInc.getValue());

        randInc.increment();
        System.out.println("Random Incremented Value: " + randInc.getValue());
    }
}
