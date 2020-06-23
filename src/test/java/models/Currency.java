package models;

import java.util.Random;

public class Currency {
    Currencies type;
    double rate;

    public Currency(Currencies type) {
        this.type = type;
        rate = new Random().nextDouble();
    }

    @Override
    public String toString() {
        return "Currency{" +
                "type=" + type +
                ", rate=" + rate +
                '}';
    }
}

