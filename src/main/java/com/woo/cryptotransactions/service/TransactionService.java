package com.woo.cryptotransactions.service;

import com.woo.cryptotransactions.entity.Transaction;
import com.woo.cryptotransactions.entity.transform.ProductType;
import com.woo.cryptotransactions.entity.transform.TransactionType;
import com.woo.cryptotransactions.repository.LedgerDataRepository;
import com.woo.cryptotransactions.repository.TransactionDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TransactionService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TransactionDataRepository dataRepository;

    public List<Transaction> getAll(){
        return dataRepository.findAll();
    }

    public List<Transaction> getAll(ProductType productType){
        return dataRepository.findByProductType(productType);
    }

    public List<Transaction> getAll(ProductType productType, TransactionType transactionType){
        return dataRepository.findByProductTypeTransactionType(productType, transactionType);
    }

    public Transaction getById(Long id){
        Transaction rtnTransaction =  dataRepository.getById(id);
        Double test = rtnTransaction.getFee();
        return rtnTransaction;
    }

    public Transaction getBtcById(Long id){
        Transaction rtnTransaction =  dataRepository.getById(id);
        Double test = rtnTransaction.getFee();
        return rtnTransaction;
    }
}
