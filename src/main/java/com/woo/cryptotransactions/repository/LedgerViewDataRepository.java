package com.woo.cryptotransactions.repository;

import com.woo.cryptotransactions.entity.LedgerView;
import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.entity.transform.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LedgerViewDataRepository extends JpaRepository<LedgerView, Long> {

    @Query("SELECT t FROM Transaction t  WHERE t.productType=(:pType)")
    List<Transaction> findByProductType(@Param("pType") ProductType pType);

}
