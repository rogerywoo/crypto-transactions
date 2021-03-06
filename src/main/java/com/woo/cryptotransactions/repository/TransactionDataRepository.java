package com.woo.cryptotransactions.repository;

import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.entity.transform.ProductType;
import com.woo.cryptotransactions.entity.transform.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionDataRepository extends JpaRepository<Transaction, Long> {

    @Query("SELECT t FROM Transaction t  WHERE t.productType=(:pType)")
    List<Transaction> findByProductType(@Param("pType") ProductType pType);

    @Query("SELECT t FROM Transaction t  WHERE t.productType=(:pType) and t.transactionType=(:tType)")
    List<Transaction> findByProductTypeTransactionType(@Param("pType") ProductType pType, @Param("tType") TransactionType tType);

}
