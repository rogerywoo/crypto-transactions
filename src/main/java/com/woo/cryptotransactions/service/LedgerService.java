package com.woo.cryptotransactions.service;

import com.woo.cryptotransactions.entity.Ledger;
import com.woo.cryptotransactions.repository.LedgerDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class LedgerService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LedgerDataRepository dataRepository;

    public List<Ledger> findAll(){
        List<Ledger> rtnList = dataRepository.findAll();
        return rtnList;
    }

    public Ledger getById(Long id){
        Ledger rtnTransaction =  dataRepository.getById(id);
        return rtnTransaction;

    }
}
