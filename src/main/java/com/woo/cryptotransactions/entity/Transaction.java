package com.woo.cryptotransactions.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.woo.cryptotransactions.entity.transform.ProductType;
import com.woo.cryptotransactions.entity.transform.SizeUnitType;
import com.woo.cryptotransactions.entity.transform.TransactionType;

import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Transaction {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    private Long id;

    private Long tradeId;

    private ProductType productType;


    @Column(nullable=false)
    private TransactionType transactionType;

//    @Column(columnDefinition="timestamp default CURRENT_TIMESTAMP")
    private Date createdAt;

    private Double size;

    private SizeUnitType sizeUnitType;

    private double price;

    private double fee;

    private double total;

    private String currencyUnit;

    private Boolean completed;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public SizeUnitType getSizeUnitType() {
        return sizeUnitType;
    }

    public void setSizeUnitType(SizeUnitType sizeUnitType) {
        this.sizeUnitType = sizeUnitType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
