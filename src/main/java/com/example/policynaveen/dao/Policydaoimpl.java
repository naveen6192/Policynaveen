package com.example.policynaveen.dao;

import com.example.policynaveen.entity.Policy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Policydaoimpl implements Policydao {
    private EntityManager entityManager;

    Policydaoimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Policy addpolicy(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public List<Policy> getallpolicy() {
        TypedQuery<Policy> typedQuery = entityManager.createQuery("from Policy", Policy.class);
        List<Policy> policies = typedQuery.getResultList();
        return policies;
    }

    @Override
    public Policy getpolicy(int id) {
        return entityManager.find(Policy.class, id);
    }

    @Override
    public Policy updatepolicy(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public Policy deletepolicy(int id) {
        Policy policy = entityManager.find(Policy.class, id);
        entityManager.remove(policy);
        return policy;
    }


}
