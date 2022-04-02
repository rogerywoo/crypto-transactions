package com.woo.cryptotransactions.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class LedgerRepository {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;
}
