package com.woo.cryptotransactions.controller;

import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.service.LedgerService;
import com.woo.cryptotransactions.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class TransactionController {
    @Autowired
    private TransactionService service;

    @GetMapping("/transaction")
    public List<Transaction> getAll(){
        return service.findAll();
    }

    @GetMapping("/transaction/{transactionId}")
    public Transaction getById(@PathVariable Long transactionId){
        return service.getById(transactionId);
    }
}
