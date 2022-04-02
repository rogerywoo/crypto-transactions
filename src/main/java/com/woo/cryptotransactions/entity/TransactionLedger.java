package com.woo.cryptotransactions.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class TransactionLedger {
    @Embeddable
    public static class TransactionLedgerId implements Serializable {
        private static final long serialVersionUID = 1L;

        private Long transactionId;
        private Long ledgerId;

        public TransactionLedgerId() {
        }
        public TransactionLedgerId(Long transactionId, Long ledgerId) {
            super();
            this.transactionId = transactionId;
            this.ledgerId = ledgerId;
        }

        public Long getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Long transactionId) {
            this.transactionId = transactionId;
        }

        public Long getLedgerId() {
            return ledgerId;
        }

        public void setLedgerId(Long ledgerId) {
            this.ledgerId = ledgerId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TransactionLedgerId that = (TransactionLedgerId) o;
            return Objects.equals(transactionId, that.transactionId) && Objects.equals(ledgerId, that.ledgerId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(transactionId, ledgerId);
        }
    }

    @EmbeddedId
    private TransactionLedgerId id = new TransactionLedgerId();

    @ManyToOne
    @MapsId("ledgerId")
    private Ledger transaction;

    @ManyToOne
    @MapsId("transactionId")
    private Transaction ledger;

    private Double size;

    public TransactionLedger() {
    }


}
