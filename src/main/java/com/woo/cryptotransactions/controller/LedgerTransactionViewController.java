package com.woo.cryptotransactions.controller;

import com.woo.cryptotransactions.entity.LedgerTransactionView;
import com.woo.cryptotransactions.service.LedgerTransactionViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LedgerTransactionViewController {
    @Autowired
    private LedgerTransactionViewService service;


    @GetMapping("/ledger-transaction")
    public List<LedgerTransactionView> getAll(){
        return service.getAll();
    }

    @GetMapping("/ledger-transaction/{id}")
    public List<LedgerTransactionView> getById(@PathVariable Long id){
        return service.getAllByLedgerId(id);
    }

}
