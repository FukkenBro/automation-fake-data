package models;

public enum CardHolder {
    VISA(new int[]{1, 1, 1, 1}), MAESTRO(new int[]{2, 2, 2, 2}), MASTERCARD(new int[]{3, 3, 3, 3}), PAYONEER(new int[]{4, 4, 4, 4}), PAYPAL(new int[]{5, 5, 5, 5});

    CardHolder(int[] code) {
        this.code = code;
    }

    int[] code = new int[4];

    public int[] getCode() {
        return code;
    }
}
