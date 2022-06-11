package com.woo.cryptotransactions.controller;

import com.woo.cryptotransactions.entity.LedgerView;
import com.woo.cryptotransactions.service.LedgerViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LedgerViewController {
    @Autowired
    private LedgerViewService service;

    @GetMapping("/ledger-view")
    public List<LedgerView> getAll(){
        return service.getAll();
    }

    @GetMapping("/ledger-view/{id}")
    public LedgerView getById(@PathVariable Long id){
        return service.getById(id);
    }
}
