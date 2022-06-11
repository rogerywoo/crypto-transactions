package com.woo.cryptotransactions.service;

import com.woo.cryptotransactions.entity.Ledger;
import com.woo.cryptotransactions.entity.LedgerView;
import com.woo.cryptotransactions.repository.LedgerDataRepository;
import com.woo.cryptotransactions.repository.LedgerViewDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class LedgerViewService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LedgerViewDataRepository dataRepository;

    public List<LedgerView> getAll(){
        List<LedgerView> rtnList = dataRepository.findAll();
        return rtnList;
    }

    public LedgerView getById(Long id){
        LedgerView rtnObject =  dataRepository.getById(id);
        return rtnObject;

    }
}
