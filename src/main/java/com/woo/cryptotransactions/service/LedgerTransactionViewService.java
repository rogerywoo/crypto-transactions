package com.woo.cryptotransactions.service;

import com.woo.cryptotransactions.entity.LedgerTransactionView;
import com.woo.cryptotransactions.repository.LedgerTransactionViewDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class LedgerTransactionViewService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LedgerTransactionViewDataRepository dataRepository;

    public List<LedgerTransactionView> getAll(){
        List<LedgerTransactionView> rtnList = dataRepository.findAll();
        return rtnList;
    }

    public List<LedgerTransactionView> getAllByLedgerId(Long id){
        List<LedgerTransactionView> rtnTransaction =  dataRepository.findByLedgerId(id);
        return rtnTransaction;

    }
}
