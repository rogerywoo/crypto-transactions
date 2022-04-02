package com.woo.cryptotransactions.entity.transform;

public enum SizeUnitType {
    BTC(1),
    ETH(2);

    private final int value;

    private SizeUnitType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
