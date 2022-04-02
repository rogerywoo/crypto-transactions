package com.woo.cryptotransactions.entity.transform;

public enum TransactionType {
    Buy(-1),
    Sell(1);

    private final int value;

    private TransactionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
