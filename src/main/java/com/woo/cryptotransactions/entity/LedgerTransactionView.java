package com.woo.cryptotransactions.entity;

import com.woo.cryptotransactions.entity.compositeId.LedgerTransactionId;
import com.woo.cryptotransactions.entity.transform.SizeUnitType;
import com.woo.cryptotransactions.entity.transform.TransactionType;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Immutable
@Table(name = "vw_ledger_transaction")
@IdClass(LedgerTransactionId.class)
public class LedgerTransactionView {
    @Id
    private Long ledgerId;

    @Id
    private Long transactionId;

    @Column(name = "transaction_size")
    private Double transactionSize;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "currency_unit")
    private String currencyUnit;

    @Column(name = "fee", nullable = false)
    private Double fee;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "product_type")
    private Integer productType;

    @Column(name = "size")
    private Double size;

    @Column(name = "size_unit_type")
    private SizeUnitType sizeUnitType;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "trade_id")
    private Long tradeId;

    @Column(name = "transaction_type", nullable = false)
    private TransactionType transactionType;

    @Column(name = "completed")
    private Boolean completed;

    @Column(name = "fee_per")
    private Double feePer;

    protected LedgerTransactionView() {
    }

    public Double getFeePer() {
        return feePer;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public Double getTotal() {
        return total;
    }

    public SizeUnitType getSizeUnitType() {
        return sizeUnitType;
    }

    public Double getSize() {
        return size;
    }

    public Integer getProductType() {
        return productType;
    }

    public Double getPrice() {
        return price;
    }

    public Double getFee() {
        return fee;
    }

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Long getLedgerId() {
        return ledgerId;
    }

    public Double getTransactionSize() {
        return transactionSize;
    }
}


