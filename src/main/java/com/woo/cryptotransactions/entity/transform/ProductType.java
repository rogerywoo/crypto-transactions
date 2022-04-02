package com.woo.cryptotransactions.entity.transform;

public enum ProductType {
    BTC_USD(1),
    ETH_USD(2);

    private int value;

    private ProductType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
