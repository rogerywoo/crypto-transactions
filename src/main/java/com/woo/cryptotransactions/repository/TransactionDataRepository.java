package com.woo.cryptotransactions.repository;

import com.woo.cryptotransactions.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDataRepository extends JpaRepository<Transaction, Long> {
}
