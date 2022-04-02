package com.woo.cryptotransactions.controller;

import com.woo.cryptotransactions.entity.Ledger;
import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LedgerController {
    @Autowired
    private LedgerService service;

    @GetMapping("/ledger")
    public List<Ledger> getAll(){
        return service.findAll();
    }
    @GetMapping("/ledger/{id}")
    public Ledger getById(@PathVariable Long id){
        return service.getById(id);
    }
}
