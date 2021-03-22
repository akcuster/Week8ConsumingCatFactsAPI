package com.acuster.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatFactDaoTest {

    @Test
    void getCatFactSuccess() {
        CatFactDao dao = new CatFactDao();
        assertEquals("In an average year, cat owners in the United States spend over $2 billion on cat food.", dao.getCatFact());
    }
}