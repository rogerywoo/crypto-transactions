package com.woo.cryptotransactions.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Immutable
@Table(name = "vw_ledger")
public class LedgerView {
    @Id
    @Column(name = "ledger_id", nullable = false)
    private Long ledgerId;

    @Column(name = "sold_at")
    private Instant soldAt;

    @Column(name = "size")
    private Double size;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "proceed")
    private Double proceed;

    @Column(name = "gain")
    private Double gain;

    public Double getGain() {
        return gain;
    }

    public Double getProceed() {
        return proceed;
    }

    public Double getCost() {
        return cost;
    }

    public Double getSize() {
        return size;
    }

    public Instant getSoldAt() {
        return soldAt;
    }

    public Long getLedgerId() {
        return ledgerId;
    }

    protected LedgerView() {
    }
}