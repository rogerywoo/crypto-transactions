package com.woo.cryptotransactions.repository;

import com.woo.cryptotransactions.entity.Ledger;
import com.woo.cryptotransactions.entity.LedgerTransactionView;
import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.entity.compositeId.LedgerTransactionId;
import com.woo.cryptotransactions.entity.transform.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LedgerTransactionViewDataRepository extends JpaRepository<LedgerTransactionView, LedgerTransactionId> {

    @Query("SELECT lt FROM LedgerTransactionView lt  WHERE lt.ledgerId=(:ledgerId)")
    List<LedgerTransactionView> findByLedgerId(@Param("ledgerId") Long ledgerId);

//    @Query("SELECT lt FROM LedgerTransactionView lt")
//    List<LedgerTransactionView> findByLedger4Id();


//    @Query("SELECT t FROM Transaction t  WHERE t.productType=(:pType)")
//    List<Transaction> findByProductType(@Param("pType") ProductType pType);

}
