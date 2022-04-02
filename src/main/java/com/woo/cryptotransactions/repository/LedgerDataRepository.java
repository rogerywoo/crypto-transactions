package com.woo.cryptotransactions.repository;

import com.woo.cryptotransactions.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LedgerDataRepository extends JpaRepository<Ledger, Long> {
}
