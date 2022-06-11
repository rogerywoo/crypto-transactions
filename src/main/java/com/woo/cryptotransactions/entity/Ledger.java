package com.woo.cryptotransactions.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Ledger {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;

    private Double totalGain;

//    @Column(columnDefinition="timestamp default CURRENT_TIMESTAMP")
    private Instant createdAt;

    @OneToMany(mappedBy="ledger")
    private Set<TransactionLedger> reconcilations;

    public Ledger() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalGain() {
        return totalGain;
    }

    public void setTotalGain(Double totalGain) {
        this.totalGain = totalGain;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
