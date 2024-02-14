package com.example.policynaveen.dao;

import com.example.policynaveen.entity.Coverage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Coveragedaoimpl implements Coveragedao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Coverage addcoverage(Coverage coverage) {
        return entityManager.merge(coverage);
    }

    @Override
    public List<Coverage> getallcoverage() {
        TypedQuery<Coverage> typedQuery = entityManager.createQuery("from Coverage ", Coverage.class);
        List<Coverage> coverages = typedQuery.getResultList();
        return coverages;
    }

    @Override
    public Coverage getcoverage(int id) {
        return entityManager.find(Coverage.class, id);
    }

    @Override
    public Coverage updatecoverage(Coverage coverage) {
        return entityManager.merge(coverage);
    }

    @Override
    public Coverage deletecoverage(int id) {
        Coverage coverage = entityManager.find(Coverage.class, id);
        entityManager.remove(coverage);
        return coverage;
    }
}
