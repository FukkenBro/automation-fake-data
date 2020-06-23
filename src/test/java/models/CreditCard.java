package models;

import java.util.Arrays;

public class CreditCard {

    CardHolder cardHolder;
    int[] number = new int[16];
    int[] expirationDate = new int[4];
    int[] CVV = new int[3];

    public CreditCard(CardHolder cardHolder, int[] number, int[] expirationDate, int[] CVV) {
        this.cardHolder = cardHolder;
        this.number = number;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + Arrays.toString(number) +
                ", expirationDate=" + Arrays.toString(expirationDate) +
                ", CVV=" + Arrays.toString(CVV) +
                '}';
    }
}
