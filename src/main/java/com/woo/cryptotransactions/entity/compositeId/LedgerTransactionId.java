package com.woo.cryptotransactions.entity.compositeId;

import java.io.Serializable;

public class LedgerTransactionId implements Serializable {
    private Long ledgerId;
    private Long transactionId;

    public LedgerTransactionId() {
//        this.ledgerId = ledgerId;
//        this.transactionId = transactionId;
    }

    public LedgerTransactionId(Long ledgerId, Long transactionId) {
        this.ledgerId = ledgerId;
        this.transactionId = transactionId;
    }
}
