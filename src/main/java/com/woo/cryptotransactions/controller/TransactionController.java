package com.woo.cryptotransactions.controller;

import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.entity.transform.ProductType;
import com.woo.cryptotransactions.entity.transform.TransactionType;
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

    @GetMapping("/transaction/BTC_USD")
    public List<Transaction> getAllBtc(){
        return service.getAll(ProductType.BTC_USD);
    }

    @GetMapping("/transaction/ETH_USD")
    public List<Transaction> getAllEth(){
        return service.getAll(ProductType.ETH_USD);
    }

    @GetMapping("/transaction/ETH_USD/bought")
    public List<Transaction> getAllEthBought(){
        return service.getAll(ProductType.ETH_USD, TransactionType.Buy);
    }

    @GetMapping("/transaction/ETH_USD/sold")
    public List<Transaction> getAllEthSold(){
        return service.getAll(ProductType.ETH_USD, TransactionType.Sell);
    }

    @GetMapping("/transaction/BTC_USD/{transactionId}")
    public Transaction getBtcById(@PathVariable Long transactionId){
        return service.getById(transactionId);
    }

    @GetMapping("/transaction")
    public List<Transaction> getAll(){
        return service.getAll();
    }

    @GetMapping("/transaction/{transactionId}")
    public Transaction getById(@PathVariable Long transactionId){
        return service.getById(transactionId);
    }

}



////return axios.get(`${API_URL}/users/${name}/todos`);
//        return axios.get(`${JPA_API_URL}/users/${productType}/todos`);